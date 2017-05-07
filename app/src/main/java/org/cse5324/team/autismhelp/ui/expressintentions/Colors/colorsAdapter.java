package org.cse5324.team.autismhelp.ui.expressintentions.Colors;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import org.cse5324.team.autismhelp.R;

/**
 * Created by salvatore on 7.5.17.
 */

public class colorsAdapter extends BaseAdapter {
    private Integer image_id[]={

            R.mipmap.aac_me,
            R.mipmap.aac_is,
            R.mipmap.aac_what,
            R.mipmap.aac_where,
            R.mipmap.aac_you,
            R.mipmap.aac_want,
            R.mipmap.aac_like,
            R.mipmap.aac_this,
            R.mipmap.aac_good,
            R.mipmap.aac_bad,
            R.mipmap.aac_up,
            R.mipmap.aac_down,
            R.mipmap.aac_not,
            R.mipmap.aac_stop,
            R.mipmap.aac_help,
            R.mipmap.aac_more,

    };
    private Context CTX;

    public colorsAdapter(Context CTX){
        this.CTX=CTX;

    }
    @Override
    public int getCount() {
        return image_id.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView img;

        if(view==null){
            img=new ImageView(CTX);
            img.setLayoutParams(new GridView.LayoutParams(160,160));
            img.setScaleType(ImageView.ScaleType.CENTER_CROP);
            img.setPadding(8,8,8,8);

        }
        else{
            img=(ImageView) view;

        }
        img.setImageResource(image_id[i]);
        return img;
    }

}
