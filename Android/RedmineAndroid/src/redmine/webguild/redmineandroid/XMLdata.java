package redmine.webguild.redmineandroid;

import java.util.ArrayList;

public class XMLdata {

	
	
ArrayList <String> projectList;
	
	public XMLdata(){
		projectList = new ArrayList <String> ();
	}
	
	
	// обрабатываем данные 
	
	public void setProject(String p){
		projectList.add(p);
	}
	
	public ArrayList <String> getData(){
		return projectList;
	}
}
