package org.cse5324.team.autismhelp.ui.expressintentions;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.cse5324.team.autismhelp.R;
import org.cse5324.team.autismhelp.ui.BaseActivity;
import org.cse5324.team.autismhelp.ui.expressintentions.Mood.MoodActivity;

import java.util.ArrayList;
import java.util.Locale;

public class ExpressIntentionsActivity extends BaseActivity {

    GridView grid_view;
    TextToSpeech t1;
    TextView disp;
    Button say;
    ArrayList<String> sentence=new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experess_intention);

        t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.US);
                }
            }
        });


        grid_view=(GridView) findViewById(R.id.express_grid);
        grid_view.setAdapter(new ImageAdapter(this));
        grid_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getBaseContext(),"You clicked on"+i,Toast.LENGTH_LONG).show();

                switch (i){
                    case 0:
                        speak_word("I");
                        speak_sentence("I");
                        break;
                    case 1:
                        speak_word("is");
                        speak_sentence("is");
                        break;
                    case 2:
                        speak_word("what");
                        speak_sentence("what");
                        break;
                    case 3:
                        speak_word("where");
                        speak_sentence("where");
                        break;
                    case 4:
                        speak_word("you");
                        speak_sentence("you");
                        break;
                    case 5:
                        speak_word("want");
                        speak_sentence("want");
                        break;
                    case 6:
                        speak_word("like");
                        speak_sentence("like");
                        break;
                    case 7:
                        speak_word("this");
                        speak_sentence("this");
                        break;
                    case 8:
                        speak_word("good");
                        speak_sentence("good");
                        break;
                    case 9:
                        speak_word("bad");
                        speak_sentence("bad");
                        break;
                    case 10:
                        speak_word("up");
                        speak_sentence("up");
                        break;
                    case 11:
                        speak_word("down");
                        speak_sentence("down");
                        break;
                    case 12:
                        speak_word("not");
                        speak_sentence("not");
                        break;
                    case 13:
                        speak_word("stop");
                        speak_sentence("stop");
                        break;
                    case 14:
                        speak_word("help");
                        speak_sentence("help");
                        break;
                    case 15:
                        speak_word("more");
                        speak_sentence("more");
                        break;
                    default:
                        speak_word("Umm");
                        break;

                }
            }
        });
        if(getIntent().hasExtra("myKey")){

            String myKey = getIntent().getStringExtra("myKey");
        }

    }

    public void speak_word(String wrd){

        t1.speak(wrd,TextToSpeech.QUEUE_FLUSH,null);
    }

    public void speak_sentence(String wrd2){
        StringBuilder b1=new StringBuilder();

        sentence.add(wrd2);
        String tosay[];
        for (String words:sentence){
            b1.append(words+'\n');

        }
        disp.setText(b1);

    }

//    public void sayit( ){
//        t1.speak(b1,TextToSpeech.QUEUE_FLUSH,null);
//    }

    private void navigateToNextScreen(){
        Intent intent = new Intent(ExpressIntentionsActivity.this, MoodActivity.class);
        intent.putExtra("myKey","subin");
        startActivity(intent);
    }
}
