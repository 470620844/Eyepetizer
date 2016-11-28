package me.racofix.open.presenter;


import com.meikoz.core.base.BaseView;
import com.meikoz.core.model.annotation.Implement;

import me.racofix.open.model.HomeBean;
import retrofit2.Response;

/**
 * Author: 码农小阿新
 * Date: 2016/9/18
 * Github: https://github.com/racofix
 */
@Implement(HomeLogicImpl.class)
public interface HomeLogicI {
    void onLoadHomeData2Remote();
}
