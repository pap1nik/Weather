package Wheather.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Setter
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WeatherResponse {
    @JsonProperty("name")
    private String city;
    private Main main;
    private List<Weather> weather;
}


@Setter
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
    class  Main{

        private double temp;
        private double humidity;
    }
@Setter
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
class Weather{
    @JsonProperty("main")
    private  String info;
}


