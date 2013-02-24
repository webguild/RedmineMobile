package redmine.webguild.redmineandroid;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.Window;

public class project_tasks_list extends Activity {
	InternetData g1;
	ArrayList<String> TaskList=new ArrayList<String>();
	String login="d.salskiy",
			pass="salskiy",
			URL="http://tasks.web-guild.net/projects/redmine/issues.xml";
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);

    	this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    	setContentView(R.layout.project_tasks_list);
    	
    	
    	
    	
    	
    	
    new Thread(new Runnable() {
        public void run() {
        
        	g1=new InternetData();
        	// массив с данными
        	TaskList=g1.getTaskInfo(login, pass, URL);
        	 } 
    }).start();
        
    

    }
    	

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}

