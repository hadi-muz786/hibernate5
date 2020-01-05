package com.abc.main;

import com.abc.entities.PassportEntity;
import com.abc.repositories.PassportRepository;

public class InsertMainApp {

	public static void main(String[] args) {
		PassportEntity pr = new PassportEntity();
		pr.setName("Jai");
		pr.setSurname("joshi");
		pr.setPlaceofbirth("nepal");
		pr.setBirthdate("1990-07-17");
		pr.setExpiredate("2024-08-28");

		PassportRepository.save(pr);

	} 

}
