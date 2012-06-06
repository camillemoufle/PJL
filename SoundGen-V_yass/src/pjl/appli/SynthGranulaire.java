package pjl.appli;


import android.app.Activity;
import android.graphics.*;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Toast;

public class SynthGranulaire  implements View.OnTouchListener {

	float dureeSon ;
	float frequenceSon;	
	
	  public boolean onTouchEvent( MotionEvent event) {
	    	//Toast.makeText(activity.getApplicationContext() , ""+event.getX()+","+event.getY(), Toast.LENGTH_SHORT).show();
			//dureeSon = event.getX();
			//frequenceSon = event.getY();
			//Canvas canvas =  new Canvas();
			//Paint paint = new Paint();
			//canvas.drawPoint( dureeSon, frequenceSon, paint );
	    	
			return false;
		}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		return false;
	}

	

	

	
}