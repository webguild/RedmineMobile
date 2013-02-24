package redmine.webguild.redmineandroid;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class TasksFullInfo extends DefaultHandler {
	
	XMLdata info=new XMLdata();
	private StringBuffer tasks = new StringBuffer();
	private StringBuffer tasks1=new StringBuffer();
	boolean  isUserTag;
	boolean done;
	
	public ArrayList <String> getFullInformation()
	{
		return info.getData();
	}
	

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		
		if (localName.equals("id"))
		{
			isUserTag = true;
			tasks.setLength(0);
	    }
		
		
		
		
		
		
		
		    if(localName.equals("project"))
			{
			String project = attributes.getValue("name");
	        info.setProject(project);	
			}else if(localName.equals("tracker"))
			{
			String project = attributes.getValue("name");
	        info.setProject(project);	
			}else if(localName.equals("status"))
			{
			String project = attributes.getValue("name");
	        info.setProject(project);	
			}else if(localName.equals("priority"))
			{
			String project = attributes.getValue("name");
	        info.setProject(project);	
			}else if(localName.equals("author"))
			{
			String project = attributes.getValue("name");
	        info.setProject(project);	
			}else if(localName.equals("assigned_to"))
			{
			String project = attributes.getValue("name");
	        info.setProject(project);	
			}
		    
		    
		    
		    if (localName.equals("description"))
		    {
				isUserTag = true;
				tasks.setLength(0);
			}
		    
		    if (localName.equals("start_date"))
		    {
				isUserTag = true;
				tasks.setLength(0);
			}
		    
		    if (localName.equals("due_date"))
		    {
				isUserTag = true;
				tasks.setLength(0);
			}
		    
		    if (localName.equals("done_ratio"))
		    {
				isUserTag = true;
				tasks.setLength(0);
			}
		    
		    if (localName.equals("estimated_hours"))
		    {
				isUserTag = true;
				tasks.setLength(0);
			}
		    
		    if (localName.equals("created_on"))
		    {
				isUserTag = true;
				tasks.setLength(0);
			}
		    
		    if (localName.equals("updated_on"))
		    {
				isUserTag = true;
				tasks.setLength(0);
			}
	
}
	
	public void characters(char[] ch, int start, int length) throws SAXException {
		if(isUserTag==true)
		{
		      tasks.append(new String(ch, start, length));
		      
		}
	}
	
	
	
	public void endElement(String uri, String localName, String qName) throws SAXException
	  {
		if (localName.equals("id"))
		{
		tasks1.append(tasks);
		isUserTag = false;
		String Stasks=tasks1.toString();
		info.setProject(Stasks);
		//System.out.println(Stasks);
		tasks1.setLength(0);
		}
		
		if (localName.equals("description"))
		{
		tasks1.append(tasks);
		isUserTag = false;
		String Stasks=tasks1.toString();
		info.setProject(Stasks);
		//System.out.println(Stasks);
		tasks1.setLength(0);
		}
		
		if (localName.equals("stard_date"))
		{
		tasks1.append(tasks);
		isUserTag = false;
		String Stasks=tasks1.toString();
		info.setProject(Stasks);
		//System.out.println(Stasks);
		tasks1.setLength(0);
		}
		
		if (localName.equals("due_date"))
		{
		tasks1.append(tasks);
		isUserTag = false;
		String Stasks=tasks1.toString();
		info.setProject(Stasks);
		//System.out.println(Stasks);
		tasks1.setLength(0);
		}
		
		if (localName.equals("done_ratio"))
		{
		tasks1.append(tasks);
		isUserTag = false;
		String Stasks=tasks1.toString();
		info.setProject(Stasks);
		//System.out.println(Stasks);
		tasks1.setLength(0);
		}
		
		if (localName.equals("estimated_hours"))
		{
		tasks1.append(tasks);
		isUserTag = false;
		String Stasks=tasks1.toString();
		info.setProject(Stasks);
		//System.out.println(Stasks);
		tasks1.setLength(0);
		}
		
		if (localName.equals("created_on"))
		{
		tasks1.append(tasks);
		isUserTag = false;
		String Stasks=tasks1.toString();
		info.setProject(Stasks);
		//System.out.println(Stasks);
		tasks1.setLength(0);
		}
		
		if (localName.equals("updated_on"))
		{
		tasks1.append(tasks);
		isUserTag = false;
		String Stasks=tasks1.toString();
		info.setProject(Stasks);
		//System.out.println(Stasks);
		tasks1.setLength(0);
		}
		
	  }
	
	
	
	
}

