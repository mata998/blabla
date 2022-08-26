package main;

import labis.cvorovi.CvorStabla;
import labis.exception.LabisException;
import labis.stabla.ABinarnoStablo;

public class BSTStablo extends ABinarnoStablo{

	void metoda1(CvorStabla k, CvorStabla neki) throws LabisException {
		
		if (k == null || neki == null) {
			throw new LabisException();
		}
		
		if (!postoji(neki, k)) {
			throw new LabisException();
		}
		
		CvorStabla trenutni = k;
		
		while (true) {
			if (trenutni.podatak % 2 == 0) {
				System.out.println(trenutni.podatak);
			}
			
			
			
			if (trenutni == neki) {
				break;
			}
			
			
			if (postoji(neki, trenutni.levo)) {
				
				trenutni = trenutni.levo;
				continue;
			}
			
			if (postoji(neki, trenutni.desno)) {
				
				trenutni = trenutni.desno;
				continue;
			}
			
			
		}
		
		
		
	}
	
	public boolean postoji(CvorStabla neki, CvorStabla cvor) {
		if (cvor == null) {
			return false;
		}
		
		if (postoji(neki, cvor.levo) ||
			postoji(neki, cvor.desno) ||
			cvor == neki)
		{
			
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	
}
