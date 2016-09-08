package com.crazyit.app.action4mobile;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import org.omg.CORBA_2_3.portable.OutputStream;

public class SimpleServer {

	public static void main(String[] args) throws IOException{
		
		ServerSocket ss = new ServerSocket(3000);
		while(true)
		{
			Socket s = ss.accept();
			OutputStream os = (OutputStream) s.getOutputStream();
			os.write("你好,您收到了服务器的信息\n".getBytes("utf-8"));
			os.close();
			s.close();
		}
		
	}


}
