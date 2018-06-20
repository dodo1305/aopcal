package kr.hs.emirim.dodo1305.aopcal.main;

import kr.hs.emirim.dodo1305.aopcal.cal.Calculator;
import kr.hs.emirim.dodo1305.aopcal.cal.ImpCalculator;
import kr.hs.emirim.dodo1305.aopcal.cal.RecCalculator;

public class MainStart {

	public static void main(String[] args) {
		Calculator cal1 = new ImpCalculator();
		long f1 = cal1.factorial(100);
		System.out.println("Imp 100 : "+f1);
		
		Calculator cal2 = new RecCalculator();
		long f2 = cal2.factorial(100);
		System.out.println("Rec 100 : "+f2);
	}

}
