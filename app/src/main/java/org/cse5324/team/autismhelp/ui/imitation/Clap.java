package org.cse5324.team.autismhelp.ui.imitation;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.cse5324.team.autismhelp.R;
import org.cse5324.team.autismhelp.ui.BaseActivity;

public class Clap extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clap);
        setTitle("Clap");
        Button one = (Button)this.findViewById(R.id.button1);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.clap);
        one.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp.start();
            }
        });
    }
}
