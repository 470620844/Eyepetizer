package me.racofix.open.view.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import me.racofix.open.R;

/**
 * Author: 码农小阿新
 * Date: 2016/9/24
 * Github: https://github.com/racofix
 */
public class AppBar extends RelativeLayout {

    @Bind(R.id.tv_app_title)
    TextView mAppTitle;

    @Bind(R.id.lv_title_right)
    LinearLayout mAppRightView;

    public AppBar(Context context) {
        super(context);
        onInit();
    }

    public AppBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        onInit();
    }

    public AppBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        onInit();
        TypedArray array = getContext().obtainStyledAttributes(attrs, R.styleable.AppBarView);
        if (array.getResourceId(R.styleable.AppBarView_title_text, 0)!=0){
            setTitle(array.getResourceId(R.styleable.AppBarView_title_text, 0));
        }else if(!TextUtils.isEmpty(array.getString(R.styleable.AppBarView_title_text))){
            setTitle(array.getString(R.styleable.AppBarView_title_text));
        }
    }

    private void onInit() {
        inflate(getContext(), R.layout.layout_app_bar, this);
        ButterKnife.bind(this);
    }

    public void setTitle(String message) {
        mAppTitle.setText(message);
    }

    public void setTitle(int resourceId) {
        mAppTitle.setText(resourceId);
    }

    public void addRightView(View v){
        mAppRightView.addView(v);
    }
}
