package id.induction.spring.boot.passengerservice.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "passenger")
public class Passenger {

    @Id
    private String psgId;

    private String psgName;

    private String psgPhoneNumber;

    private String psgAddress;
}
