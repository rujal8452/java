package com.apex.rest.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.apex.rest.service.vo.OrderBean;

@Path("/orderservice")
public class OrderServiceResource {

	@GET
	@Path("/{id}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public OrderBean getOrder(@PathParam("id") int orderId) {
		OrderBean orderBean = new OrderBean();
		orderBean.setId(orderId);
		orderBean.setItemCount(2);
		orderBean.setCard("424242");
		orderBean.setOrderTotal(10);
		orderBean.setPersonName("Rujal");
		orderBean.setShippingAddress("3654 witherspoon cmn");
		return orderBean;

	}

	@POST
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public int createOrder(OrderBean orderBean) {
		
		System.out.println("Order bean card : " + orderBean.getCard());

		return 0;
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void updateOrder(OrderBean orderBean) {
		return;
	}

	@DELETE
	@Path("/{id}")
	public void deleteOrder(@PathParam("id") int orderId) {
		return;
	}

	@GET
	public List<OrderBean> getAllorder() {
		return null;
	}
}
