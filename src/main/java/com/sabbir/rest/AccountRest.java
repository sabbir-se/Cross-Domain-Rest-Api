package com.sabbir.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

@Path("/api")
public class AccountRest {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String GetJsonResponse() {
		JSONObject object = new JSONObject();
		try {
			object.put("name", "Sabbir");
			object.put("purpose", "Test");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return object.toString();
	}
}
