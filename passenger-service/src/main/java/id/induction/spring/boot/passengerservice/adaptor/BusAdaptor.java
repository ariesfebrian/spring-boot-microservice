package id.induction.spring.boot.passengerservice.adaptor;

import id.induction.spring.boot.passengerservice.model.response.BusResponse;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class BusAdaptor {

    @Value("${integration.bus.list-all.url}")
    private String busUrlListAll;

    @Value("${integration.bus.passenger.url}")
    private String busUrlPassenger;

    private RestTemplate busRestTemplate;

    public BusAdaptor(@Qualifier(value = "busRestTemplate") RestTemplate busRestTemplate) {
        this.busRestTemplate = busRestTemplate;
    }

    public BusResponse busByPassengerId(String passengerId){
        return busRestTemplate.exchange(
                busUrlPassenger + "/" + passengerId,
                HttpMethod.GET,
                null,
                BusResponse.class).getBody();
    }

    public List<BusResponse> listBusAll(){
        return busRestTemplate.exchange(
                busUrlListAll,
                HttpMethod.GET,null, new ParameterizedTypeReference<List<BusResponse>>() {}).getBody();
    }
}