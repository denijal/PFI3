package denijal.mehmedagicpfi3assignment2.denijal;

import denijal.mehmedagicpfi3assignment2.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class mehmedagicpfi3assignment2 extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);
        
        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(this);
    }
        
   public void onClick (View v) {
	  
	   EditText text1= (EditText) findViewById(R.id.editText1);
	   EditText text2= (EditText) findViewById(R.id.editText2);
	   
	   String msg = "Message: " + text1.getText().toString();
	   String tag = "Tag: " + text2.getText().toString();
	   Toast t = Toast.makeText(this, msg+"\n"+tag, Toast.LENGTH_LONG);
	   t.show ();
	   text1.setText ("");
	   text2.setText ("");
	  
   }
   
       
}