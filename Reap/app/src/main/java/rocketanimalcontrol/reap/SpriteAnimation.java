package rocketanimalcontrol.reap;

import java.util.ArrayList;

import android.graphics.Bitmap;

public class SpriteAnimation {

    private ArrayList<Bitmap> bitmaps;
    private Bitmap currentFrame;
    private int currentFrameIndex;
    private long frameTicker = (long) .01; //milliseconds
    private int animationTime;



    public SpriteAnimation (ArrayList<Bitmap> bitmaps, int fps)
    {
        this.bitmaps = bitmaps;
        currentFrame = bitmaps.get(0);
        currentFrameIndex = 0;
        animationTime = 5000 / fps; //milliseconds
    }

    public void update(long delta) {
        if (delta > frameTicker + animationTime) {
            // increment the frame
            currentFrameIndex++;
            if (currentFrameIndex >= bitmaps.size())
                currentFrameIndex = 0;
            currentFrame = bitmaps.get(currentFrameIndex);
        }
        // define the rectangle to cut out sprite

    }

    public int animationTime()
    {
        return this.animationTime;
    }

    public void update() {
        this.update(System.currentTimeMillis());
    }

    public Bitmap getCurrentFrame()
    {
        return currentFrame;
    }

    public ArrayList <Bitmap> getBitmaps()
    {
        return bitmaps;
    }

}
