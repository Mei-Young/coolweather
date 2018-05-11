package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by YangXiaoweng on 2018/5/11.
 */

public class City extends DataSupport {

    private int id;
    private String cityName;
    private int cityCode;
    private int provinId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinId() {
        return provinId;
    }

    public void setProvinId(int provinId) {
        this.provinId = provinId;
    }
}
