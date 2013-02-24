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
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class home extends Activity implements OnClickListener {
	
	Button Home,my_page,Projects;
	//получаем строку с названиями проектов  Projects_list
	String[] Projects_list={"Проект 1","Проект 2","Проект 3","Проект 4","Проект 5","Проект 6"};
	
	int flag=0;//для того чтобы отслеживать нажатия на пункты списка

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	
 Log.d("MYTAGS","HOME");
    	this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    	setContentView(R.layout.home);

       	Home=(Button)findViewById(R.id.Home);
    	my_page=(Button)findViewById(R.id.my_page);
    	Projects=(Button)findViewById(R.id.Projects);
    	Home.setOnClickListener(this);
    	my_page.setOnClickListener(this);
        Projects.setOnClickListener(this);

        
       // находим список
        ListView LV_home = (ListView) findViewById(R.id.LV_home);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
            android.R.layout.simple_list_item_1, Projects_list);

        // присваиваем адаптер списку
        LV_home.setAdapter(adapter);
        
        LV_home.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                    int position, long id) 
                {Intent project_main=new Intent(home.this,project_main.class);
                project_main.putExtra("POSITION", position);
                  startActivity(project_main);
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
		{case R.id.Home:Intent home=new Intent(this,home.class);startActivity(home);finish();break;
		case R.id.my_page:Intent my_page=new Intent(this,mypage.class);startActivity(my_page);finish();break;
		case R.id.Projects:Intent projects=new Intent(this,projects.class);startActivity(projects);finish();break;
		default:break;}
		
	}
    
}
