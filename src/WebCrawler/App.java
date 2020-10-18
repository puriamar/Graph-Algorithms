package WebCrawler;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebCrawler crawl = new WebCrawler();
		String root = "http://www.google.com";
		crawl.discoverWeb(root);

	}

}
