package org.cse5324.team.autismhelp.ui.followinstructions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.cse5324.team.autismhelp.R;
import org.cse5324.team.autismhelp.ui.BaseActivity;

public class Eat extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat);
        setTitle("Eating instructions");
    }
}
