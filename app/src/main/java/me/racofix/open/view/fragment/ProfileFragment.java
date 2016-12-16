package me.racofix.open.view.fragment;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import butterknife.Bind;
import me.racofix.open.R;
import me.racofix.open.utils.GlideCircleTransform;
import me.racofix.open.view.WrapperBaseFragment;

/**
 * Created by xiaoxin on 2016/12/16.
 */

public class ProfileFragment extends WrapperBaseFragment {
    @Bind(R.id.iv_avatar_icon)
    ImageView mAvatarIcon;

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_profile;
    }

    @Override
    protected void onInitView(Bundle savedInstanceState) {
        Glide.with(getActivity()).load(R.drawable.ic_avatar_meiko).transform(new GlideCircleTransform(getActivity())).into(mAvatarIcon);
    }
}
