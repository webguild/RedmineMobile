package redmine.webguild.redmineandroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.Window;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<<<<<<< HEAD
        setContentView(R.layout.project_news);
=======
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
<<<<<<< HEAD
        setContentView(R.layout.project_add_worker);
=======
        setContentView(R.layout.project_add_task);
>>>>>>> 2697285bc059ae31d77b3fd20fd6202707e0d817
>>>>>>> cfc2480f4ac24ce27bbed73c78868fcb87a0eed4
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
