package me.racofix.open.presenter;

import com.meikoz.core.base.BasePresenter;

import me.racofix.open.api.ApiInterface;
import me.racofix.open.model.DiscoveryBean;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @User: 蜡笔小新
 * @date: 16-11-28
 * @GitHub: https://github.com/meikoz
 */

public class DiscoveryLogicImpl extends BasePresenter<DataView> implements DiscoveryLogicI {

    @Override
    public void onLoadDiscovery2Remote() {
        ApiInterface.ApiFactory.createApi().onDiscoveryData2Api().enqueue(new Callback<DiscoveryBean>() {
            @Override
            public void onResponse(Call<DiscoveryBean> call, Response<DiscoveryBean> response) {
                getView().successful(response);
            }

            @Override
            public void onFailure(Call<DiscoveryBean> call, Throwable t) {

            }
        });
    }
}
