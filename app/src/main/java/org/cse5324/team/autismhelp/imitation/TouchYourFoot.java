package org.cse5324.team.autismhelp.imitation;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;

import org.cse5324.team.autismhelp.BaseActivity;
import org.cse5324.team.autismhelp.R;

public class TouchYourFoot extends BaseActivity {

    private ImageView imgv_touch_toe_gif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_touch_your_foot);
        setTitle("Touch your Toe");

        imgv_touch_toe_gif = (ImageView)findViewById(R.id.imgv_touch_toe_gif);
        GlideDrawableImageViewTarget imageViewTarget = new GlideDrawableImageViewTarget(imgv_touch_toe_gif);
        Glide.with(this).load(R.drawable.touchyourfoot_in).into(imageViewTarget);

        Button one = (Button) this.findViewById(R.id.button1);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.touchyourtoes);
        one.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mp.start();
            }
        });
    }
}
