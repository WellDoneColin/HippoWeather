package com.hippoweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by colin on 2017/7/1.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String WeatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
