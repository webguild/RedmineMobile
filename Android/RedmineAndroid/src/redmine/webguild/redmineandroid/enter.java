package redmine.webguild.redmineandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class enter extends Activity implements OnClickListener {
	
	Button login;
	String login_name;
	TextView login_n;
	TextView pass;
	String password;
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
        
    	this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    	setContentView(R.layout.enter);
    	
    	login=(Button)findViewById(R.id.login);
    	login.setOnClickListener(this);
        
    	login_n=(TextView)findViewById(R.id.login_name);
    	pass=(TextView)findViewById(R.id.password);
    	
    	login_name=login_n.getText().toString();
    	password=pass.getText().toString();

    	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	@Override
	public void onClick(View arg0) {
		Log.d("MYLOGS","switch");
		switch(arg0.getId())
		{case R.id.login:  Intent intent = new Intent(this,home.class);
		 
	      startActivity(intent);
	      break;
		default:break;}
		
	}
    
}



