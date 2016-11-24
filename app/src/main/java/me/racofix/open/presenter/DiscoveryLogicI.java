package me.racofix.open.presenter;


import com.meikoz.core.base.BaseView;
import com.meikoz.core.model.annotation.Implement;

import me.racofix.open.model.Discovery;
import me.racofix.open.model.HomeBean;

/**
 * Author: 码农小阿新
 * Date: 2016/9/18
 * Github: https://github.com/racofix
 */
@Implement(DiscoveryLogicImpl.class)
public interface DiscoveryLogicI {
    void onLoadHomeData2Remote();

    interface DiscoveryView extends BaseView {
        void onResponse(HomeBean body);
    }
}
