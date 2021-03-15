package id.induction.spring.boot.passengerservice.service.impl;

import id.induction.spring.boot.passengerservice.adaptor.BusAdaptor;
import id.induction.spring.boot.passengerservice.model.entity.Passenger;
import id.induction.spring.boot.passengerservice.model.response.BusResponse;
import id.induction.spring.boot.passengerservice.repository.PassengerRepository;
import id.induction.spring.boot.passengerservice.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PassengerServiceImpl implements PassengerService {

    @Autowired
    private PassengerRepository passengerRepository;

    @Autowired
    private BusAdaptor busAdaptor;

    @Override
    public List<Passenger> listAll() {
        return passengerRepository.findAll();
    }

    @Override
    public Optional<Passenger> findById(String id) {
        return passengerRepository.findById(id);
    }

    @Override
    public BusResponse findBusByPassengerId(String passengerId) {
        return busAdaptor.busByPassengerId(passengerId);
    }

    @Override
    public List<BusResponse> listAllBus() {
        return busAdaptor.listBusAll();
    }
}
