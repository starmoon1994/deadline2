package web.model;

import java.util.Date;

/**
 * 天气实体
 * Created by huxingyue on 2017/10/3.
 */
public class WeatherPojo
{
    private int id;
    private String city_name;
    private String city_country;
    private String city_path;
    private String city_timezone;
    private String city_timezone_offset;
    private String weather_temperature;
    private String weather_text;
    private int weather_code;
    private Date last_update;
    private Date create_time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getCity_country() {
        return city_country;
    }

    public void setCity_country(String city_country) {
        this.city_country = city_country;
    }

    public String getCity_path() {
        return city_path;
    }

    public void setCity_path(String city_path) {
        this.city_path = city_path;
    }

    public String getCity_timezone() {
        return city_timezone;
    }

    public void setCity_timezone(String city_timezone) {
        this.city_timezone = city_timezone;
    }

    public String getCity_timezone_offset() {
        return city_timezone_offset;
    }

    public void setCity_timezone_offset(String city_timezone_offset) {
        this.city_timezone_offset = city_timezone_offset;
    }

    public String getWeather_temperature() {
        return weather_temperature;
    }

    public void setWeather_temperature(String weather_temperature) {
        this.weather_temperature = weather_temperature;
    }

    public String getWeather_text() {
        return weather_text;
    }

    public void setWeather_text(String weather_text) {
        this.weather_text = weather_text;
    }

    public int getWeather_code() {
        return weather_code;
    }

    public void setWeather_code(int weather_code) {
        this.weather_code = weather_code;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}
