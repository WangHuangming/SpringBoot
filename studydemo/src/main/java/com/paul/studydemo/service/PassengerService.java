package com.paul.studydemo.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paul.studydemo.pojo.Passenger;
import com.paul.studydemo.pojo.dto.PassengerDto;
import com.paul.studydemo.repository.PassengerRepository;

@Service
public class PassengerService implements IPassengerService {

    @Autowired
    PassengerRepository passengerRepository;

    @Override
    public Passenger insertPassenger(PassengerDto passengerDto) {
        Passenger passenger = new Passenger();
        BeanUtils.copyProperties(passengerDto, passenger);
        return passengerRepository.save(passenger);
    }

    @Override
    public Passenger getPassenger(Integer passengerId) {
        return passengerRepository.findById(passengerId).orElseThrow(()->{
            throw new RuntimeException("Passenger not found");
        });

    }

    @Override
    public List<Passenger> getAllPassenger() {
        return (List<Passenger>) passengerRepository.findAll();
    }
    
    @Override
    public Passenger updatePassenger(PassengerDto passengerDto) {
        Passenger passenger = new Passenger();
        BeanUtils.copyProperties(passengerDto, passenger);
        return passengerRepository.save(passenger);
    }

    @Override
    public void deletePassenger(Integer passengerId) {
        passengerRepository.deleteById(passengerId);
    }
}
