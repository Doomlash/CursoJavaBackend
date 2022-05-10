package spotyfy.security.Controllers.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spotyfy.security.Model.Playlist;

@Repository
public interface PlaylistRepository extends JpaRepository<Playlist,Long> {
    
}
