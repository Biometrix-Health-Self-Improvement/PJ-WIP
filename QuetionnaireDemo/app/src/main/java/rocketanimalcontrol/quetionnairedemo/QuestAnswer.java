package rocketanimalcontrol.quetionnairedemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class QuestAnswer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest_answer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //make text box for testing purposes
        TextView testTextBox = (TextView)findViewById(R.id.testOutput);

        //From previous Intent (ScrollingActivity) get the bundled string array
        String [] gottenAnswers = getIntent().getExtras().getStringArray("Answers:");

        //Now upload them to database, or whatever. Now *I* log though.
        testTextBox.setText(gottenAnswers[0]);

        for (String ansa : gottenAnswers) {
            System.out.println(ansa);
            Log.d("LOOK", ansa); //where the heck is this?
        }

    }//end OnCreate()

}
