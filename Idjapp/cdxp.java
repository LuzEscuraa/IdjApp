package Idjapp;

import java.util.Scanner;

public class cdxp {
	public cdxp() {
			Scanner nt = new Scanner(System.in);
			int xplvl = 1000;
			int xpin= 0;
			int lvl;
			int i = 0;
			System.out.println("Informe o n�vel que deseja ir");
			lvl = nt.nextInt();
			
			for (; i < lvl; i++) {
				 i = xpin + (xplvl*(lvl-1));
				 System.out.println("o xp necessario para avan�ar do nivel " + (lvl-1) + " para o n�vel " + lvl + " � " + i); 
			}

	}

}