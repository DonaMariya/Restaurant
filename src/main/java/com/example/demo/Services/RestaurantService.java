package com.example.demo.Services;

import com.example.demo.Repository.RestaurantRepo;
import com.example.demo.Schema.Restaurant;
import com.example.demo.Schema.User;
import org.springframework.stereotype.Service;
//import org.springframework.boot.context.config.;

import java.util.List;
import java.util.Optional;


@Service
public class RestaurantService {
    private RestaurantRepo.RestaurantRepository restaurantRepository;
//    public RestaurantService(RestaurantRepo.RestaurantRepository restaurantRepository) {
//        this.restaurantRepository = restaurantRepository;
//    }
    public List<Restaurant> getAllRestaurants() {
        return (List<Restaurant>) restaurantRepository.findAll();
    }
    public Optional<Restaurant> getRestaurantById(Long id){
        return restaurantRepository.findById(id);






    }
    public Restaurant createRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }
    public void deleteRestaurant(Long id) {
        restaurantRepository.deleteById(id);
    }
}




