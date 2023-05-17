package com.example.demo.Repository;

import com.example.demo.Schema.Orders;
import com.example.demo.Schema.Restaurant;
import com.example.demo.Schema.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.Order;

public class RestaurantRepo {

    public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {
    }

    public interface UserRepository extends CrudRepository<User, Long> {
    }

    public interface OrderRepository extends CrudRepository<Orders, Long> {
    }

}