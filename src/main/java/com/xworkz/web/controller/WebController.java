package com.xworkz.web.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.xworkz.web.dto.EMailDTO;
import com.xworkz.web.service.WebService;

@Controller
public class WebController {

	private static final Logger logger = Logger.getLogger(WebController.class);

	@Autowired
	private WebService webService;

	public WebController() {
		logger.info("created object\t" + this.getClass().getSimpleName());
	}

	@PostMapping("register.odc")
	public String Details(EMailDTO dto, Model model) {
		
			logger.info("inside the details method");
			try {
				logger.info("MailId: " + dto.getMail());
				logger.info("Subject: " + dto.getSubject());
				logger.info("Body: " + dto.getBody());
				 webService.fillForm(dto);
				logger.info("successfully done");
				return "/index.jsp";
				
		} catch (Exception e) {
			logger.error("Exception in webService " + e.getMessage());
		}
		return null;
	}

}
