package id.induction.spring.boot.passengerservice.controller;

import id.induction.spring.boot.passengerservice.model.entity.Passenger;
import id.induction.spring.boot.passengerservice.model.response.BusResponse;
import id.induction.spring.boot.passengerservice.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/passenger")
public class PassengerController {

    @Autowired
    PassengerService passengerService;

    public PassengerController(PassengerService passengerService) {
        this.passengerService = passengerService;
    }

    @GetMapping("/list")
    public List<Passenger> listAll(){
        return passengerService.listAll();
    }

    @GetMapping("/{id}")
    public Optional<Passenger> findById(@PathVariable String id){
        return passengerService.findById(id);
    }

    @GetMapping("/bus/psg/{passengerId}")
    public BusResponse findBusByPassengerId(@PathVariable String passengerId){
        return passengerService.findBusByPassengerId(passengerId);
    }

    @GetMapping("/bus/list")
    public List<BusResponse> listAllBus(){
        return passengerService.listAllBus();
    }
}
