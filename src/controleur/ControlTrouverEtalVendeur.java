package controleur;

import personnages.Gaulois;
import villagegaulois.Etal;
import villagegaulois.Village;

public class ControlTrouverEtalVendeur {
	private Village village;

	public ControlTrouverEtalVendeur(Village village) {
		this.village = village;
	}

	public Etal trouverEtalVendeur(String nomVendeur) {
		Gaulois g = village.trouverHabitant(nomVendeur);
		Etal e = null;
		if(g != null) {
			e = village.rechercherEtal(g);
		}
		return e;
	}
}
