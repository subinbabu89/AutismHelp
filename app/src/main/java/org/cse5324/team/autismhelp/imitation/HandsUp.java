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

public class HandsUp extends BaseActivity {

    private ImageView imgv_hands_up_gif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hands_up);
        setTitle("Hands up");

        imgv_hands_up_gif = (ImageView)findViewById(R.id.imgv_hands_up_gif);
        GlideDrawableImageViewTarget imageViewTarget = new GlideDrawableImageViewTarget(imgv_hands_up_gif);
        Glide.with(this).load(R.drawable.handsup_in).into(imageViewTarget);

        Button one = (Button) this.findViewById(R.id.button1);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.handsup);
        one.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mp.start();
            }
        });
    }
}
