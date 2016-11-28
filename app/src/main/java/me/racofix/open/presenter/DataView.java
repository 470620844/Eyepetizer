package me.racofix.open.presenter;

import com.meikoz.core.base.BaseView;

import retrofit2.Response;

/**
 * @User: 蜡笔小新
 * @date: 16-11-28
 * @GitHub: https://github.com/meikoz
 */

public interface DataView<T> extends BaseView {
    void successful(Response<T> body);
}
