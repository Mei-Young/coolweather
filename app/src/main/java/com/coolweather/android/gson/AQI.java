package com.coolweather.android.gson;

/**
 * Created by YangXiaoweng on 2018/5/12.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
