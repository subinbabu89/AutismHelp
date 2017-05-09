package org.cse5324.team.autismhelp.expressintentions;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.cse5324.team.autismhelp.R;

class ImageAdapter extends BaseAdapter {

    private String griditems[];
    private Context CTX;

    ImageAdapter(Context CTX) {
        this.CTX = CTX;
        griditems = CTX.getResources().getStringArray(R.array.expression_grid);
    }

    @Override
    public int getCount() {
        return griditems.length;
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
    public View getView(int i, View convertView, ViewGroup viewGroup) {

        View inflate = LayoutInflater.from(CTX).inflate(R.layout.grid_express_layout, null);
        ImageAdapter.ViewHolder view = (ImageAdapter.ViewHolder) inflate.getTag();
        if (view == null) {
            view = new ImageAdapter.ViewHolder();
            TextView label = (TextView) inflate.findViewById(R.id.txtv_grid_xpress);
            ImageView icon = (ImageView) inflate.findViewById(R.id.imgv_grid_xpress);
            view.label = label;
            view.icon = icon;
            inflate.setTag(view);
        }

        view.label.setText(griditems[i]);
        if (i == 0) {
            view.icon.setImageResource(R.drawable.aac_me);
        } else if (i == 1) {
            view.icon.setImageResource(R.drawable.aac_is);
        } else if (i == 2) {
            view.icon.setImageResource(R.drawable.aac_what);
        } else if (i == 3) {
            view.icon.setImageResource(R.drawable.aac_where);
        } else if (i == 4) {
            view.icon.setImageResource(R.drawable.aac_you);
        } else if (i == 5) {
            view.icon.setImageResource(R.drawable.aac_want);
        } else if (i == 6) {
            view.icon.setImageResource(R.drawable.aac_like);
        } else if (i == 7) {
            view.icon.setImageResource(R.drawable.aac_this);
        } else if (i == 8) {
            view.icon.setImageResource(R.drawable.aac_good);
        } else if (i == 9) {
            view.icon.setImageResource(R.drawable.aac_bad);
        } else if (i == 10) {
            view.icon.setImageResource(R.drawable.aac_up);
        } else if (i == 11) {
            view.icon.setImageResource(R.drawable.aac_down);
        } else if (i == 12) {
            view.icon.setImageResource(R.drawable.aac_not);
        } else if (i == 13) {
            view.icon.setImageResource(R.drawable.aac_stop);
        } else if (i == 14) {
            view.icon.setImageResource(R.drawable.aac_help);
        } else if (i == 15) {
            view.icon.setImageResource(R.drawable.aac_red);
        } else if (i == 16) {
            view.icon.setImageResource(R.drawable.aac_green);
        } else if (i == 17) {
            view.icon.setImageResource(R.drawable.aac_yelllow);
        } else if (i == 18) {
            view.icon.setImageResource(R.drawable.aac_blue);
        } else if (i == 19) {
            view.icon.setImageResource(R.drawable.aac_purple);
        } else if (i == 20) {
            view.icon.setImageResource(R.drawable.aac_pink);
        } else if (i == 21) {
            view.icon.setImageResource(R.drawable.aac_orange);
        } else if (i == 22) {
            view.icon.setImageResource(R.drawable.aac_navyblue);
        } else if (i == 23) {
            view.icon.setImageResource(R.drawable.aac_apple);
        } else if (i == 24) {
            view.icon.setImageResource(R.drawable.aac_banana);
        } else if (i == 25) {
            view.icon.setImageResource(R.drawable.aac_water);
        } else if (i == 26) {
            view.icon.setImageResource(R.drawable.aac_icecrm);
        } else if (i == 27) {
            view.icon.setImageResource(R.drawable.aac_beef);
        } else if (i == 28) {
            view.icon.setImageResource(R.drawable.aac_chicken);
        } else if (i == 29) {
            view.icon.setImageResource(R.drawable.aac_lobster);
        } else if (i == 30) {
            view.icon.setImageResource(R.drawable.aac_pie);
        } else if (i == 31) {
            view.icon.setImageResource(R.drawable.aac_happy);
        } else if (i == 32) {
            view.icon.setImageResource(R.drawable.aac_sad);
        } else if (i == 33) {
            view.icon.setImageResource(R.drawable.aac_angry);
        } else if (i == 34) {
            view.icon.setImageResource(R.drawable.aac_nervous);
        } else if (i == 35) {
            view.icon.setImageResource(R.drawable.aac_hungry);
        } else if (i == 36) {
            view.icon.setImageResource(R.drawable.aac_surprised);
        } else if (i == 37) {
            view.icon.setImageResource(R.drawable.aac_sick);
        } else if (i == 38) {
            view.icon.setImageResource(R.drawable.aac_sleepy);
        }
        return inflate;
    }

    private class ViewHolder {
        TextView label;
        ImageView icon;
    }
}
