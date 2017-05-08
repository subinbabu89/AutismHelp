package org.cse5324.team.autismhelp.ui.visualcontact;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.cse5324.team.autismhelp.R;

public class Toy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toy);
        Button one = (Button)this.findViewById(R.id.button1);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.toy);
        one.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp.start();
            }
        });
    }
}
