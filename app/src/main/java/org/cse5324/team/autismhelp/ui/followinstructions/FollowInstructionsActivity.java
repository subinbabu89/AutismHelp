package org.cse5324.team.autismhelp.ui.followinstructions;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import org.cse5324.team.autismhelp.R;
import org.cse5324.team.autismhelp.ui.BaseActivity;

public class FollowInstructionsActivity extends BaseActivity {

    GridView gridview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_follow_instructions);
        setTitle("Follow Instructions");
        gridview = (GridView) findViewById(R.id.gridview_followInstructions);
        FollowInstructionsGridAdapter followInstructionsGridAdapter = new FollowInstructionsGridAdapter(this);
        gridview.setAdapter(followInstructionsGridAdapter);
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent;
        switch (position){
            case 0:
                intent = new Intent(FollowInstructionsActivity.this, Brush.class);
                startActivity(intent);
                break;
            case 1:
                intent = new Intent(FollowInstructionsActivity.this, Shower.class);
                startActivity(intent);
                break;
            case 2:
                intent = new Intent(FollowInstructionsActivity.this, Eat.class);
                startActivity(intent);
                break;

            }
        }
        });
    }

}