package pjl.appli;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.*;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class SoundGenActivity extends Activity {
    /** Called when the activity is first created. */
    
    private RadioGroup radioGroup ;
    private SynthGranulaire synthGranulaire = new SynthGranulaire();

	public Activity activity;
    public SoundGenActivity (Activity act){
		this.activity=act;
	}
	
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    	radioGroup = (RadioGroup)findViewById(R.id.radioSyntheseSonore);
    	
    }
    
    
    
    public void onFMButtonClicked(View v) {
        // Ce qui se produit lorsqu'on clique sur la synthèse FM
    	TextView coucou = null;
		coucou = new TextView(this);
		coucou.setText("Bonjour, vous etes en mode FM");
		setContentView(coucou);
    	
    	//RadioButton rb = (RadioButton) v;
        //Toast.makeText(this, rb.getText(), Toast.LENGTH_SHORT).show();
    }
    
    public void onGranulaireButtonClicked(View v) {
        // Ce qui se produit lorsqu'on clique sur la synthèse Granulaire
    	RadioButton rb = (RadioButton) v;
        Toast.makeText(this, rb.getText(), Toast.LENGTH_SHORT).show();
    	//SynthGranulaire synthGranulaire = new SynthGranulaire();
    	//MotionEvent event = null;
    	//synthGranulaire.onTouch(v, event);
        
    } 
    

}