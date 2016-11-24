package me.racofix.open.view.activity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import butterknife.Bind;
import me.racofix.open.R;
import me.racofix.open.utils.StatusBarUtil;
import me.racofix.open.view.AbsBaseActivity;

/**
 * Author: 码农小阿新
 * Date: 2016/9/23
 * Github: https://github.com/racofix
 */
public class SplashAty extends AbsBaseActivity {

    private int mLoadTime = 2000;
    @Bind(R.id.iv_splash_background)
    ImageView mImageView;

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_splash;
    }

    @Override
    protected void onInitView(Bundle savedInstanceState) {
        StatusBarUtil.setTranslucentBackground(this);
        sacleLargenView();
    }

    private void sacleLargenView() {
        Glide.with(this)
                .load(R.drawable.landing_background)
                .centerCrop()
                .animate(R.anim.sacle_largen_view)
                .into(mImageView);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                MainAty.jumpTo(SplashAty.this);
            }
        }, mLoadTime);
    }

}


