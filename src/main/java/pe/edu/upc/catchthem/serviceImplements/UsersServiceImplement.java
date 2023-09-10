package pe.edu.upc.catchthem.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.catchthem.entities.Users;
import pe.edu.upc.catchthem.repositories.UserRepository;
import pe.edu.upc.catchthem.serviceInterfaces.IUsersService;

import java.util.List;

@Service
public class UsersServiceImplement implements IUsersService {
    
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<Users> listar() {
        return userRepository.findAll();
    }
    public void eliminar(Long id){
        userRepository.deleteById(id);
    }
    public void insert(Users users){
        userRepository.save(users);
    }
}
