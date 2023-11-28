package zhedron.weather.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import zhedron.weather.modules.WeatherNow;
import zhedron.weather.services.WeatherService;

import java.net.MalformedURLException;

@RestController
public class WeatherController {
    private final WeatherService service;

    public WeatherController(WeatherService service) {
        this.service = service;
    }

    @GetMapping ("/weather")
    public ResponseEntity<WeatherNow> weather () throws MalformedURLException {
        WeatherNow weather = service.weather();

        return new ResponseEntity<WeatherNow>(weather, HttpStatus.OK);
    }
}
