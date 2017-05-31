package com.zhonghangxin.test;

public class PersistManager {
	
	 //模板方法（外派给接口实现）
    public static void persist(PersistCallback persistCallback) {
	  Session session = SessionFactory.openSession();
         try {
            System.out.println("开启事务");     
            persistCallback.doPersist(session);
            System.out.println("提交事务");
         }catch(Exception e) {
            e.printStackTrace();
            System.out.println("回滚事务");
         }finally {
        	 System.out.println("关闭事务");
         }           
    }

}
