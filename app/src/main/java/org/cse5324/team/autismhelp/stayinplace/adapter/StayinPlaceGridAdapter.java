package org.cse5324.team.autismhelp.stayinplace.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.cse5324.team.autismhelp.R;

public class StayinPlaceGridAdapter extends BaseAdapter {
    private String[] gridItems;
    private Context context;

    public StayinPlaceGridAdapter(Context context) {
        this.context = context;
        gridItems = context.getResources().getStringArray(R.array.stay_in_place_grid);
    }

    @Override
    public int getCount() {
        return gridItems.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.grid_label_layout, parent, false);

        StayinPlaceGridAdapter.ViewHolder view = (StayinPlaceGridAdapter.ViewHolder) inflate.getTag();
        if (view == null) {
            view = new StayinPlaceGridAdapter.ViewHolder();
            TextView label = (TextView) inflate.findViewById(R.id.txtv_grid_item_label);
            ImageView icon = (ImageView) inflate.findViewById(R.id.imgv_grid_item_icon);
            view.label = label;
            view.icon = icon;
            inflate.setTag(view);
        }

        view.label.setText(gridItems[position]);
        if (position == 0) {
            view.icon.setImageResource(R.drawable.ic_puzzle);
        } else if (position == 1) {
            view.icon.setImageResource(R.drawable.ic_trace);
        } else if (position == 2) {
            view.icon.setImageResource(R.drawable.ic_match);
        } else if (position == 3) {
            view.icon.setImageResource(R.drawable.ic_build_tower);
        }

        return inflate;
    }

    private class ViewHolder {
        TextView label;
        ImageView icon;
    }
}
