package automat;
/**
 * Model af en simpel billetautomat til enkeltbilletter med én fast pris.
 */
public class Billetautomat {
	private int billetpris;    // Prisen for én billet.
	private int balance; // Hvor mange penge kunden p.t. har puttet i automaten
	private int antalBilletterSolgt; // Antal billetter automaten i alt har solgt
	private boolean controllerState;

	/**
	 * Opret en billetautomat der sælger billetter til 10 kr.
	 */
	public Billetautomat() {
		billetpris = 10;
		balance = 0;
		antalBilletterSolgt = 0;
	}

	/**
	 * Giver prisen for en billet. 
	 */
	public int getBilletpris() {
		return billetpris;
	}

	/**
	 * Modtag nogle penge (i kroner) fra en kunde.
	 */
	public void putMoney(int amount) {
		if(amount > 0){
			balance += amount;
		}
	}

	/**
	 * Giver balancen (beløbet maskinen har modtaget til den næste billet).
	 */
	public int getBalance() {
		return balance;
	}

	/**
	 * Udskriv en billet.
	 * Opdater total og nedskriv balancen med billetprisen
	 */
	public void udskrivBillet() {
		if (balance<billetpris) {
			System.out.println("Du mangler at indbetale nogle penge");
		}
		else{
			System.out.println("##########B##T#########");
			System.out.println("# BlueJ Trafikselskab #");
			System.out.println("#                     #");
			System.out.println("#        Billet       #");
			System.out.println("#        " + billetpris + " kr.       #");
			System.out.println("#                     #");
			System.out.println("##########B##T#########");
			System.out.println("# Du har " + (balance-billetpris) + " kr til gode       #");
			System.out.println("##########B##T#########");
			System.out.println();
	
			antalBilletterSolgt++;
			balance -= billetpris; // Billetter koster 10 kroner
		}
	}


	public int returpenge() {
		int returnAmount = balance;
		balance = 0;
		System.out.println("Du får "+returnAmount+" kr retur");
		return returnAmount;
	}

	
	public void controllerLogin(String adgangskode) {
		if ("1234".equals(adgangskode)) {
			controllerState = true;
			System.out.println("Montørtilstand aktiveret");
			System.out.println("Du kan nu angive billetpris");
		} else {
			controllerState = false;
			System.out.println("Montørtilstand deaktiveret");
		}
	}


	public int getTotal() {
		if (controllerState) {
			return billetpris * antalBilletterSolgt;
		} else {
			System.out.println("Afvist - log ind først");
			return 0;
		}
	}

	public int getAntalBilletterSolgt() {
		if (controllerState) {
			return antalBilletterSolgt;
		} else {
			System.out.println("Afvist - log ind først");
			return 0;
		}
	}

	public void setBilletpris(int billetpris) {
		if(billetpris >= 0 && controllerState){
			this.billetpris = billetpris;
		}
	}

	public void nulstil() {
		if (controllerState) {
			antalBilletterSolgt = 0;
		} else {
			System.out.println("Afvist - log ind først");
		}
	}

	public void setAntalBilletterSolgt(int antalBilletterSolgt) {
		if (controllerState) {
			this.antalBilletterSolgt = antalBilletterSolgt;
		} else {
			System.out.println("Afvist - log ind først");
		}
	}

	public boolean isController() {
		return controllerState;
	}
}