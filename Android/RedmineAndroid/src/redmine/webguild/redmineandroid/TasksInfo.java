package redmine.webguild.redmineandroid;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import redmine.webguild.redmineandroid.XMLdata;

public class TasksInfo extends DefaultHandler {

	
	XMLdata info=new XMLdata();
	private StringBuffer tasks = new StringBuffer();
	private StringBuffer tasks1=new StringBuffer();
	boolean  isUserTag;
	boolean done;
	
	public ArrayList <String> getInformation()
	{
		return info.getData();
	}

	@Override
	public void endDocument() throws SAXException {
	isUserTag=false;
		
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
		

		
		if (localName.equals("subject"))
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
		
		
		
		if (localName.equals("subject"))
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

/*if (localName.equals("subject")){
String project = attributes.toString();

info.setProject(project);
}*/