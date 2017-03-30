package com.test;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/**
 * Created by tekloon on 10/01/2017.
 */

public class TestContainerView extends FrameLayout {

    private Context mContext;

    public TestContainerView(Context context) {
        super(context);
        this.mContext = context;

        ViewPager viewPager = new ViewPager(context);
        viewPager.setAdapter(new PagerAdapter() {

            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                CustomView customView = new CustomView(mContext);
                customView.setPositionText(position);
                container.addView(customView);
                return customView;
            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
                container.removeView((CustomView) object);
            }

            @Override
            public int getCount() {
                return 6;
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view == object;
            }
        });

        this.addView(viewPager);
    }

    @Override
    public void requestLayout() {
        super.requestLayout();
        post(measureAndLayout);
    }

    private final Runnable measureAndLayout = new Runnable() {
        @Override
        public void run() {
            measure(
                    MeasureSpec.makeMeasureSpec(getWidth(), MeasureSpec.EXACTLY),
                    MeasureSpec.makeMeasureSpec(getHeight(), MeasureSpec.EXACTLY));
            layout(getLeft(), getTop(), getRight(), getBottom());
        }
    };


}
