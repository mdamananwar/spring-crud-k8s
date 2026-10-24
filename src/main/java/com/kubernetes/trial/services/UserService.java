package com.kubernetes.trial.services;

import com.kubernetes.trial.entity.User;
import com.kubernetes.trial.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity<?> user(User user){
        user = this.userRepository.save(user);
        return ResponseEntity.ok(user);
    }
}
