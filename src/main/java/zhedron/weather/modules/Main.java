package zhedron.weather.modules;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Main {
    private int temp;

    @JsonProperty ("feels_like")
    private int feelslike;

    @JsonProperty ("temp_min")
    private int tempmin;

    @JsonProperty ("temp_max")
    private int tempmax;

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getFeelslike() {
        return feelslike;
    }

    public void setFeelslike(int feelslike) {
        this.feelslike = feelslike;
    }

    public int getTempmin() {
        return tempmin;
    }

    public void setTempmin(int tempmin) {
        this.tempmin = tempmin;
    }

    public int getTempmax() {
        return tempmax;
    }

    public void setTempmax(int tempmax) {
        this.tempmax = tempmax;
    }
}
