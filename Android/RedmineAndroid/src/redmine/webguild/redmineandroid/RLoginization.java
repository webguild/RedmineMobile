package redmine.webguild.redmineandroid;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.os.StrictMode;
import android.util.Base64;

public class RLoginization {
	
	
	
	
	public String getData(String log,String pass,String URL) throws Exception 
	{
		
		//StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
		//StrictMode.setThreadPolicy(policy);
		
		BufferedReader in=null;
		String data=null;
		try{
			HttpClient client=new DefaultHttpClient();
			URI website=new URI(URL);
			HttpGet request=new HttpGet();
			String logpass=log+":"+pass;
			request.setHeader("Authorization", "Basic " + Base64.encodeToString(logpass.getBytes(), Base64.NO_WRAP));
			request.setURI(website);
			HttpResponse response=client.execute(request);
			in=new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			StringBuffer sb=new StringBuffer("");
			String l="";
			String nl=System.getProperty("line.separator");
			
			while((l=in.readLine())!=null){
				sb.append(l+nl);
			}
			in.close();
			data=sb.toString();
			return data;
		}
		finally
		{
			if (in!=null)
			{
				try
				{
					in.close();
					return data;
				}catch(Exception e)
				{
				 e.printStackTrace();	
				}
			}
		}
	}

}
