package com.paul.studydemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.paul.studydemo.pojo.Passenger;
import com.paul.studydemo.pojo.dto.PassengerDto;

@Service
public interface IPassengerService {
    /**
     * Insert a new passenger
     * @param passengerDto
     * @return Passenger
     */
    Passenger insertPassenger(PassengerDto passengerDto);

    /**
     * Get a passenger by ID
     * @param passengerId
     * @return Passenger
     */
    Passenger getPassenger(Integer passengerId);

    /**
     * Get all passengers
     * @return List<Passenger>
     */
    List<Passenger> getAllPassenger();

    /**
     * Update a passenger
     * @param passengerDto
     * @return Passenger
     */
    Passenger updatePassenger(PassengerDto passengerDto);

    /**
     * Delete a passenger by ID
     * @param passengerId
     */
    void deletePassenger(Integer passengerId);

}
