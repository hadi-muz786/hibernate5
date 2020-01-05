package com.abc.main;

import com.abc.entities.PassportEntity;
import com.abc.repositories.PassportRepository;

public class SelectMainApp {

	public static void main(String[] args) {
		PassportRepository pr = new PassportRepository();
		PassportEntity pe = pr.getById(2l);
		System.out.println(pe.toString());
	}

}
