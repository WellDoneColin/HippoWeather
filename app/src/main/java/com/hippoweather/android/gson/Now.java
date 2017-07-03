package com.hippoweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by colin on 2017/7/1.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
