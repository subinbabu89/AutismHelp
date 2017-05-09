package org.cse5324.team.autismhelp.ui.stayinplace.puzzle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.cse5324.team.autismhelp.R;
import org.cse5324.team.autismhelp.ui.BaseActivity;
import org.cse5324.team.autismhelp.ui.stayinplace.puzzle.PuzzleView;

public class PuzzleActivity extends BaseActivity {

    /**
     * The puzzle view in this activity's view
     */
    private PuzzleView puzzleView;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_puzzle);
        setTitle("Puzzle");
        puzzleView = (PuzzleView)this.findViewById(R.id.puzzleView);

        if(bundle != null) {
            // We have saved state
            puzzleView.loadInstanceState(bundle);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);

        puzzleView.saveInstanceState(bundle);
    }


}
