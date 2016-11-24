package me.racofix.open;

import com.meikoz.core.MainApplication;
import com.meikoz.core.api.RestApi;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;


public class BaseApp extends MainApplication {

    @Override
    public void onCreate() {
        RestApi.getInstance().deBug(true);
        super.onCreate();
    }
}
