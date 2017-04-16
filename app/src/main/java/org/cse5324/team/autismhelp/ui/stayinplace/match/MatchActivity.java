package org.cse5324.team.autismhelp.ui.stayinplace.match;

import android.app.AlertDialog;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import org.cse5324.team.autismhelp.R;
import org.cse5324.team.autismhelp.ui.BaseActivity;
import org.cse5324.team.autismhelp.ui.stayinplace.buildtower.adapter.TowerPagerAdapter;
import org.cse5324.team.autismhelp.ui.stayinplace.match.adapter.MatchPagerAdapter;
import org.cse5324.team.autismhelp.ui.stayinplace.puzzle.Puzzle;

public class MatchActivity extends BaseActivity {

    ImageView imgv_wooden_horse,imgv_bicycle,imgv_tower,imgv_xylophone;
    int currentCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.match_pager);
        viewPager.setAdapter(new MatchPagerAdapter(this));

        viewPager.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                return true;
            }
        });

        imgv_wooden_horse = (ImageView)findViewById(R.id.imgv_wooden_horse);
        imgv_bicycle = (ImageView)findViewById(R.id.imgv_bicycle);
        imgv_tower = (ImageView)findViewById(R.id.imgv_tower);
        imgv_xylophone = (ImageView)findViewById(R.id.imgv_xylophone);

        imgv_wooden_horse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentCount==2){
                    currentCount++;
                    viewPager.setCurrentItem(currentCount, true);
                    imgv_wooden_horse.setVisibility(View.GONE);
                }
            }
        });

        imgv_bicycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentCount==0){
                    currentCount++;
                    viewPager.setCurrentItem(currentCount, true);
                    imgv_bicycle.setVisibility(View.GONE);

                }
            }
        });

        imgv_tower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentCount==3){
                    imgv_tower.setVisibility(View.GONE);
                    showCompleteMessage();
                }
            }
        });

        imgv_xylophone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentCount==1){
                    currentCount++;
                    viewPager.setCurrentItem(currentCount, true);
                    imgv_xylophone.setVisibility(View.GONE);
                }
            }
        });

    }

    private void showCompleteMessage() {

        // Instantiate a dialog box builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        // Parameterize the builder
        builder.setTitle(R.string.hurrah);
        builder.setMessage(R.string.completed_puzzle);
        builder.setPositiveButton(android.R.string.ok, null);

        // Create the dialog box and show it
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
