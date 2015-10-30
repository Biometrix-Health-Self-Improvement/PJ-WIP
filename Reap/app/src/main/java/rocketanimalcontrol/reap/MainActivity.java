package rocketanimalcontrol.reap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity; //? This needed with AppCompatActivity ?
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.view.View;
import android.view.Menu;
//import android.view.animation.Animation;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Bitmap> bitmaps;//new here or in OnCreate?
    private SpriteAnimation animation;
    private CustomView view;

    //Auto-generated code
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }

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

    }
//ERROR: cannot resolve menu symbol
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }

}
