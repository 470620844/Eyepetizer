package me.racofix.open.view.adapter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.meikoz.core.manage.ScreenUtil;

import java.util.List;

import me.racofix.open.R;
import me.racofix.open.model.SectionBean;

/**
 * @User: 蜡笔小新
 * @date: 16-10-14
 * @GitHub: https://github.com/meikoz
 */

public class HomeRecylerAdapter extends RecyclerView.Adapter<HomeRecylerAdapter.ViewHolder> {

    private List<SectionBean> mSectionList;
    private Context mContext;
    private int HORIZONTAL = 1;

    public HomeRecylerAdapter(Context context, List<SectionBean> sectionList) {
        this.mContext = context;
        this.mSectionList = sectionList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_home, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        conver(holder, position);
        Glide.with(mContext)
                .load("http://img.kaiyanapp.com/15d3721383eea0e3d3b7970a6083d141.jpeg?imageMogr2/quality/60")
                .into(holder.image_header_view);
    }

    private void conver(ViewHolder holder, int position) {
        List<SectionBean.ItemListBean> verticalList = mSectionList.get(position).getItemList();
        List<SectionBean.ItemListBean> horizontalList = mSectionList.get(1).getItemList().get(0).getData().getItemList();

        boolean hasHorizontal = HORIZONTAL == position;
        ViewGroup.LayoutParams layoutParams = holder.mItemListView.getLayoutParams();
        layoutParams.height = ScreenUtil.dp2px(mContext, hasHorizontal ? 240 : 200 * verticalList.size());

        LinearLayoutManager manager = new LinearLayoutManager(mContext);
        LinearLayoutManager manager1 = new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false);
        holder.mItemListView.setLayoutManager(hasHorizontal ? manager1 : manager);

        VerticalHomeAdapter verticalAdapter = new VerticalHomeAdapter(mContext,
                R.layout.item_content_home,
                verticalList);

        HorizontalHomeAdapter horizontalAdapter = new HorizontalHomeAdapter(mContext,
                R.layout.item_home_horizontal_content,
                horizontalList);

        holder.mItemListView.setAdapter(hasHorizontal ? horizontalAdapter : verticalAdapter);
    }

    @Override
    public int getItemCount() {
        return mSectionList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        RecyclerView mItemListView;
        ImageView image_header_view;

        ViewHolder(View rootView) {
            super(rootView);
            mItemListView = (RecyclerView) itemView.findViewById(R.id.itemView);
            image_header_view = (ImageView) itemView.findViewById(R.id.image_header_view);
        }
    }
}
