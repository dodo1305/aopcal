package kr.hs.emirim.dodo1305.aopcal.aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

//나는 Aspect클래스입니다 라고 알려줌
@Aspect
public class ExeTimeAspect2 {
	
	@Pointcut("execution(public * kr.hs.emirim.dodo1305.aopcal.cal..*(**))")
	private void publicTarget() {
		
	} // 이런 경우 publicTarget이 책임지겠다.
	
	// 동작을 하겠다!
	@Around("publicTarget()")
	public Object measure(ProceedingJoinPoint joinPoint) throws Throwable {
		long start = System.nanoTime();
		try {
			Object result = joinPoint.proceed();
			return result;
		} finally {
			long finish = System.nanoTime();
			Signature sig = joinPoint.getSignature();
			System.out.printf("%s.%s(%s) 실행 시간 : %d ns\n",
					joinPoint.getTarget().getClass().getSimpleName(),
					sig.getName(), Arrays.toString(joinPoint.getArgs()),
					(finish - start));
		}
	}
}
