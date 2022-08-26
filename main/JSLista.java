package main;

import labis.cvorovi.CvorJSListe;
import labis.exception.LabisException;
import labis.liste.AJSLista;

public class JSLista extends AJSLista {

	void metoda2(int podatak) throws LabisException {
		
		if (prvi == null) {
			return;
		}
		
		
		CvorJSListe pom = prvi;
		
		while (pom.sledeci != null) {
			
			if (pom.sledeci.podatak % 2 == 0 &&
				pom.sledeci.podatak > podatak) {
				
				pom.sledeci = pom.sledeci.sledeci;
				
			} 
			else {
				pom = pom.sledeci;
			}
			
		}
		
		if (prvi.podatak % 2 == 0 &&
			prvi.podatak > podatak) {
			prvi = prvi.sledeci;
		}
		
		
		
		
	}
	
	
	
	
}
