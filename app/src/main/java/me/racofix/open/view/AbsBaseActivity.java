package me.racofix.open.view;

import android.content.Context;
import com.meikoz.core.base.BaseActivity;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public abstract class AbsBaseActivity extends BaseActivity {

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
