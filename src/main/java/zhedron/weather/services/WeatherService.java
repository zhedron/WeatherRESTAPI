package zhedron.weather.services;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import zhedron.weather.modules.WeatherNow;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

@Service
public class WeatherService {

    public WeatherNow weather () throws MalformedURLException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        URL url = new URL("https://api.openweathermap.org/data/2.5/weather?q=Kyiv&appid=dad7f0104ffbefe495510b65d9e07aa0");

        WeatherNow weather = null;

        try {
            weather = objectMapper.readValue(url, WeatherNow.class);

          //  System.out.println(weather.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return weather;
    }
}
