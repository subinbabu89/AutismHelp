package org.cse5324.team.autismhelp.imitation;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.cse5324.team.autismhelp.BaseActivity;
import org.cse5324.team.autismhelp.R;

public class HandsToHead extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hands_to_head);
        setTitle("Hands To Head");
        Button one = (Button) this.findViewById(R.id.button1);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.handstohead);
        one.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mp.start();
            }
        });
    }
}
