package redmine.webguild.redmineandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.Window;

public class worker_page extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);

    	this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    	setContentView(R.layout.worker_page);


    	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}

