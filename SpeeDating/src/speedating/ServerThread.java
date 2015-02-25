/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speedating;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Logger;


public class ServerThread{

    
    private static ArrayList<Socket> listSocket;
    
    public static int PORT_SERVEUR = 6465;
    private static Socket s = null;
    private static ServerSocket ecoute = null;
    
    
    public static void main(String[] args) {
        
        try {
            
            //on doit lancer la connexionthread qui s'occupera de connecter les sockets
            
            ecoute = new ServerSocket(PORT_SERVEUR);
            ConnexionThread con = new ConnexionThread(listSocket);
            
            while(true){
                
                    s = ecoute.accept();
                    addSocket(s);

            }
        }catch(Exception e){
           
        }
    
    }
    
    
        
    public static void addSocket(Socket socket){
        listSocket.add(socket);
    }
        
    
}
