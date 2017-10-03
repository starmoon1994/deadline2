package web.model;

import java.util.Date;

/**
 * 天气查询api的调用结果记录
 * Created by huxingyue on 2017/10/3.
 */
public class WeatherLogPojo {
    private int id;
    private int weather_id;
    private String api_json;
    private int result;
    private Date create_time;
}
