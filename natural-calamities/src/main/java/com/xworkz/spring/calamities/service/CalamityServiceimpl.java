package com.xworkz.spring.calamities.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.spring.calamities.dao.CalamityDAO;
import com.xworkz.spring.calamities.entity.CalamityEntity;

@Service
public class CalamityServiceimpl implements CalamityService {

	@Autowired
	private CalamityDAO calamityDAO;

	public CalamityServiceimpl() {
		System.out.println("Created CalamityServiceimpl\t" + this.getClass().getSimpleName());
	}

	public int validateAndSave(CalamityEntity calamityEntity) {

		System.out.println("Start: validateSave" + calamityEntity);
		int isValid = 1;

		try {
			if (calamityEntity != null) {
				System.out.println("Starting to validate fields..");

				String place = calamityEntity.getPlace();
				if (place != null && !place.isEmpty()) {
					System.out.println("Place of calamity is valid");
					isValid = 0;
				} else {
					System.out.println("Place of calamity is not valid");
					isValid = 1;
				}
				String date = calamityEntity.getDate();
				if (isValid == 0 && date != null && !date.isEmpty()) {
					System.out.println("Date of calamity is valid");
					isValid = 0;
				} else {
					System.out.println("Date of calamity is not valid");
					isValid = 1;
				}
				String type = calamityEntity.getCalamityType();
				if (isValid == 0 && type != null && !type.isEmpty()) {
					System.out.println("Calamity Type is valid");
					isValid = 0;
				} else {
					System.out.println("Calamity Type is not valid");
					isValid = 1;
				}
			}
			if (isValid == 0) {
				System.out.println("Data is valid and can save fields");
				calamityDAO.save(calamityEntity);
				return isValid;
			}
			System.out.println("End: validateSave " + calamityEntity);
		} catch (Exception e) {
			System.err.println("Exception in validateSave " + e.getMessage());
		}
		return isValid;
	}
}
