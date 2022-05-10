package spotyfy.security.Controllers.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spotyfy.security.Controllers.Repositories.SongRepository;
import spotyfy.security.Model.Song;

@Service
public class SongService {
    @Autowired
    private SongRepository sr;

    public List<Song> getSongs() {
        return sr.findAll();
    }

    public Song getSong(long id) {
        return sr.getById(id);
    }

    public List<Song> getSongByName(String name){
        return sr.findAllByName(name);
    }
}
