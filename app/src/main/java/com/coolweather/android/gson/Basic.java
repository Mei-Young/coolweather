package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by YangXiaoweng on 2018/5/12.
 */

public class Basic {
    @SerializedName("location")
    public String cityName;

    @SerializedName("cid")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}

