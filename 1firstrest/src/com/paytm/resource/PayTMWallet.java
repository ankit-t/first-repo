package com.paytm.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/wallet")
public class PayTMWallet {
	// add jax rs api jars.
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public double getBalance(@QueryParam("mobileNo") String mobileNo) {
		return 334.34;
		// url is http://localhost:8888/1firstrest/service/wallet?mobileNo=123
	}
}
