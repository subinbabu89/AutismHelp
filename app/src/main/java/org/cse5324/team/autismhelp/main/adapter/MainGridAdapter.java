package org.cse5324.team.autismhelp.main.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.cse5324.team.autismhelp.R;

public class MainGridAdapter extends BaseAdapter {

    private String[] gridItems;
    private Context context;

    public MainGridAdapter(Context context) {
        this.context = context;
        gridItems = context.getResources().getStringArray(R.array.main_grid_items);
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

        ViewHolder view = (ViewHolder) inflate.getTag();
        if (view == null) {
            view = new ViewHolder();
            TextView label = (TextView) inflate.findViewById(R.id.txtv_grid_item_label);
            ImageView icon = (ImageView) inflate.findViewById(R.id.imgv_grid_item_icon);
            view.label = label;
            view.icon = icon;
            inflate.setTag(view);
        }

        view.label.setText(gridItems[position]);
        if (position == 0) {
            view.icon.setImageResource(R.drawable.ic_visual_contact);
        } else if (position == 1) {
            view.icon.setImageResource(R.drawable.ic_stay_in_place);
        } else if (position == 2) {
            view.icon.setImageResource(R.drawable.ic_imitation);
        } else if (position == 3) {
            view.icon.setImageResource(R.drawable.ic_follow_instructions);
        } else if (position == 4) {
            view.icon.setImageResource(R.drawable.ic_express_intentions);
        } else if (position == 5) {
            view.icon.setImageResource(R.drawable.ic_help);
        }
        return inflate;
    }

    private class ViewHolder {
        TextView label;
        ImageView icon;
    }
}
