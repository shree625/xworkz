package com.xworkz.web.dto;

import java.io.Serializable;

import org.apache.log4j.Logger;

public class EMailDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	//Loggers are used
	private static final Logger logger = Logger.getLogger(EMailDTO.class);
	
	private String mail;
	private String subject;
	private String body;
	
//default constructor
	public EMailDTO() {
		logger.info( "created\t" + this.getClass().getSimpleName());
	}
	

	//constructor using fieds
	public EMailDTO(String mail, String subject, String body) {
		super();
		logger.info("constructor using fieds");
		this.mail = mail;
		this.subject = subject;
		this.body = body;
	}
	
	//adding getters and setters

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}



