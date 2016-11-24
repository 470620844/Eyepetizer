package me.racofix.open.view.adapter;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.meikoz.core.adapter.RecyclerAdapter;
import com.meikoz.core.adapter.RecyclerViewHolder;

import java.util.List;

import me.racofix.open.R;
import me.racofix.open.model.SectionBean;

/**
 * Created by 会写代码的小新 on 2016/11/20.
 */

public class HorizontalHomeAdapter extends RecyclerAdapter<SectionBean.ItemListBean> {
    public HorizontalHomeAdapter(Context context, int layoutId, List<SectionBean.ItemListBean> datas) {
        super(context, layoutId, datas);
    }

    @Override
    public void convert(RecyclerViewHolder hepler, SectionBean.ItemListBean itemListBean) {
        if (itemListBean.getData() != null && itemListBean.getData().getCover() != null) {
            Glide.with(mContext).load(itemListBean.getData().getCover().getDetail())
                    .into((ImageView) hepler.getView(R.id.iv_home_img));
        }
    }
}
