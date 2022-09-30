package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.model.dto.UserDto;
import com.example.demo.model.request.CreateUserReq;
import com.example.demo.model.request.UpdateUserReq;
import javassist.NotFoundException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public UserDto createUser(CreateUserReq req);
    public List<UserDto> getListUser();
    public UserDto getUserById(int id) throws NotFoundException;
    public UserDto updateUser(UpdateUserReq updateUserReq, int id) throws NotFoundException;

    public void deleteUser(int id) throws NotFoundException;

    public List<User> search(String keyword);
}
