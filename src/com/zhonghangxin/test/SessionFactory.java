package com.zhonghangxin.test;

public class SessionFactory {
    static Session session = new Session();
	public static Session openSession() {
		return session;
	}

}
