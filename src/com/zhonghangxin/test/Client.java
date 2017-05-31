package com.zhonghangxin.test;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		// ��ʹ��������
//		class A implements PersistCallback {
//			public void doPersist(Session session) {
//				System.out.println("���÷���");
//				User user = new User();
//				session.save(user);
//			}
//		}
//
//		PersistManager.persist(new A());

		// ʹ��Callback���Ƶ����
		PersistManager.persist(new PersistCallback() {
			public void doPersist(Session session) {
				System.out.println("���÷���");
				User user = new User();
				session.save(user);
			}
		});
//
//		// ʹ��Callback���Ƶ��޸�
//		PersistManager.persist(new PersistCallback() {
//			public void doPersist(Session session) {
//				User user = new User();
//				session.update(user);
//			}
//		});
	}
}
