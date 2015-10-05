package automat;

import java.util.Scanner;

public class CheckInvalidInput
{
	public static void main(String[] arg)
	{
		Billetautomat automat = new Billetautomat();

		int antalFejl = 0;
		int retur;
		
		Scanner tastatur = new Scanner(System.in);
		int valg;
		while(!tastatur.hasNextInt()){
			tastatur.nextLine();
			System.out.println("Skriv et tal!");
		}
		valg = tastatur.nextInt();
		tastatur.close();
		
		automat.indsætPenge(valg);
		
		System.out.println();
		System.out.println("Der blev fundet "+antalFejl+" fejl i automaten");
		if (antalFejl == 0) {
			System.out.println("Automaten er fejlfri, HURRA!!!");
		} else {
			System.out.println("Automaten har fejl, ØV!!!");			
		}
		
	}
}