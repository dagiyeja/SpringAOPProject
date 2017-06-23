package com.sist.aspect;
/*
 * 
 * 입고 insert
 * 재고 insert
 * commit()
 * 
 * =>rollback()
 * 
 * AOP(Aspect Oriented Programming)
 * Aspect(공통으로 사용되는 클래스..., 메모리 할당X) 
 * 1.Class 설정 : Target  => method Pointcut
 * 2.시점 JoinPoint
 * 	PointCut+JoinPoint	=> Advice	=>Aspect
 * 	=======1
 * 	select()
 * 	{
 * 		@Before
 * 		try
 * 		{
 * 			@setAutoCommit(false)
 * 				핵심==>insert
 * 							insert
 * 			@commit()	==>Around
 * 		}catch(Exception e){
 * 			@After-Throwing
 * 				rollback()
 * 		}
 * 		finally
 * 		{
 * 			@After=>setAutoCommit(true)
 * 		}
 * 		return	@After-Returning
 * 	}
 * 	=======2
 */


public class Common {
	public void getConnection(){
		System.out.println("Oracle 연결");
	}
	public void disConnection(){
		System.out.println("Oracle 연결해제");
	}
}
