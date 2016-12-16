package me.racofix.open.view.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import me.racofix.open.R;
import me.racofix.open.model.HomeBean;
import me.racofix.open.model.SectionBean;
import me.racofix.open.presenter.DataView;
import me.racofix.open.presenter.HomeLogicI;
import me.racofix.open.presenter.HomeLogicImpl;
import me.racofix.open.view.WrapperBaseFragment;
import me.racofix.open.view.adapter.HomeRecylerAdapter;
import retrofit2.Response;

/**
 * Author: 码农小阿新
 * Date: 2016/9/18
 * Github: https://github.com/racofix
 */
public class HomeFragment extends WrapperBaseFragment implements DataView<HomeBean> {

    @Bind(R.id.category_recycler_view)
    RecyclerView mCategoryRecyclerView;

    private List<SectionBean> mSectionList = new ArrayList<>();
    private HomeRecylerAdapter mHomeAdapter;

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_home;
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
        ((HomeLogicImpl) mPresenter).onLoadHomeData2Remote();
    }

    @Override
    protected Class getLogicClazz() {
        return HomeLogicI.class;
    }

    @Override
    public void successful(Response<HomeBean> response) {
        if (response != null) {
            mSectionList.clear();
            List<SectionBean> list = response.body().getSectionList();
            mSectionList.addAll(list);
            mHomeAdapter.notifyDataSetChanged();
        }
    }
}
