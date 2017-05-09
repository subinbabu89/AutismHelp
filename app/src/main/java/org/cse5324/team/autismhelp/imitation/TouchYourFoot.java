package org.cse5324.team.autismhelp.imitation;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.cse5324.team.autismhelp.BaseActivity;
import org.cse5324.team.autismhelp.R;

public class TouchYourFoot extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_touch_your_foot);
        setTitle("Touch your Toe");
        Button one = (Button) this.findViewById(R.id.button1);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.touchyourtoes);
        one.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mp.start();
            }
        });
    }
}
