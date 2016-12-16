package me.racofix.open.view.fragment;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android.slip.SwipeViewPager;
import com.meikoz.core.adapter.RecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import me.racofix.open.R;
import me.racofix.open.model.DiscoveryBean;
import me.racofix.open.presenter.DataView;
import me.racofix.open.presenter.DiscoveryLogicI;
import me.racofix.open.presenter.DiscoveryLogicImpl;
import me.racofix.open.view.WrapperBaseFragment;
import me.racofix.open.view.adapter.DiscoveryAdapter;
import retrofit2.Response;

/**
 * @User: 蜡笔小新
 * @date: 16-11-28
 * @GitHub: https://github.com/meikoz
 */

public class DiscoveryFragment extends WrapperBaseFragment implements DataView<DiscoveryBean> {

    @Bind(R.id.discovery_recycler_view)
    RecyclerView mRecyclerView;

    @Bind(R.id.swip_viewpage)
    SwipeViewPager mSwipeView;

    //    private List<DiscoveryBean.ItemListBean<DataBean>> mViewpagerData = new ArrayList<>();
    private List<DiscoveryBean.ItemListBean> mDiscoveryData = new ArrayList<>();
    private RecyclerAdapter mAdapter;

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_discovery;
    }

    @Override
    protected void onInitView(Bundle savedInstanceState) {
        GridLayoutManager manager = new GridLayoutManager(getActivity(), 2);
        mRecyclerView.setLayoutManager(manager);
        mAdapter = new DiscoveryAdapter(getActivity(), R.layout.item_content_vertical, mDiscoveryData);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    protected Class getLogicClazz() {
        return DiscoveryLogicI.class;
    }

    @Override
    protected void onInitData2Remote() {
        super.onInitData2Remote();
        ((DiscoveryLogicImpl) mPresenter).onLoadDiscovery2Remote();
    }

    @Override
    public void successful(Response<DiscoveryBean> body) {
//        mViewpagerData.clear();
        DiscoveryBean discoveryBean = body.body();

        List<DiscoveryBean.ItemListBean> list = discoveryBean.getItemList();
        mDiscoveryData.addAll(list);
        mAdapter.notifyDataSetChanged();
   /*     for (int i = 0; i < discoveryBean.getItemList().size(); i++) {
            DiscoveryBean.ItemListBean bean = discoveryBean.getItemList().get(i);
            if (i == 0) {
//                DiscoveryBean.ItemListBean pagerData = (DiscoveryBean.ItemListBean) bean.getData();
//                mViewpagerData.add(pagerData);
//                CustomViewPageAdapter adapter = new CustomViewPageAdapter(getActivity(), mViewpagerData);
//                mSwipeView.updateIndicatorView(mViewpagerData.size());
//                mSwipeView.setAdapter(adapter);
//                mSwipeView.startScorll();
            } else if (i > 3) {
                mDiscoveryData.add(bean);
                mAdapter.notifyDataSetChanged();
            }
        }*/
    }
}
