package com.example.demo.Schema;

import javax.persistence.*;

@Entity
    @Table(name = "User")
    public class User {
        @Id
       // @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;

    }

