package redmine.webguild.redmineandroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.Window;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
<<<<<<< HEAD
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.project_settings_worker);

        
    }
=======
    	super.onCreate(savedInstanceState);

    	this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    	setContentView(R.layout.project_main);


    	}
>>>>>>> 33de58b5a7044ddb6fa8dddc55c9c1e0377055bd

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
