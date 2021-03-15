package id.induction.spring.boot.passengerservice.repository;

import id.induction.spring.boot.passengerservice.model.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, String> {
}
