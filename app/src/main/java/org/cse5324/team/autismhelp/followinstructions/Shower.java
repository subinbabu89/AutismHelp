package org.cse5324.team.autismhelp.followinstructions;

import android.os.Bundle;

import org.cse5324.team.autismhelp.BaseActivity;
import org.cse5324.team.autismhelp.R;

public class Shower extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shower);
        setTitle("Shower instructions");
    }
}
