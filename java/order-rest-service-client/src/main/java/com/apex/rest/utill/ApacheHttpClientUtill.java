package com.apex.rest.utill;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class ApacheHttpClientUtill {

	public HttpResponse sendGETRequest(String url) throws Exception {

		DefaultHttpClient httpClient = gettHttpClient();
		HttpGet getRequest = new HttpGet(url);
		HttpResponse response = httpClient.execute(getRequest);
		httpClient.getConnectionManager().shutdown();
		// getRequest.addHeader("accept", "application/json");
		// HttpResponse response = httpClient.execute();
		return response;
	}

	private static DefaultHttpClient gettHttpClient() {
		DefaultHttpClient httpClient = new DefaultHttpClient();
		return httpClient;
	}

	public static HttpResponse sendPOSTRequest(String url, String requestMsg) {
		DefaultHttpClient httpClient = gettHttpClient();
		return null;

	}

	public static HttpResponse sendGPUTRequest(String url) {
		DefaultHttpClient httpClient = gettHttpClient();
		return null;

	}

	public static HttpResponse sendDELETERequest(String url) {
		DefaultHttpClient httpClient = gettHttpClient();
		return null;

	}
}
