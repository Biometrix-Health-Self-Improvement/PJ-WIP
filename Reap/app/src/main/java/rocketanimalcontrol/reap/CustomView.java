package rocketanimalcontrol.reap;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;

public class CustomView extends View{

    boolean mDownTouch = false;

    private SpriteAnimation animation;

    public CustomView(Context context) {
        super(context);

    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.MAGENTA);
        canvas.drawBitmap(animation.getCurrentFrame(), 300, 200, new Paint());
        animation.update();
        //NOT thread safe
        try {
            Thread.sleep(animation.animationTime());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        this.postInvalidate();
    }

  //Making buttons work.
  @Override
  public boolean onTouchEvent(MotionEvent event) {
      return super.onTouchEvent(event);
  }
    //http://developer.android.com/reference/android/view/GestureDetector.SimpleOnGestureListener.html

    public void setAnimation(SpriteAnimation animation)
    {
        this.animation = animation;
    }

}
