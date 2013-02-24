package redmine.webguild.redmineandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class mypage extends Activity implements OnClickListener {
	
	Button Home,my_page,Projects;
	String[] myTasks_list={"Задача 1","Задача 2","Задача 3","Задача 4","Задача 5","Задача 6"};
	String[] createdTasks_list={"Задача 1","Задача 2","Задача 3","Задача 4","Задача 5","Задача 6"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	
 Log.d("MYTAGS","HOME");
    	this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    	setContentView(R.layout.mypage);

    	Home=(Button)findViewById(R.id.Home);
    	my_page=(Button)findViewById(R.id.my_page);
    	Projects=(Button)findViewById(R.id.Projects);
    	Home.setOnClickListener(this);
    	my_page.setOnClickListener(this);
        Projects.setOnClickListener(this);
        
     // находим список
        ListView LV_mypage_mytasks = (ListView) findViewById(R.id.LV_mypage_mytasks);
        ListView LV_mypage_created_tasks=(ListView) findViewById(R.id.LV_mypage_created_tasks);
        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
            android.R.layout.simple_list_item_1, myTasks_list);
        
        ArrayAdapter<String> adapter_2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, createdTasks_list);

        // присваиваем адаптер списку
        LV_mypage_mytasks.setAdapter(adapter);
        LV_mypage_created_tasks.setAdapter(adapter_2);
        
        LV_mypage_mytasks.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                    int position, long id) 
                {Intent teleport=new Intent(mypage.this,project_task.class);
                  startActivity(teleport);
                }
              });
        
        LV_mypage_created_tasks.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                    int position, long id) 
                {Intent teleport=new Intent(mypage.this,project_task.class);
                  startActivity(teleport);
                }
              });

    	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{case R.id.Home:Intent home=new Intent(this,home.class);startActivity(home);break;
		case R.id.my_page:Intent my_page=new Intent(this,mypage.class);startActivity(my_page);break;
		case R.id.Projects:Intent projects=new Intent(this,projects.class);startActivity(projects);break;
		default:break;}
		
	}
    
}
