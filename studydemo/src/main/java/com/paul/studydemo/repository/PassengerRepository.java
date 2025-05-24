package com.paul.studydemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.paul.studydemo.pojo.Passenger;

@Repository
public interface PassengerRepository extends CrudRepository<Passenger, Integer> {
    // This interface will automatically provide CRUD operations for the Passenger entity
    // You can add custom query methods here if needed

}
