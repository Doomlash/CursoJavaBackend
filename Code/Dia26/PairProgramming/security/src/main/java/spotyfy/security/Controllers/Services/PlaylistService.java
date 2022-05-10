package spotyfy.security.Controllers.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spotyfy.security.Controllers.Repositories.PlaylistRepository;

@Service
public class PlaylistService {
    @Autowired
    private PlaylistRepository pr;
}
