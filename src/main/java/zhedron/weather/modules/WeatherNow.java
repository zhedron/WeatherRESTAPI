package zhedron.weather.modules;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@JsonAutoDetect (fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class WeatherNow {
    @JsonProperty ("weather")
    private  List<Weather> weather;

    @JsonProperty ("main")
    private Main main;

    @JsonProperty ("wind")
    private Wind wind;

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }
}
