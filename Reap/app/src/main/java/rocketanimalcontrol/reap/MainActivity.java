package rocketanimalcontrol.reap;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.Button;
//import android.graphics.Rect;
import android.view.View;
//import android.view.Menu;
//import android.view.animation.Animation;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity// implements View.OnClickListener
{
    //Animation, bitmaps, and canvas for Sprout
    private ArrayList<Bitmap> bitmaps;//new here or in OnCreate?
    private SpriteAnimation animation;
    private CustomView view;
    //Sound data for Sprout
    public SoundPool mySound;
    int cutebroopId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view = new CustomView(this);

        bitmaps = new ArrayList<Bitmap>();

        bitmaps.add(BitmapFactory.decodeResource(getResources(), R.drawable.sproutsmaller));
        bitmaps.add(BitmapFactory.decodeResource(getResources(), R.drawable.sproutsmaller2));
        bitmaps.add(BitmapFactory.decodeResource(getResources(), R.drawable.sproutsmaller3));
        bitmaps.add(BitmapFactory.decodeResource(getResources(), R.drawable.sproutsmaller2));
        bitmaps.add(BitmapFactory.decodeResource(getResources(), R.drawable.sproutsmaller3));
        bitmaps.add(BitmapFactory.decodeResource(getResources(), R.drawable.sproutsmaller4));

        animation = new SpriteAnimation(bitmaps, 60); //animation needs full bitmaps (fixed error from yesterday)
        view.setAnimation(animation);
        setContentView(view);


        //Sound button code (deprecated)
        mySound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        cutebroopId = mySound.load(this, R.raw.cutebroop, 1);

        ////Sound button (NEED TO IMPLEMENT CUSTOM VIEW ONCLICK HANDLING FIRST)(Or fragment views...) //http://developer.android.com/training/custom-views/making-interactive.html
       //setContentView(R.layout.activity_main); //uncomment this to see sound working w/o CustomView
//       final Button playmySound = (Button) findViewById(R.id.button); //can't find button null
//        playmySound.setOnClickListener (new View.OnClickListener() {
//
//            @Override //after CustomView done you'll be able to do http://www.mysamplecode.com/2011/10/android-programmatically-generate.html
//            public void onClick(View v) {
//                mySound.play(cutebroopId,1,1,1,0,1f);
//            }
//        });








    }
//ERROR: cannot resolve menu symbol
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }

}
