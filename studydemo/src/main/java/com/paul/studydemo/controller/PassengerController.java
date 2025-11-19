package com.paul.studydemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.paul.studydemo.pojo.Passenger;
import com.paul.studydemo.pojo.ResponseMessage;
import com.paul.studydemo.pojo.dto.PassengerDto;
import com.paul.studydemo.service.IPassengerService;

@RestController
@RequestMapping("/passenger")
public class PassengerController {


    IPassengerService passengerService;

    @Autowired
    public void setPassengerService(IPassengerService passengerService) {
        this.passengerService = passengerService;
    }

    @PostMapping
    public ResponseMessage<Passenger> insertPassenger(@Validated @RequestBody PassengerDto passengerDto) {
        Passenger newPassenger =passengerService.insertPassenger(passengerDto);        

        return ResponseMessage.success(newPassenger);
    }

    @GetMapping("/{passengerId}")
    public ResponseMessage<Passenger> getPassenger(@PathVariable Integer passengerId) {
        Passenger passenger = passengerService.getPassenger(passengerId);
        return ResponseMessage.success(passenger);
    }

    @GetMapping
    public ResponseMessage<List<Passenger>> getAllPassenger() {
        List<Passenger> passengers = passengerService.getAllPassenger();
        return ResponseMessage.success(passengers);
    }

    @PutMapping
    public ResponseMessage<Passenger> updatePassenger(@Validated @RequestBody PassengerDto passengerDto) {
        Passenger passenger = passengerService.updatePassenger(passengerDto);
        return ResponseMessage.success(passenger);
    }
    
    @DeleteMapping("/{passengerId}")
    public ResponseMessage<Passenger> deletePassenger(@PathVariable Integer passengerId) {
        passengerService.deletePassenger(passengerId);
        return ResponseMessage.success();
    }
}
