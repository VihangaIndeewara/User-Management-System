package lk.epic.controller;

import lk.epic.dto.UserDTO;
import lk.epic.service.UserService;
import lk.epic.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    UserService service;


    @PostMapping
    public ResponseUtil saveUser(@ModelAttribute UserDTO dto){
        service.addUser(dto);
        return new ResponseUtil("200","Saved Successfully",null);
    }

    @PutMapping
    public ResponseUtil updateUser(@RequestBody UserDTO dto){
        service.updateUser(dto);
        return new ResponseUtil("200","Updated Successfully",null);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteUser(String id ){
        service.deleteUser(id);
        return new ResponseUtil("200","Deleted Successfully",null);
    }

    @GetMapping
    public ResponseUtil getAllUsers(){
        ArrayList<UserDTO> allUsers = service.getAllUsers();
        return new ResponseUtil("200","Success",allUsers);
    }


    @GetMapping(params = {"username"})
    public  ResponseUtil findByUserName(@RequestParam String username){
        UserDTO user = service.findByUserName(username);
        return new ResponseUtil("200","Success",user);
    }

    @GetMapping(params={"test"})
    public ResponseUtil getLastUserId(){
        String lastUserId = service.getLastUserId();
        return  new ResponseUtil("200","Success",lastUserId);
    }




}
