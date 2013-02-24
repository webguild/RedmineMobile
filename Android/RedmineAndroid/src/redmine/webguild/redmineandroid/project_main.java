package redmine.webguild.redmineandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class project_main extends Activity implements OnClickListener{
	Button Home,my_page,Projects,Back;
	String[] Comrads={"Участник 1","Участник 2","Участник 3","Участник 4","Участник 5","Участник 6"};
	TextView actions;
	TextView news;
	TextView settings;
	TextView bags;
	TextView tasks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);

    	this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    	setContentView(R.layout.project_main);
    	
    	
    	int position=getIntent().getIntExtra("POSITION", -1);
    	
        Back=(Button)findViewById(R.id.Back);
    	Home=(Button)findViewById(R.id.Home);
    	my_page=(Button)findViewById(R.id.my_page);
    	Projects=(Button)findViewById(R.id.Projects);
    	actions=(TextView)findViewById(R.id.actions);
    	news=(TextView)findViewById(R.id.news);
    	settings=(TextView)findViewById(R.id.settings);
    	bags=(TextView)findViewById(R.id.bags);
    	tasks=(TextView)findViewById(R.id.tasks);
    	
    	
    	
    	
    	Home.setOnClickListener(this);
    	my_page.setOnClickListener(this);
        Projects.setOnClickListener(this);
        Back.setOnClickListener(this);
        actions.setOnClickListener(this);
    	news.setOnClickListener(this);
    	settings.setOnClickListener(this);
    	bags.setOnClickListener(this);
    	tasks.setOnClickListener(this);
        
        // находим список
        ListView LV_proj_main = (ListView) findViewById(R.id.comrades);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
            android.R.layout.simple_list_item_1, Comrads);

        // присваиваем адаптер списку
        LV_proj_main.setAdapter(adapter);
        
        LV_proj_main.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                    int position, long id) 
                {Intent worker_page=new Intent(project_main.this,worker_page.class);
                worker_page.putExtra("POSITION", position);
                  startActivity(worker_page);
                }
              });
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
		case R.id.actions:Intent project_activity=new Intent(this,project_activity.class);startActivity(project_activity);break;
		case R.id.news:Intent project_news=new Intent(this,project_news.class);startActivity(project_news);break;
		case R.id.settings:Intent project_settings=new Intent(this,project_settings.class);startActivity(project_settings);break;
		case R.id.bags:Intent project_tasks_list=new Intent(this,project_tasks_list.class);startActivity(project_tasks_list);break;
		case R.id.tasks:Intent project_tasks_listt=new Intent(this,project_tasks_list.class);startActivity(project_tasks_listt);break;
		default:break;}
		
	}
    
}

