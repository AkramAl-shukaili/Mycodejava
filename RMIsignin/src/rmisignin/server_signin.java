/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmisignin;
import interface_signin.signin;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author Dell
 */
public class server_signin extends UnicastRemoteObject implements signin {
    
    
  public server_signin() throws RemoteException {
        super();
    }
  @Override
    public String loginuser(String usename) throws RemoteException {
        String user="Telypay";
      

     return user;
         
}
   public String loginpass(String password) throws RemoteException {
        String pass ="password123";
      

     return pass;
         
}

 public static void main(String[] args) {
        System.setProperty("java.rmi.server.hostname", "localhost");
        try {
            Registry reg = LocateRegistry.createRegistry(4000);
            reg.rebind("server", new server_signin());
            System.out.println("Server is working now ");
        } catch (RemoteException e) {
            System.out.println(" Error " + e.getMessage());
        }
        System.out.println(" System is ready now ");
    }
}
