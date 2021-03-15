package id.induction.spring.boot.passengerservice.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class BusResponse implements Serializable {

    private String busId;

    private String busName;

    private String busNumber;

    private String passengerId;
}
