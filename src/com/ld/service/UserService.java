package com.ld.service;

import java.util.List;

import com.ld.model.Manager;


public interface UserService {
    int getStudent(String username,String password);
    List<Manager> getManager(String username,String password);
}
