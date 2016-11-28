package me.racofix.open.view.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.meikoz.core.ui.TabStripView;
import me.racofix.open.R;
import me.racofix.open.view.fragment.DiscoveryFragment;
import me.racofix.open.view.fragment.HomeFragment;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainAty extends AppCompatActivity {

    public static void jumpTo(Activity target) {
        Intent intent = new Intent(target, MainAty.class);
        target.startActivity(intent);
        target.finish();
    }

    private TabStripView navigateTabBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigateTabBar = (TabStripView) findViewById(R.id.navigateTabBar);
        //恢复选项状态
        navigateTabBar.onRestoreInstanceState(savedInstanceState);

        navigateTabBar.addTab(HomeFragment.class,
                new TabStripView.TabParam(R.drawable.ic_tab_strip_icon_feed,
                        R.drawable.ic_tab_strip_icon_feed_selected, R.string.tab_bar_text_feed));

        navigateTabBar.addTab(HomeFragment.class,
                new TabStripView.TabParam(R.drawable.ic_tab_strip_icon_category,
                        R.drawable.ic_tab_strip_icon_category_selected, R.string.tab_bar_text_category));

        navigateTabBar.addTab(HomeFragment.class,
                new TabStripView.TabParam(R.drawable.ic_tab_strip_icon_pgc,
                        R.drawable.ic_tab_strip_icon_pgc_selected, R.string.tab_bar_text_pgc));

        navigateTabBar.addTab(HomeFragment.class,
                new TabStripView.TabParam(R.drawable.ic_tab_strip_icon_profile,
                        R.drawable.ic_tab_strip_icon_profile_selected, R.string.tab_bar_text_profile));
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //保存当前选中的选项状态
        navigateTabBar.onSaveInstanceState(outState);
    }


    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
