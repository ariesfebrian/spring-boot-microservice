package id.induction.spring.boot.busservice.service.impl;

import id.induction.spring.boot.busservice.model.entity.Bus;
import id.induction.spring.boot.busservice.repository.BusRepository;
import id.induction.spring.boot.busservice.service.BusService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusServiceImpl implements BusService {

    private final BusRepository busRepository;

    public BusServiceImpl(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    @Override
    public Optional<Bus> findByPassengerId(String passengerId) {
        return busRepository.findByPassengerId(passengerId);
    }

    @Override
    public List<Bus> findAll() {
        return busRepository.findAll();
    }
}
