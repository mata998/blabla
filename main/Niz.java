package main;

import labis.exception.LabisException;
import labis.niz.ANiz;

public class Niz extends ANiz{
	
	
	// ova metoda je override
	int metoda3a(int broj) throws LabisException {
		if (niz == null) {
			throw new LabisException();
		}
		
		int duzinaNajmanjeg = Integer.MAX_VALUE;
		int duzinaZaIndex;
		
		for (int i = 0; i<niz.length; i++) {
			
			
			duzinaZaIndex = duzinaNajkracegOdIndexa(i, broj);
			
			if (duzinaZaIndex < duzinaNajmanjeg) {
				
				duzinaNajmanjeg = duzinaZaIndex;
			}
		}
		
		if (duzinaNajmanjeg != Integer.MAX_VALUE) {
			return duzinaNajmanjeg;
		}
		else {
			throw new LabisException();
		}
		
		
		
		
	}
	
	
	// ovo dole je ostalo
	int duzinaNajkracegOdIndexa(int index, int broj) {
		int zbir = 0;
		int brojac = 0;
		
		for(int i = index; i<niz.length; i++) {
			zbir = zbir + niz[i];
			brojac++;
			
			if (zbir > broj) {
				return brojac;
			}
		}
		
		return Integer.MAX_VALUE;
		
	}
	
	
	
}
