package com.abc.main;

import com.abc.entities.PassportEntity;
import com.abc.repositories.PassportRepository;

public class UpdateMainApp {

	public static void main(String[] args) {
		PassportRepository pr = new PassportRepository();

		PassportEntity pe = pr.getById(1l);

		pe.setName("Ajmal");
		pe.setSurname("Akbari"); 

		pr.update(pe);

	}

}
