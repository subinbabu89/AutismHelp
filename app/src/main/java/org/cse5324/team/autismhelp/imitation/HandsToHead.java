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

public class HandsToHead extends BaseActivity {

    private ImageView imgv_hands_head_gif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hands_to_head);
        setTitle("Hands To Head");

        imgv_hands_head_gif = (ImageView)findViewById(R.id.imgv_hands_head_gif);
        GlideDrawableImageViewTarget imageViewTarget = new GlideDrawableImageViewTarget(imgv_hands_head_gif);
        Glide.with(this).load(R.drawable.handstohead_in).into(imageViewTarget);

        Button one = (Button) this.findViewById(R.id.button1);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.handstohead);
        one.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mp.start();
            }
        });
    }
}
