package com.example.test;

import com.example.test.model.Control;
import com.example.test.model.ManualControl;
import com.example.test.model.TempHumi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    // 온습도
    @GET("view")
    Call<TempHumi> getTempHumi();

    // 자동제어 on/off
    @GET("android/setpower/")
    Call<Control> getAutoControl(@Query("power") int power);

    // 수동제어 (전, 후, 좌, 우)
    @GET("android/setmanual/")
    Call<ManualControl> getManualControl(@Query("manual") int manual);

}
