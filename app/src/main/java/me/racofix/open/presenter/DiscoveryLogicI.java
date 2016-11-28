package me.racofix.open.presenter;

import com.meikoz.core.model.annotation.Implement;

/**
 * @User: 蜡笔小新
 * @date: 16-11-28
 * @GitHub: https://github.com/meikoz
 */
@Implement(DiscoveryLogicImpl.class)
public interface DiscoveryLogicI {
    void onLoadDiscovery2Remote();
}
