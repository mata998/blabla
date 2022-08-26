package main;

import labis.cvorovi.CvorStabla;
import labis.exception.LabisException;
import labis.stabla.ABinarnoStablo;

public class BinarnoStablo extends ABinarnoStablo {

	void metoda2(CvorStabla k, int nivo) throws LabisException {
		if (k == null || nivo < 1) {
			throw new LabisException();
		}
		
		ispisiNaNivou(k, nivo, 1);
		
	}
	
	void ispisiNaNivou(CvorStabla k, int nivo, int trenutniNivo) {
		
		if (k == null) {
			return;
		}

		
		if (nivo == trenutniNivo) {
			if ((k.levo == null && k.desno != null) ||
				(k.levo != null && k.desno == null)) {
				
				System.out.println(k.podatak);
			}
		}
		else {
			
			ispisiNaNivou(k.levo, nivo, trenutniNivo+1);
			ispisiNaNivou(k.desno, nivo, trenutniNivo+1);
		}
		
	}
	
}
