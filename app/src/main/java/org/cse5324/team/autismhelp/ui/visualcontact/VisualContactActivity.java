package org.cse5324.team.autismhelp.ui.visualcontact;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import org.cse5324.team.autismhelp.R;
import org.cse5324.team.autismhelp.ui.BaseActivity;




public class VisualContactActivity extends BaseActivity {
    GridView gridview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visual_contact);
        setTitle("Visual Contact");
        gridview = (GridView) findViewById(R.id.gridview_visualActivity);
        VisualContactGridAdapter visualGridAdapter = new VisualContactGridAdapter(this);
        gridview.setAdapter(visualGridAdapter);
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch (position) {
                    case 0:
                        intent = new Intent(VisualContactActivity.this, Toy.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(VisualContactActivity.this, Cookie.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(VisualContactActivity.this, Juice.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(VisualContactActivity.this, Ball.class);
                        startActivity(intent);
                        break;
                }
            }
        });

    }
}
