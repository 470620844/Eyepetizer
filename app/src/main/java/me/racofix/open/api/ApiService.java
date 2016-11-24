package me.racofix.open.api;

import me.racofix.open.model.HomeBean;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by zjl on 16-9-12.
 */
public interface ApiService {
    String BASE_URL = "http://baobab.kaiyanapp.com/api/";
    String defaultUrl = "?udid=3aab4c0bab4d49f4ba4ebc3399f1a5493a38f77b&vc=144&deviceModel=Nexus%205";

    // 每日精选
    @GET("v3/tabs/selected")
    Call<HomeBean> onHomeDataStore2Api();

    // 发现
    @GET("v3/tabs/selected" + defaultUrl)
    Call<HomeBean> onCategoryData2Api();
//    // 发现
//    @GET("v3/discovery")
//    Call<HomeBean> onCategoryData2Api();

}
