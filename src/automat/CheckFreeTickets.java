package automat;

public class CheckFreeTickets
{
	public static void main(String[] arg)
	{
		Billetautomat automat = new Billetautomat();

		int antalFejl = 0;
		int retur;
		
		retur = automat.getBilletpris();
		if (retur != 10) {
			System.out.println("FEJL, getBilletpris() != 10");
		}

		System.out.println("*** Tjek af salg af en billet");
		//automat.indsætPenge(10);
		automat.udskrivBillet(); //FREE TICKETS ^.^
		automat.controllerLogin("1234");
		if(automat.getAntalBilletterSolgt() != 0){
			System.out.println("FEJL, automaten har solgt en billet til 0 kr...");
			antalFejl++;
		}

		System.out.println("");
		System.out.println("Der blev fundet "+antalFejl+" fejl i automaten");
		if (antalFejl == 0) {
			System.out.println("Automaten er fejlfri, HURRA!!!");
		} else {
			System.out.println("Automaten har fejl, ØV!!!");			
		}
	}
}