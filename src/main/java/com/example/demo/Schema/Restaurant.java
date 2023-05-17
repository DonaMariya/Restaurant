package com.example.demo.Schema;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Restaurant")
public class Restaurant {
    @Id
    private Long id;
    private String name;

}
