package id.induction.spring.boot.busservice.repository;

import id.induction.spring.boot.busservice.model.entity.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BusRepository extends JpaRepository<Bus, String> {

    Optional<Bus> findByPassengerId(String passengerId);
}
