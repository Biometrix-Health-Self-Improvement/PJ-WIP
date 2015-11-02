package rocketanimalcontrol.quetionnairedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class ScrollingActivity extends AppCompatActivity {

    String answer1; //where answers are stored when SUbmit

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        //Submit button to start QuestAnswer activity
        Button submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Extract CharSequences from UI and convert them to string array
                final EditText ETa1 =  (EditText) findViewById(R.id.a1);
                answer1 = ETa1.getText().toString();
                       //somehow iterate through number of questions and add them to array.
                String[] answerArray = {answer1};


                //bundle up the answers //http://stackoverflow.com/questions/5299532/passing-arrays-using-bundle-in-android
                Bundle answerBundle = new Bundle();
                answerBundle.putStringArray("Answers:",answerArray);

                //start new intent
                Intent submitAnswers = new Intent(ScrollingActivity.this, QuestAnswer.class);
                //http://stackoverflow.com/questions/768969/passing-a-bundle-on-startactivity
                submitAnswers.putExtras(answerBundle); //actually passing answers to next activity
                //start new activity
                startActivity(submitAnswers);
                finish();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
