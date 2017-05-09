package org.cse5324.team.autismhelp.ui.stayinplace.buildtower;

import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.cse5324.team.autismhelp.R;
import org.cse5324.team.autismhelp.ui.BaseActivity;
import org.cse5324.team.autismhelp.ui.stayinplace.buildtower.adapter.TowerPagerAdapter;

import java.util.Timer;
import java.util.TimerTask;

public class BuildTowerActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_build_tower);
        setTitle("Build Tower");
        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(new TowerPagerAdapter(this));

        new Timer().schedule(new TimerTask() {

            @Override
            public void run() {
                viewPager.setCurrentItem(1, true);
            }
        }, 3000);
    }
}
