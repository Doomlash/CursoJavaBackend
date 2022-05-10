package spotyfy.security.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class Playlist {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String owner;

    @ManyToMany
    @JoinTable(
        name = "song_playlist",
        joinColumns = @JoinColumn(name = "playlist_dni"), 
        inverseJoinColumns = @JoinColumn(name = "song_id"))
    private List<Song> songs;
}
