package com.lti.rest;

import javax.ws.rs.*;

@Path("employee")
public class EmployeeResource {
	
	@GET
	@Path("{empno}")
	@Produces("application/json")
	public String getJson(@PathParam("empno") int empno) {
		
		switch(empno)
		{
		case 1: return "{'name': 'John Snow', 'age':28}";
		
		case 2: return "{'name': 'Peter', 'age':34}";
		
		default: return "{'name': 'Jack', 'age':35}";
		
		}
	}
	
}
