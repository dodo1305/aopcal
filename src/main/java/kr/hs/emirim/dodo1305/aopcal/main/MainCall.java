package kr.hs.emirim.dodo1305.aopcal.main;
import kr.hs.emirim.dodo1305.aopcal.cal.Calculator;
import kr.hs.emirim.dodo1305.aopcal.cal.ImpCalculator;
import kr.hs.emirim.dodo1305.aopcal.cal.RecCalculator;

public class MainCall {

	public static void main(String[] args) {
		long num = 1000;
		long start1 = System.currentTimeMillis();
		Calculator cal1 = new ImpCalculator();
		long f1 = cal1.factorial(num);
		long end1 = System.currentTimeMillis();
		System.out.printf("Imp factorial(%d) : 실행시간 = %d", num, (end1-start1));
		System.out.println();
		
		long start2 = System.currentTimeMillis();
		Calculator cal2 = new RecCalculator();
		long f2 = cal2.factorial(num);
		long end2 = System.currentTimeMillis();
		System.out.printf("Rec factorial(%d) : 실행시간 = %d", num, (end2-start2));

	}

}
