package com.apex.rest.utill;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.http.HttpResponse;

public class XMLUtill {
	public static Object getEntityFromXMLString(HttpResponse response, Class clz) {
		JAXBContext jaxbContext = null;
		try {
			jaxbContext = JAXBContext.newInstance(clz);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			return jaxbUnmarshaller
					.unmarshal(response.getEntity().getContent());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public String getXMLFromEntity(Object obj, Class clz) {
		return null;
	}

}
