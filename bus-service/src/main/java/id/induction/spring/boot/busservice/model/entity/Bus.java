package id.induction.spring.boot.busservice.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "bus")
public class Bus {
    @Id
    private String busId;

    private String busName;

    private String busNumber;

    private String passengerId;
}
