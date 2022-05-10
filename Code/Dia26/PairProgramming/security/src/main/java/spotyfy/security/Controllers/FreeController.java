package spotyfy.security.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spotyfy.security.Controllers.Services.SongService;

@Controller
@RequestMapping("/free")
public class FreeController {
    @Autowired
    private SongService ss;

    @GetMapping("/songs")
    public String getSongs(Model model){
        model.addAttribute("username", "Pepito");
        model.addAttribute("songs", ss.getSongs());
        model.addAttribute("layout", "free_main");
        model.addAttribute("view", "song_view");

        return "index";
    }

    @GetMapping("/play/{id}")
    public String playSong(@PathVariable("id") long id, Model model){
        model.addAttribute("username", "Pepito");
        model.addAttribute("song", ss.getSong(id));
        model.addAttribute("layout", "free_main");
        model.addAttribute("view", "play");
        return "index";
    }

    @GetMapping("/find")
    public String findSong(@RequestParam("name") String name, Model model){
        System.out.println(name);
        model.addAttribute("username", "Pepito");
        model.addAttribute("songs", ss.getSongByName(name));
        model.addAttribute("layout", "free_main");
        model.addAttribute("view", "song_view");
        return "index";  
    }



}
