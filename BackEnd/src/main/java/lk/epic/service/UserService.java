package lk.epic.service;

import lk.epic.dto.UserDTO;

import java.util.ArrayList;

public interface UserService {
    void addUser(UserDTO dto);
    void updateUser(UserDTO dto);
    void deleteUser(String id);

    UserDTO findByUserName(String username);

    String getLastUserId();

    ArrayList<UserDTO> getAllUsers();
}
