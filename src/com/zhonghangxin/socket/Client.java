package com.zhonghangxin.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws IOException {

		while (true) {
			String host = "127.0.0.1";
			int port = 8899;
			Socket client = new Socket(host, port);
			Writer writer = new OutputStreamWriter(client.getOutputStream(), "UTF-8");

			Scanner serialInput = new Scanner(System.in);
			String serial = serialInput.next();
			writer.write(serial);
			writer.write("eof\n");
			writer.flush();
			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream(), "UTF-8"));
			client.setSoTimeout(10 * 1000);
			StringBuffer sb = new StringBuffer();
			String temp;
			int index;
			while ((temp = br.readLine()) != null) {
				if ((index = temp.indexOf("eof")) != -1) {
					sb.append(temp.substring(0, index));
					break;
				}
				sb.append(temp);
			}
			System.out.println("·þÎñ¶Ë:" + sb);
			writer.close();
			br.close();
			client.close();

		}

	}

}
