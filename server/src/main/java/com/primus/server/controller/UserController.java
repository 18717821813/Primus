package com.primus.server.controller;

import com.primus.server.entity.User;
import com.primus.server.repository.UserRepository;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/list")
    public Iterable<User> queryUserAll() {
        return userRepository.findAll();
    }

    @RequestMapping("/add")
    public User addUser(@RequestBody User user) {
        userRepository.save(user);
        return user;
    }

    @RequestMapping("/edit")
    public User editUser(@RequestBody User user) {
        userRepository.save(user);
        return user;
    }

    @RequestMapping(value = "/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
        return;
    }
}
