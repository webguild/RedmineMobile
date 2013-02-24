package redmine.webguild.redmineandroid;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class TasksFullInfo extends DefaultHandler {
	
	XMLdata info=new XMLdata();
	
	public ArrayList <String> getFullInformation()
	{
		return info.getData();
	}
	

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		
		if (localName.equals("id")){
			String project = attributes.toString();
            info.setProject(project);
			}else if(localName.equals("project"))
			{
			String project = attributes.toString();
	        info.setProject(project);	
			}else if(localName.equals("tracker"))
			{
			String project = attributes.toString();
	        info.setProject(project);	
			}else if(localName.equals("status"))
			{
			String project = attributes.toString();
	        info.setProject(project);	
			}else if(localName.equals("priority"))
			{
			String project = attributes.toString();
	        info.setProject(project);	
			}else if(localName.equals("author"))
			{
			String project = attributes.toString();
	        info.setProject(project);	
			}else if(localName.equals("assigned_to"))
			{
			String project = attributes.toString();
	        info.setProject(project);	
			}
	
}
}

