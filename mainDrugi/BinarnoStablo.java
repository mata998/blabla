package main;

import labis.cvorovi.CvorStabla;
import labis.exception.LabisException;
import labis.stabla.ABinarnoStablo;

public class BinarnoStablo extends ABinarnoStablo {

	@Override
	public int metoda4(CvorStabla k) throws LabisException {
		return brojCvorovaSaObaDeteta(k);
	}
	
	public int brojCvorovaSaObaDeteta(CvorStabla k) {
		if (k == null) {
			return 0;
		}
		
		int levo = brojCvorovaSaObaDeteta(k.levo);
		int desno = brojCvorovaSaObaDeteta(k.desno);
		
		if (k.levo != null && k.desno != null) {
			return levo + desno + 1;
		}
		else {
			return levo + desno;
		}
		
	}
	
	
	@Override
	public int metoda5(CvorStabla k, CvorStabla neki) throws LabisException {
		if (!postoji(neki, k)) {
			throw new LabisException("nema cvora");
		}

		return nivo(k, neki, 0);
	}
	
	public int nivo(CvorStabla k, CvorStabla neki, int nivo) {
		
		if (k == neki) {
			return nivo;
		}
		
		if (postoji(neki, k.levo)) {
			return nivo(k.levo, neki, nivo+1);
		}
		else {
			return nivo(k.desno, neki, nivo+1);
		}
		
	}
	
	
	public boolean postoji(CvorStabla neki, CvorStabla cvor) {
		
		if (neki == null || cvor == null) {
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
