package lk.epic.service.impl;

import lk.epic.dto.UserDTO;
import lk.epic.entity.User;
import lk.epic.repo.UserRepo;
import lk.epic.service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo repo;

    @Autowired
    ModelMapper mapper;


    @Override
    public void addUser(UserDTO dto) {
        if(repo.existsById(dto.getUserId())){
             throw new RuntimeException("User Id "+dto.getUserId()+" Already Exists");
        }
        User entity = mapper.map(dto, User.class);

        repo.save(entity);
    }

    @Override
    public void updateUser(UserDTO dto) {
        if(!repo.existsById(dto.getUserId())){
            throw new RuntimeException("User Id" +dto.getUserId()+" Not Available");

        }



        User entity = mapper.map(dto, User.class);
        repo.save(entity);
    }

    @Override
    public void deleteUser(String id) {
        if(!repo.existsById(id)){
            throw new RuntimeException("User Id "+id+" Not Available");
        }
        repo.deleteById(id);
    }


    @Override
    public UserDTO findByUserName(String username) {
        User data = repo.findByUserName(username);
        return mapper.map(data, UserDTO.class);
    }

    @Override
    public String getLastUserId() {
        String lastUserId = repo.getLastUserId();
        return lastUserId;
    }


    @Override
    public ArrayList<UserDTO> getAllUsers() {

        List<User> all= repo.findAll();
        return mapper.map(all,new TypeToken<ArrayList<UserDTO>>(){}.getType());

    }
}
