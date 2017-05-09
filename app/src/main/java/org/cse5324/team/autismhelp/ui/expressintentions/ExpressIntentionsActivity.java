package org.cse5324.team.autismhelp.ui.expressintentions;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.cse5324.team.autismhelp.R;
import org.cse5324.team.autismhelp.ui.BaseActivity;


import java.util.ArrayList;
import java.util.Locale;

public class ExpressIntentionsActivity extends BaseActivity {

    GridView grid_view;
    TextToSpeech t1;
    TextView disp;
    ImageButton say;
    ImageButton clr;
    ArrayList<String> sentence=new ArrayList<String>();
    String speak;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experess_intention);
        setTitle("Express Intentions");
        disp=(TextView)findViewById(R.id.disp);
        say=(ImageButton)findViewById(R.id.aac_speak);
        clr=(ImageButton)findViewById(R.id.aac_clear);
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
                        speak_word("red");
                        speak_word("red");
                        break;
                    case 16:
                        speak_word("green");
                        speak_sentence("green");
                        break;
                    case 17:
                        speak_word("yellow");
                        speak_sentence("yellow");
                        break;
                    case 18:
                        speak_word("blue");
                        speak_sentence("blue");
                        break;
                    case 19:
                        speak_word("purple");
                        speak_sentence("purple");
                        break;
                    case 20:
                        speak_word("pink");
                        speak_sentence("pink");
                        break;
                    case 21:
                        speak_word("orange");
                        speak_sentence("orange");
                        break;
                    case 22:
                        speak_word("navy blue");
                        speak_sentence("navy blue");
                        break;
                    case 23:
                        speak_word("apple");
                        speak_sentence("apple");
                        break;
                    case 24:
                        speak_word("banana");
                        speak_sentence("banana");
                        break;
                    case 25:
                        speak_word("water");
                        speak_sentence("water");
                        break;
                    case 26:
                        speak_word("ice cream");
                        speak_sentence("ice cream");
                        break;
                    case 27:
                        speak_word("beef");
                        speak_sentence("beef");
                        break;
                    case 28:
                        speak_word("chicken");
                        speak_sentence("chicken");
                        break;
                    case 29:
                        speak_word("lobster");
                        speak_sentence("lobster");
                        break;
                    case 30:
                        speak_word("pie");
                        speak_sentence("pie");
                        break;
                    case 31:
                        mood_generator("happy");
                        break;
                    case 32:
                        mood_generator("sad");
                        break;
                    case 33:
                        mood_generator("angry");
                        break;
                    case 34:
                        mood_generator("nervous");
                        break;
                    case 35:
                        mood_generator("hungry");
                        break;
                    case 36:
                        mood_generator("surprised");
                        break;
                    case 37:
                        mood_generator("sick");
                        break;
                    case 38:
                        mood_generator("sleepy");
                        break;
                    default:
                        speak_word("hmm");
                        break;

                }
            }
        });


        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disp.setText("");
                speak="";
                sentence.clear();
            }
        });

        say.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(speak!=null){
                    t1.speak(speak,TextToSpeech.QUEUE_FLUSH,null);
                }else{
                    t1.speak("Uh-Oh",TextToSpeech.QUEUE_FLUSH,null);
                    Toast.makeText(getBaseContext(),"Please click icons !!",Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    public void speak_word(String wrd){

        t1.speak(wrd,TextToSpeech.QUEUE_FLUSH,null);
    }

    public void speak_sentence(String wrd2){
        StringBuilder b1=new StringBuilder();

        sentence.add(wrd2);

        for (String words:sentence){
            b1.append(words+" ");

        }
        disp.setText(b1);
        speak=b1.toString();

    }
    public void mood_generator(String s3){
        String f1="I am";
        f1=f1+" "+s3;
        t1.speak(f1,TextToSpeech.QUEUE_FLUSH,null);
        disp.setText(f1);
    }




}
