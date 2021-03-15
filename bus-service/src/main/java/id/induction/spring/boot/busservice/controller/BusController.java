package id.induction.spring.boot.busservice.controller;

import id.induction.spring.boot.busservice.model.entity.Bus;
import id.induction.spring.boot.busservice.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/bus")
public class BusController {

    @Autowired
    BusService busService;

    @GetMapping("/psg/{passengerId}")
    public Optional<Bus> findByPassengerId(@PathVariable String passengerId){
        return busService.findByPassengerId(passengerId);
    }

    @GetMapping("/list")
    public List<Bus> listAll(){
        return busService.findAll();
    }
}
