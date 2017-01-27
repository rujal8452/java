package com.apex.order.service.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringBufferInputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

import com.apex.order.service.vo.OrderBean;

public class OrderClient {

	public static final String SERVICE_URL = "http://localhost:7001/order-rest-service/api/orderservice";

	public static OrderBean getOrder(int orderId) throws Exception {
		// get the http response
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpGet getRequest = new HttpGet(SERVICE_URL + "/" + orderId);
		HttpResponse response = httpClient.execute(getRequest);

		if (response.getStatusLine().getStatusCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ response.getStatusLine().getStatusCode());
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(
				(response.getEntity().getContent())));

		String output;
		StringBuffer sb = new StringBuffer();
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
			sb.append(output);
		}

		JAXBContext jaxbContext = JAXBContext.newInstance(OrderBean.class);

		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		OrderBean orderBean = (OrderBean) jaxbUnmarshaller
				.unmarshal(new StringBufferInputStream(sb.toString()));

		return orderBean;
	}

	public static int createOrder(OrderBean orderBean) throws Exception {
		// convert the bean to xml
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(OrderBean.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(orderBean, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

		// get http post and send it and get the response
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpPost post = new HttpPost();
		HttpPost postRequest = new HttpPost(SERVICE_URL + "/" + orderBean);
		HttpResponse response = httpClient.execute(postRequest);

		if (response.getStatusLine().getStatusCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ response.getStatusLine().getStatusCode());
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(
				(response.getEntity().getContent())));

		String output;
		StringBuffer sb = new StringBuffer();
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
			sb.append(output);
		}
		//
		// JAXBContext jaxbContext = JAXBContext.newInstance(OrderBean.class);
		//
		// Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		// orderBean = (OrderBean) jaxbUnmarshaller
		// .unmarshal(new StringBufferInputStream(sb.toString()));
		int id = orderBean.getId();

		// get the order id and return
		return id;
	}

	public static void main(String[] args) throws Exception {
		// OrderBean orderBean = getOrder(12);
		OrderBean orderBean2 = new OrderBean();
		orderBean2.setCard("123");
		orderBean2.setId(111);
		orderBean2.setItemCount(15);
		orderBean2.setOrderTotal(1500);
		orderBean2.setPersonName("ABC");
		orderBean2.setShippingAddress("Oakland");

		int orderBean1 = createOrder(orderBean2);
		System.out.println(orderBean1);
		// System.out.println(orderBean.getCard());
	}
}
