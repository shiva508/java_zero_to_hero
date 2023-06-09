package com.pool.rmi.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import com.pool.rmi.remoteinterface.StudentPoolRemoteAdder;
import com.pool.rmi.remoteinterface.StudentPoolRemoteInterface;

public class StudentPoolRemoteServer {
	public static void main(String[] args) {
		try {
			StudentPoolRemoteInterface stub = new StudentPoolRemoteAdder();
			Naming.rebind("rmi://localhost:5000/shiva", stub);

		} catch (RemoteException | MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
