package me.racofix.open.view.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.meikoz.core.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import me.racofix.open.R;
import me.racofix.open.model.HomeBean;
import me.racofix.open.model.SectionBean;
import me.racofix.open.presenter.DiscoveryLogicI;
import me.racofix.open.presenter.DiscoveryLogicImpl;
import me.racofix.open.view.adapter.HomeRecylerAdapter;

/**
 * Author: 码农小阿新
 * Date: 2016/9/18
 * Github: https://github.com/racofix
 */
public class DiscoveryFragment extends BaseFragment implements DiscoveryLogicI.DiscoveryView {

    @Bind(R.id.category_recycler_view)
    RecyclerView mCategoryRecyclerView;

    private List<SectionBean> mSectionList = new ArrayList<>();
    private HomeRecylerAdapter mHomeAdapter;

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_discovery;
    }

    @Override
    protected void onInitView(Bundle savedInstanceState) {
        mHomeAdapter = new HomeRecylerAdapter(getActivity(), mSectionList);
        mCategoryRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mCategoryRecyclerView.setAdapter(mHomeAdapter);
    }

    @Override
    protected void onInitData2Remote() {
        super.onInitData2Remote();
        ((DiscoveryLogicImpl) mPresenter).onLoadHomeData2Remote();
    }

    @Override
    protected Class getLogicClazz() {
        return DiscoveryLogicI.class;
    }

    @Override
    public void onResponse(HomeBean body) {
        if (body != null) {
            mSectionList.clear();
            List<SectionBean> list = body.getSectionList();
            mSectionList.addAll(list);
            mHomeAdapter.notifyDataSetChanged();
        }
    }
}
