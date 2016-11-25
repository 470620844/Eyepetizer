package me.racofix.open.presenter;

import com.meikoz.core.base.BasePresenter;

import me.racofix.open.api.ApiInterface;
import me.racofix.open.model.HomeBean;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Author: 码农小阿新
 * Date: 2016/9/18
 * Github: https://github.com/racofix
 */
public class DiscoveryLogicImpl extends BasePresenter<DiscoveryLogicI.DiscoveryView> implements DiscoveryLogicI {

    @Override
    public void onLoadHomeData2Remote() {
        ApiInterface.ApiFactory.createApi().onCategoryData2Api().enqueue(new Callback<HomeBean>() {
            @Override
            public void onResponse(Call<HomeBean> call, Response<HomeBean> response) {
                getView().onResponse(response.body());
            }

            @Override
            public void onFailure(Call<HomeBean> call, Throwable t) {

            }
        });
    }
}
