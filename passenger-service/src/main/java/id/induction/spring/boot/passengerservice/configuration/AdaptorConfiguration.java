package id.induction.spring.boot.passengerservice.configuration;

import lombok.extern.log4j.Log4j2;
import org.apache.http.Header;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.NoConnectionReuseStrategy;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@Configuration
public class AdaptorConfiguration {

    @Value("${integration.bus.connect-timeout}")
    private Integer busConnectionTimeout;

    @Value("${integration.bus.read-timeout}")
    private Integer busReadTimeout;

    @Bean(name = "busRestTemplate")
    public RestTemplate busRestTemplate() {
        List<Header> headerList = Collections.singletonList(new BasicHeader("Connection", "close"));

        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
        httpClientBuilder.disableAutomaticRetries();
        httpClientBuilder.setDefaultHeaders(headerList);
        httpClientBuilder.setConnectionReuseStrategy(NoConnectionReuseStrategy.INSTANCE);

        return new RestTemplateBuilder()
                .requestFactory(() -> new HttpComponentsClientHttpRequestFactory(httpClientBuilder
                        .setDefaultRequestConfig(RequestConfig
                                .custom()
                                .setConnectTimeout(busConnectionTimeout)
                                .setConnectionRequestTimeout(busConnectionTimeout)
                                .setSocketTimeout(busReadTimeout)
                                .build())
                        .build()))
                .build();
    }
}
