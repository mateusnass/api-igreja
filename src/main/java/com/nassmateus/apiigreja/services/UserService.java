package com.nassmateus.apiigreja.services;

import com.nassmateus.apiigreja.domain.User;
import com.nassmateus.apiigreja.repository.UserRepository;
import com.nassmateus.apiigreja.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id) {
        return repo.findById(id).orElseThrow(() -> new ObjectNotFoundException("User not found with ID: " + id));
    }


}
