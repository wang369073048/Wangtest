package com.zhonghangxin.wangzhen.reflect2;

/**
 * ������������λ��������� ��ʵ��java�������������������
 * 
 * 1��Bootstrap ClassLoader �˼���������c++��д��һ�㿪���к��ټ���
 * 
 * 2��Extension ClassLoader ����������չ��ļ��أ�һ���Ӧ����jre\lib\extĿ¼�е���
 * 
 * 3��AppClassLoader ����classpathָ�����࣬����õļ�������ͬʱҲ��java��Ĭ�ϵļ�������
 * 
 * @author Administrator
 * 
 */
class hello8 {
	public static void main(String[] args) {
		test t = new test();
		System.out.println("�������  "
				+ t.getClass().getClassLoader().getClass().getName());
	}
}

class test {

}