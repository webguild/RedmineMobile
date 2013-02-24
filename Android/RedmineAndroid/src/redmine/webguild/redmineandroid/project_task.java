package redmine.webguild.redmineandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class project_task extends Activity implements OnClickListener{
	Button Home,my_page,Projects,Back,Refresh;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);

    	this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    	setContentView(R.layout.project_task);
    	
        Back=(Button)findViewById(R.id.Back);
    	Home=(Button)findViewById(R.id.Home);
    	my_page=(Button)findViewById(R.id.my_page);
    	Projects=(Button)findViewById(R.id.Projects);
    	Refresh=(Button)findViewById(R.id.Refresh);
    	
        
        
        
     
    	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{case R.id.Home:Intent home=new Intent(this,home.class);startActivity(home);break;
		case R.id.my_page:Intent my_page=new Intent(this,mypage.class);startActivity(my_page);break;
		case R.id.Projects:Intent projects=new Intent(this,projects.class);startActivity(projects);break;
		case R.id.Back:finish();break;
		case R.id.Refresh:Intent project_task_edit=new Intent(this,project_task_edit.class);startActivity(project_task_edit);break;
		default:break;}
		
	}
    
}

