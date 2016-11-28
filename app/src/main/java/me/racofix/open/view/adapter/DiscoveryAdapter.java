package me.racofix.open.view.adapter;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.meikoz.core.adapter.RecyclerAdapter;
import com.meikoz.core.adapter.RecyclerViewHolder;

import java.util.List;

import me.racofix.open.R;
import me.racofix.open.model.DataBean;
import me.racofix.open.model.DiscoveryBean;

/**
 * @User: 蜡笔小新
 * @date: 16-11-28
 * @GitHub: https://github.com/meikoz
 */

public class DiscoveryAdapter extends RecyclerAdapter<DiscoveryBean.ItemListBean> {

    public DiscoveryAdapter(Context context, int layoutId, List<DiscoveryBean.ItemListBean> datas) {
        super(context, layoutId, datas);
    }

    @Override
    public void convert(RecyclerViewHolder hepler, DiscoveryBean.ItemListBean bean) {
        Glide.with(mContext).load(((DataBean) bean.getData()).getImage()).into((ImageView) hepler.getView(R.id.iv_home_img));
    }
}
