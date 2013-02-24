package redmine.webguild.redmineandroid;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

public class InternetData {

	
	
	public String getTaskInfo(String login,String pass,String URL)
	{
		RLoginization test=new RLoginization();
		String returned = null;
		final StringBuffer fprint=new StringBuffer();
		try {
			returned = test.getData(login,pass,URL);
			//добываем, переводим
			InputStream xmlStream = new ByteArrayInputStream(returned.getBytes("UTF-8"));
			//-------------------
			SAXParserFactory spf=SAXParserFactory.newInstance();
			SAXParser sp=spf.newSAXParser();
			XMLReader xr=sp.getXMLReader();
			TasksInfo work=new TasksInfo();
			xr.setContentHandler(work);
			//парсим
			xr.parse(new InputSource(xmlStream));
			
			//final String information=work.getInformation();
			ArrayList <String> result = work.getInformation();
			StringBuffer print =new StringBuffer();
			for(String key : result){
				//System.out.println(key);
				print.append("\n"+key);
				}
			
			fprint.append(print);
			
			
	}
		catch(Exception e)
		{
			System.out.println("Error " + e );
		}
		return fprint.toString();
}
	


public String getTaskFullInfo(String login,String pass,String URL)
{
	RLoginization test=new RLoginization();
	String returned = null;
	final StringBuffer fprint=new StringBuffer();
	try {
		returned = test.getData(login,pass,URL);
		//добываем, переводим
		InputStream xmlStream = new ByteArrayInputStream(returned.getBytes("UTF-8"));
		//-------------------
		SAXParserFactory spf=SAXParserFactory.newInstance();
		SAXParser sp=spf.newSAXParser();
		XMLReader xr=sp.getXMLReader();
		TasksFullInfo work=new TasksFullInfo();
		xr.setContentHandler(work);
		//парсим
		xr.parse(new InputSource(xmlStream));
		
		//final String information=work.getInformation();
		ArrayList <String> result = work.getFullInformation();
		StringBuffer print =new StringBuffer();
		for(String key : result){
			//System.out.println(key);
			print.append("\n"+key);
			}
		
		fprint.append(print);
		
		
}
	catch(Exception e)
	{
		System.out.println("Error " + e );
	}
	return fprint.toString();
}

}
