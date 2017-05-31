package com.zhonghangxin.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestJavaShell {

	private static void test3() {
		execCommand1("sh /opt/app/appcode/TravelHub/HotelBE/test.sh");
		System.out.println("...........");
	}

	public static boolean execCommand1(String cmd) {
		Process process = null;
		try {
			process = Runtime.getRuntime().exec(cmd);
			process.waitFor();
			InputStreamReader ir = new InputStreamReader(process.getInputStream());

			BufferedReader input = new BufferedReader(ir);

			String line;

			while ((line = input.readLine()) != null) {

				System.out.println(line);
			}
		} catch (Exception e) {
			return false;
		} finally {
			try {
				process.destroy();
			} catch (Exception e) {
			}
		}
		return true;
	}

	// ��������
	public static void main(String[] args) {
		// // �����̨�����Ϣ
		System.out.println("��ӭjava01���ͬѧ");
		test3();
	}

}
