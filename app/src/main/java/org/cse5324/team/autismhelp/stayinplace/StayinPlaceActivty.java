package org.cse5324.team.autismhelp.stayinplace;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import org.cse5324.team.autismhelp.BaseActivity;
import org.cse5324.team.autismhelp.R;
import org.cse5324.team.autismhelp.stayinplace.adapter.StayinPlaceGridAdapter;
import org.cse5324.team.autismhelp.stayinplace.buildtower.BuildTowerActivity;
import org.cse5324.team.autismhelp.stayinplace.match.MatchActivity;
import org.cse5324.team.autismhelp.stayinplace.puzzle.PuzzleActivity;
import org.cse5324.team.autismhelp.stayinplace.trace.TraceActivity;

public class StayinPlaceActivty extends BaseActivity {

    GridView gridview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stayin_place_activty);
        setTitle("Stay in Place");
        gridview = (GridView) findViewById(R.id.gridview);
        StayinPlaceGridAdapter stayinPlaceGridAdapter = new StayinPlaceGridAdapter(this);
        gridview.setAdapter(stayinPlaceGridAdapter);
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch (position) {
                    case 0:
                        intent = new Intent(StayinPlaceActivty.this, PuzzleActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(StayinPlaceActivty.this, TraceActivity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(StayinPlaceActivty.this, MatchActivity.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(StayinPlaceActivty.this, BuildTowerActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}
