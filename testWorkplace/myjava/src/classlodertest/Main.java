package classlodertest;

import java.net.URL;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
				for (URL url : urls) {
					System.out.println(url.toExternalForm());
				}

	}

}
