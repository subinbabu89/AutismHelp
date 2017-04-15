package org.cse5324.team.autismhelp.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import org.cse5324.team.autismhelp.R;
import org.cse5324.team.autismhelp.ui.BaseActivity;
import org.cse5324.team.autismhelp.ui.expressintentions.ExpressIntentionsActivity;
import org.cse5324.team.autismhelp.ui.followinstructions.FollowInstructionsActivity;
import org.cse5324.team.autismhelp.ui.help.HelpActivity;
import org.cse5324.team.autismhelp.ui.imitation.ImitationActivity;
import org.cse5324.team.autismhelp.ui.main.adapter.MainGridAdapter;
import org.cse5324.team.autismhelp.ui.stayinplace.StayinPlaceActivty;
import org.cse5324.team.autismhelp.ui.visualcontact.VisualContactActivity;

public class MainActivity extends BaseActivity {

    GridView gridview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridview = (GridView)findViewById(R.id.gridview);
        MainGridAdapter mainGridAdapter = new MainGridAdapter(this);
        gridview.setAdapter(mainGridAdapter);
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch (position){
                    case 0:
                        intent = new Intent(MainActivity.this, VisualContactActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP );
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(MainActivity.this, StayinPlaceActivty.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP );
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(MainActivity.this, ImitationActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP );
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(MainActivity.this, FollowInstructionsActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP );
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(MainActivity.this, ExpressIntentionsActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP );
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(MainActivity.this, HelpActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP );
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}
