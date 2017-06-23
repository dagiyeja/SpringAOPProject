package com.sist.aspect;
/*
 * 
 * �԰� insert
 * ��� insert
 * commit()
 * 
 * =>rollback()
 * 
 * AOP(Aspect Oriented Programming)
 * Aspect(�������� ���Ǵ� Ŭ����..., �޸� �Ҵ�X) 
 * 1.Class ���� : Target  => method Pointcut
 * 2.���� JoinPoint
 * 	PointCut+JoinPoint	=> Advice	=>Aspect
 * 	=======1
 * 	select()
 * 	{
 * 		@Before
 * 		try
 * 		{
 * 			@setAutoCommit(false)
 * 				�ٽ�==>insert
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
		System.out.println("Oracle ����");
	}
	public void disConnection(){
		System.out.println("Oracle ��������");
	}
}
