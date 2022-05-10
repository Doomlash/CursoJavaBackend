package spotyfy.security.Controllers.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import spotyfy.security.Model.Song;

@Repository
public interface SongRepository extends JpaRepository<Song,Long> {
    
    @Query(nativeQuery = true, value = "SELECT * FROM song WHERE song.name LIKE '%:name%'")
    public List<Song> findNameLike(@Param("name")String name);

    public List<Song> findAllByName(String name);
}
