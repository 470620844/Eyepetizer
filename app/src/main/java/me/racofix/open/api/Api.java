package me.racofix.open.api;

import com.meikoz.core.api.RestApi;

/**
 * Created by zjl on 16-9-12.
 */
public class Api {

    // create service single
    public static ApiService createApi() {
        return RestApi.getInstance().create(ApiService.class);
    }
}
