package com.zhonghangxin.test;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		// 不使用匿名类
//		class A implements PersistCallback {
//			public void doPersist(Session session) {
//				System.out.println("调用方法");
//				User user = new User();
//				session.save(user);
//			}
//		}
//
//		PersistManager.persist(new A());

		// 使用Callback机制的添加
		PersistManager.persist(new PersistCallback() {
			public void doPersist(Session session) {
				System.out.println("调用方法");
				User user = new User();
				session.save(user);
			}
		});
//
//		// 使用Callback机制的修改
//		PersistManager.persist(new PersistCallback() {
//			public void doPersist(Session session) {
//				User user = new User();
//				session.update(user);
//			}
//		});
	}
}
