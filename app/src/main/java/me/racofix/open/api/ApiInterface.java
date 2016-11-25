package me.racofix.open.api;

import com.meikoz.core.api.RestApi;

import me.racofix.open.model.HomeBean;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

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


    class ApiFactory {
        private static Object monitor = new Object();
        private static ApiInterface apiSingleton;

        public static ApiInterface createApi() {
            synchronized (monitor) {
                if (apiSingleton == null) {
                    apiSingleton = RestApi.getInstance().create(ApiInterface.class);
                }
                return apiSingleton;
            }
        }
    }

}
