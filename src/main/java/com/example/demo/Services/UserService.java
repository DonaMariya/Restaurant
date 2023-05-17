package com.example.demo.Services;

import com.example.demo.Repository.RestaurantRepo;
import com.example.demo.Schema.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {

    private RestaurantRepo.UserRepository userRepository;
//    public UserService(RestaurantRepo.UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
//                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
    }
    public User createUser(User user) {
        return userRepository.save(user);
    }
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}