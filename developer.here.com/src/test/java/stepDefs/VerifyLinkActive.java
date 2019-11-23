package test.java.stepDefs;

import java.net.HttpURLConnection;
import java.net.URL;

public class VerifyLinkActive {
	
	public static void validateResponseCode(String linkUrl) {
		try {
			URL url = new URL(linkUrl);

			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();

			httpURLConnect.setConnectTimeout(3000);

			httpURLConnect.connect();

			if (httpURLConnect.getResponseCode() >= 200 || httpURLConnect.getResponseCode() <= 299) {
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
			} else {
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + " - "
						+ HttpURLConnection.HTTP_NOT_FOUND);
			}
		} catch (Exception e) {

		}
	}

}
