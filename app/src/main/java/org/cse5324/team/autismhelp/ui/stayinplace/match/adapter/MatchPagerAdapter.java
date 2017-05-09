package org.cse5324.team.autismhelp.ui.stayinplace.match.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import org.cse5324.team.autismhelp.R;

/**
 * Created by subin on 4/15/2017.
 */

public class MatchPagerAdapter extends PagerAdapter{

    private Context mContext;

    public MatchPagerAdapter(Context context) {
        mContext = context;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContext);

        if(position==0) {
            imageView.setImageResource(R.drawable.ic_bicycle);
        }else if(position==1) {
            imageView.setImageResource(R.drawable.ic_xylophone);
        }else if(position==2) {
            imageView.setImageResource(R.drawable.ic_wooden_horse);
        }else{
            imageView.setImageResource(R.drawable.ic_tower);
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
    public int getCount() {
        return 4;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}
