package automat;

public class CheckInvalidInput
{
	public static void main(String[] arg)
	{
		Billetautomat automat = new Billetautomat();

		int antalFejl = 0;
		int retur;
		
		//dette kan ikke tjekkes, men skulle istedet for rettes for alle cases i BenytBilletAutomat
		automat.indsætPenge(Integer.parseInt("her skulle det ses om et scanner input..."));
		
		System.out.println();
		System.out.println("Der blev fundet "+antalFejl+" fejl i automaten");
		if (antalFejl == 0) {
			System.out.println("Automaten er fejlfri, HURRA!!!");
		} else {
			System.out.println("Automaten har fejl, ØV!!!");			
		}
		
	}
}