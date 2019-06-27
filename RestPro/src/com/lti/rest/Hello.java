package com.lti.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("/hello")
public class Hello {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlaintextHello()
	{
		return "Hello Jersey Plain";
	}
	@GET	
	@Produces(MediaType.APPLICATION_XML)
	public String sayPlainXMLHello()
	{
		return "<?xml version =\"1.0\"?>"+"<hello> Hello JERSEY " +"</hello>";
				
	}
	@GET
	@Path("/xmlhello") 
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello()
	{
		return "<?xml version=\"1.0\"?>"+"<hello> Hello JERSEY"+"</hello>";
		}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLHello()
	{
		return "<HTML>"+"<TITLE>"+"Hello jersey "+"</TITLE>"+"<BODY><H1> "+ "Hello jersey HTML "+"</H1></BODY>"+ "</HTML>";
		}
	
}
