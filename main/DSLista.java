package main;

import labis.cvorovi.CvorDSListe;
import labis.exception.LabisException;
import labis.liste.ADSLista;

public class DSLista extends ADSLista{
	
	int metoda1(int broj) throws LabisException {
		if (prvi == null || prvi.sledeci == null) {
			throw new LabisException();
		}
		
		
		CvorDSListe spori = prvi;
		CvorDSListe brzi = prvi.sledeci;
		int brojac = 0;
		
		while (spori.sledeci != null) {
			while(brzi != null) {
				
				if (spori.podatak + brzi.podatak == broj) {
					System.out.println(spori.podatak + " " + brzi.podatak);
					brojac++;
				}
				
				
				brzi = brzi.sledeci;
			}
			
			
			spori = spori.sledeci;
			brzi = spori.sledeci;
		}
		
		return brojac;
	}
	
	
	
	
}
