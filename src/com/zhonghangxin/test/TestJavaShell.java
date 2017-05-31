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

	// 程序的入口
	public static void main(String[] args) {
		// // 向控制台输出信息
		System.out.println("欢迎java01班的同学");
		test3();
	}

}
