package com.apex.rest.service.test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.apex.rest.service.OrderServiceResource;
import com.apex.rest.service.vo.OrderBean;

public class CreateCheckTest {

	public static void main(String[] args) {
		OrderServiceResource orderServiceResource = new OrderServiceResource();

		OrderBean orderBean = new OrderBean();

		orderBean.setId(10);
		orderBean.setItemCount(111);
		orderBean.setCard("121212");
		orderBean.setOrderTotal(500);
		orderBean.setPersonName("Rujal");
		orderBean.setShippingAddress("Fremont");

		try {

			JAXBContext jaxbContext = JAXBContext.newInstance(OrderBean.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(orderBean, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

		orderServiceResource.createOrder(orderBean);
	}

}
