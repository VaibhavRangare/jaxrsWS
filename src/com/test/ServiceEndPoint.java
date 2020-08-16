package com.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ibm.json.java.JSONObject;

@Path("/EndPoint")
public class ServiceEndPoint {

	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/HTMLEndpoint")
	public String getMessage(){
		return "<html> <title></title><body><h1>My Third Web Service...</h1></body></html>";  
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/JSONEndpoint")
	public JSONObject getMessage1(){
	      JSONObject obj = new JSONObject();
	      obj.put("name", "foo");
	      obj.put("num", new Integer(100));
	      obj.put("balance", new Double(1000.21));
	      obj.put("is_vip", new Boolean(true));
	      return obj;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
