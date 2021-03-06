package org.cse5324.team.autismhelp.stayinplace.puzzle;

import android.os.Bundle;

import org.cse5324.team.autismhelp.BaseActivity;
import org.cse5324.team.autismhelp.R;

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
        puzzleView = (PuzzleView) this.findViewById(R.id.puzzleView);

        if (bundle != null) {
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
