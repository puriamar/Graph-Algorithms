package WebCrawler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler {
	private Queue<String> queue;
	private List<String> discoveredWebsite;
	
	//constructor
	public WebCrawler() {
		this.queue = new LinkedList<String>();
		this.discoveredWebsite = new ArrayList<String>();
	}
	
	public void discoverWeb(String root)
	{
		this.queue.add(root);
		discoveredWebsite.add(root);
		
		while(!this.queue.isEmpty())
		{
			String current = this.queue.remove();
			String rawHTML = readURL(current);
			
			String regexp = "http://(\\w+\\.)*(\\w+)";
			Pattern pattern = Pattern.compile(regexp);
			Matcher matcher = pattern.matcher(rawHTML);
			
			while(matcher.find())
			{
				String actualUrl = matcher.group();
				
				if(!this.discoveredWebsite.contains(actualUrl)) {
					this.discoveredWebsite.add(actualUrl);
					System.out.println("Discovered Website: " + actualUrl);
					this.queue.add(actualUrl);
				}
			}
		}
	}
	
	private String readURL(String v) {
		String rawHTML = "";
		try {
			URL url = new URL(v);
			//read source code line by line basis in webpage.
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			String inputLine = "";
			while((inputLine = in.readLine()) != null) {
				rawHTML += inputLine;
			}
			in.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return rawHTML;
	}
}
