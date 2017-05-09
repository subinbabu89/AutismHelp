package org.cse5324.team.autismhelp.stayinplace.buildtower.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import org.cse5324.team.autismhelp.R;

public class TowerPagerAdapter extends PagerAdapter {

    private Context mContext;

    public TowerPagerAdapter(Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContext);

        if (position == 0) {
            imageView.setImageResource(R.drawable.ic_block_starting);
        } else {
            imageView.setImageResource(R.drawable.ic_block_end);
        }
        imageView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        container.addView(imageView);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}
