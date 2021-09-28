//name :Akram salim Al-shukaili
package rmisignin;
import interface_signin.signin;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class user_signin {

    public static void main(String[] args) throws RemoteException, NotBoundException {
        user_signin run = new user_signin();
        run.connect();
    }

    private void connect() throws RemoteException, NotBoundException {

        Registry reg = LocateRegistry.getRegistry("localhost", 4000);
        signin connectinterface;
        connectinterface = (signin) reg.lookup("server");
        System.out.println("****    Welcome all  \n SignIn Page \n*****");
        Scanner signinscanner = new Scanner(System.in);
        String readuser="";
        String readpass="";
        
        System.out.println("**** Enter Your username*****");
        readuser=signinscanner.next();
        System.out.println("**** Enter Your Password*****");
        readpass=signinscanner.next();
        if((readuser.equals(connectinterface.loginuser("Telypay"))) && (readpass.equals(connectinterface.loginuser("password123"))))
        {
        System.out.print(" \n Success");
        }
        else if((readuser.equals(connectinterface.loginuser("Telypay"))) && (!readpass.equals(connectinterface.loginuser("password123"))))
        {
        System.out.print(" \n Wrong Password");
        
        }
        else {
        
           System.out.print(" \n Error");
        }
            
        

    }

}
