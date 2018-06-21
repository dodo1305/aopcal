package kr.hs.emirim.dodo1305.aopcal.main;

import kr.hs.emirim.dodo1305.aopcal.cal.Calculator;
import kr.hs.emirim.dodo1305.aopcal.cal.ImpCalculator;
import kr.hs.emirim.dodo1305.aopcal.cal.RecCalculator;

public class MainNano {

	public static void main(String[] args) {
		long num = 20;
		long start1 = System.nanoTime();
		Calculator cal1 = new ImpCalculator();
		long f1 = cal1.factorial(num);
		long end1 = System.nanoTime();
		System.out.printf("Imp factorial(%d) : %d 실행시간 = %d", num, f1,  (end1-start1));
		System.out.println();
		
		long start2 = System.nanoTime();
		Calculator cal2 = new RecCalculator();
		long f2 = cal2.factorial(num);
		long end2 = System.nanoTime();
		System.out.printf("Rec factorial(%d) :%d  실행시간 = %d", num, f2, (end2-start2));

	}

}
