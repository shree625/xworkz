package com.xworkz.web.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xworkz.web.dto.EMailDTO;

@Service
public class WebServiceImpl implements WebService {

	private static final Logger logger = Logger.getLogger(WebServiceImpl.class);

	public WebServiceImpl() {
		logger.info("Created\t" + this.getClass().getSimpleName());
	}

	public void fillForm(EMailDTO emailDto){
		try {
			logger.info("fill form method started");
			logger.info("checking that dto should not be equal to null");
				if (emailDto!=null) {
					logger.warn("emailDto should not be null");
				}else {
					logger.error("emailDto is  null");
				}

		} catch (Exception e) {
			logger.error("Exception in fillForm " + e.getMessage());
		}
	}

}
