package Wheather.service;

import Wheather.response.WeatherResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    String key ="0357992a4600de7a98b492e13db0d999";
    String url="https://api.openweathermap.org/data/2.5/weather?q={city}&appid={key}";


    RestTemplate rt = new RestTemplate();

    public WeatherResponse getWeather(String city) {
            return rt.getForObject(url, WeatherResponse.class, city, key);


    }
}
