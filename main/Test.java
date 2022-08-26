package main;

import labis.cvorovi.CvorStabla;
import labis.exception.LabisException;
import labis.generator.StabloGenerator;
import labis.test.ListGenerator;

public class Test {

	public static void main(String[] args) throws LabisException {
		
//		DSLista lista = new DSLista();
//		int[] niz = {10,4,15,21,15,22,20,25,50};
//		
//		ListGenerator.napraviDSListuCommon(lista, niz, false);
//		
//		System.out.println("izlaz " + lista.metoda1(35)); 
//		
//		
//		System.out.println("\n\n\n");
//		
//		
//		JSLista lista2 = new JSLista();
//		int[] niz2 = {12,14,1,2,3,4,16,10,18};
//		
//		ListGenerator.napraviJSListuCommon(lista2, niz2, false);
//		
//		lista2.metoda2(10);
//		
//		ListGenerator.ispisiJSListu(lista2.prvi);
//	
//		
//		System.out.println("\n\n\n");
//		
//		Niz niz3 = new Niz();
//		
//		niz3.niz = new int[] {3,2,2,3,5,1,2,5,3};
//		
//		System.out.println(niz3.metoda3a(9));
	
		
		
//		BSTStablo stablo = new BSTStablo();
//		StabloGenerator.izgenerisiStablo(stablo);
//		
//		CvorStabla neki = stablo.koren.desno.desno.levo;
//		stablo.metoda1(stablo.koren, neki);
		
		BinarnoStablo stablo = new BinarnoStablo();
		StabloGenerator.izgenerisiStablo(stablo);
		
		
		stablo.metoda2(stablo.koren, 1);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
