package springboot.main.controllers;

import java.util.Collection;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springboot.main.models.Anime;
import springboot.main.models.Episode;
import springboot.main.services.AnimeService;


@RestController
@RequestMapping("/anime")
public class AnimeController {

    AnimeService aService = new AnimeService();

    @GetMapping("/getAll")
    public Collection<Anime> getAnimes()
    {
        return aService.getAnimes();
    }

    @GetMapping("/get/{name}")
    public Anime getAnimeByName(@PathVariable("name") String name)
    {
        return aService.getByName(name);
    }

    @GetMapping("/get/{anime}/{episode}")
    public Episode getEpisodeByNumber(@PathVariable("anime") String anime, @PathVariable("episode") String episode){
        return aService.getEpisodeByNumber(anime,Integer.parseInt(episode));
    }


    @DeleteMapping("/delete/{name}")
    public void delete(@PathVariable("name") String name)
    {
        aService.delete(name);
    }
    @PostMapping("/post")
    public void postAnime(@RequestParam("name") String name, String episodes, @RequestParam("genre") String genre)
    {
        aService.postAnime(name, genre);
    }

    @PostMapping("/{anime}/addEpisode")
    public void postEpisode(@RequestParam("name") String name, @RequestParam("number") String number, @PathVariable("anime") String anime) {
        aService.addEpisode(anime, name, Integer.parseInt(number)); 
    }
    
}
