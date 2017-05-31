package com.zhonghangxin.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		int port = 8899;
		ServerSocket server = new ServerSocket(port);
		while(true){
			Socket socket = server.accept();
			new Thread(new Task(socket)).start();
		}
		
	}
	
	static class Task implements Runnable{
		
		private Socket socket;
		
		public Task(Socket socket){
			this.socket = socket;
		}
		@Override
		public void run() {
			try {
				handleSocket();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		private void handleSocket() throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
			StringBuilder sb = new StringBuilder();
			String temp;
			int index;
			while((temp = br.readLine()) != null){
				//System.out.println(temp);
				if((index = temp.indexOf("eof") )!= -1){
					sb.append(temp.substring(0, index));
					break;
				}
				sb.append(temp);
			}
			System.out.println(sb);
			
			Writer writer = new OutputStreamWriter(socket.getOutputStream(),"UTF-8");
			writer.write("hello !¿Í»§¶Ë");
			writer.write("eof\n");
			writer.flush();
			br.close();
			socket.close();
		}
		
	}
	
	
}
