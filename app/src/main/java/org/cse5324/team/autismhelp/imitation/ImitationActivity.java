package org.cse5324.team.autismhelp.imitation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import org.cse5324.team.autismhelp.BaseActivity;
import org.cse5324.team.autismhelp.R;

public class ImitationActivity extends BaseActivity {

    GridView gridview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imitation);
        setTitle("Imitation");
        gridview = (GridView) findViewById(R.id.gridview_imitation);
        ImitationGridAdapter imitationGridAdapter = new ImitationGridAdapter(this);
        gridview.setAdapter(imitationGridAdapter);
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch (position) {
                    case 0:
                        intent = new Intent(ImitationActivity.this, HandsUp.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(ImitationActivity.this, Clap.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(ImitationActivity.this, TouchYourFoot.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(ImitationActivity.this, Dance.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(ImitationActivity.this, HandsToHead.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }

}