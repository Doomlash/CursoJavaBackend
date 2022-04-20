package springboot.main.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import springboot.main.models.Anime;
import springboot.main.models.Episode;

@Service
public class AnimeService {

    private Map<String,Anime> animes;

    public AnimeService(){
        animes = new HashMap<String,Anime>();
        animes.put("Naruto", new Anime("Naruto", "Shonen"));
        animes.put("OnePiece", new Anime("OnePiece", "Shonen"));
        animes.put("DeathNote", new Anime("DeathNote", "Seinen"));
        animes.put("LoveLive", new Anime("LoveLive", "Idols"));
        animes.get("OnePiece").addEpisode(new Episode(1, "1"));
        animes.get("OnePiece").addEpisode(new Episode(2, "2"));
        animes.get("OnePiece").addEpisode(new Episode(3, "3"));

    }

    public Collection<Anime> getAnimes() {
        return animes.values();
    }

    public Anime getByName(String name) {
        return animes.get(name);
    }

    public boolean delete(String name) {
        if(animes.remove(name)==null){
            return false;
        }
        else{
            return true;
        }
    }

    public void postAnime(String name, String genre) {
        animes.put(name, new Anime(name,genre));
    }

    public Episode getEpisodeByNumber(String anime, int episodeNumber) {
        return animes.get(anime).getEpisodes().get(episodeNumber);
    }

    public void addEpisode(String anime, String name, int number){
        
        animes.get(anime).addEpisode(new Episode(number, name));
    }



}
