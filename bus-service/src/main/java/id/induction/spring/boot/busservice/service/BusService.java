package id.induction.spring.boot.busservice.service;

import id.induction.spring.boot.busservice.model.entity.Bus;

import java.util.List;
import java.util.Optional;

public interface BusService {

    Optional<Bus> findByPassengerId(String passengerId);

    List<Bus> findAll();
}
