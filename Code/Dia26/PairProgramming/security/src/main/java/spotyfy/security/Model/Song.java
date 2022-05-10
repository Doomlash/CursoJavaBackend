package spotyfy.security.Model;


import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Song {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String author;
    private String genre;
    private String duration;

    @ManyToMany(mappedBy = "songs")
    private List<Playlist> playlists;

    public Song(String name, String author, String genre, String duration) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.duration = duration;
        playlists = new LinkedList<>();
    }

}
