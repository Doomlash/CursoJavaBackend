package springboot.main.models;

import java.util.HashMap;
import java.util.Map;

public class Anime{
    private String name, genre;
    private Map<Integer,Episode> episodes;

    public Anime(String name, String genre) {
        this.name = name;
        this.genre = genre;
        episodes = new HashMap<Integer,Episode>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Map<Integer, Episode> getEpisodes() {
        return episodes;
    }

    public void addEpisode(Episode episode) {
        episodes.put(episode.getNumber(), episode);
    }

    
    

}
