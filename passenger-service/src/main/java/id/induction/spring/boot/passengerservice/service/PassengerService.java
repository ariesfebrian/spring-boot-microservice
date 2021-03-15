package id.induction.spring.boot.passengerservice.service;

import id.induction.spring.boot.passengerservice.model.entity.Passenger;
import id.induction.spring.boot.passengerservice.model.response.BusResponse;

import java.util.List;
import java.util.Optional;

public interface PassengerService {

    List<Passenger> listAll();

    Optional<Passenger> findById(String id);

    BusResponse findBusByPassengerId(String passengerId);

    List<BusResponse> listAllBus();
}
