package me.racofix.open.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import butterknife.Bind;
import me.racofix.open.R;
import me.racofix.open.app.ImageControl;
import me.racofix.open.utils.StatusBarUtil;
import me.racofix.open.view.WrapperBaseAty;

/**
 * Author: 码农小阿新
 * Date: 2016/9/23
 * Github: https://github.com/racofix
 */
public abstract class SplashLogicAty extends WrapperBaseAty {

    @Bind(R.id.iv_launch_cover)
    ImageView mLauchCoverView;

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_splash;
    }

    @Override
    protected void onInitialization(Bundle bundle) {
        setupAnimation();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (getNextActivity2Launch() != null) {
                    startActivity2Close(getNextActivity2Launch());
                }
            }
        }, 1000);
    }

    private void setupAnimation() {
        StatusBarUtil.setTranslucentBackground(this);
        ImageControl.getInstance()
                .loadDrawable(mLauchCoverView, R.drawable.ic_launch_cover, R.anim.anim_sacle_lanuch);
    }

    private void startActivity2Close(final Class clazz) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashLogicAty.this, clazz));
                finish();
            }
        });
    }

    public abstract Class getNextActivity2Launch();
}


