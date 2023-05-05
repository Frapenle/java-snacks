package org.lessons.java;

import java.util.Random;

public class NameSurname {

	public static void main(String[] args) {
		String[] name = {"Francesco", "Marta", "Claudia", "Giovanni", "Aldo", "Guido"};
		String[] surname = {"Rossi", "Bianchi", "Totti", "Dionisi", "Verdi", "Re"};
		Random randomAlias = new Random();
		
		for (int i=0; i < name.length; i++) {
			int rndName = randomAlias.nextInt(name.length);
			int rndSurname = randomAlias.nextInt(surname.length);
			
			String rName = name[rndName];
            String rSurname = surname[rndSurname];
            
            System.out.println(rName + " " + rSurname);
			
		}
	}

}
