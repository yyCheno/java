package flyweight;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebSiteFactory webSiteFactory = new WebSiteFactory();
		WebSite webSite = webSiteFactory.gwtWebSiteCategory("sd");
		webSite.use();
	}

}
