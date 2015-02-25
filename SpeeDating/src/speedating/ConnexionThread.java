/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speedating;

import java.net.Socket;
import java.util.ArrayList;


public class ConnexionThread extends Thread{
    
    private ArrayList<Socket> listSocket;
    private Socket left;
    private Socket right;
    
    public ConnexionThread(ArrayList<Socket> listSocket){
        listSocket = listSocket;
    }
    
    public void run(){
        
        while(true){
            synchronized(listSocket){
                left = listSocket.get(0);
                right = listSocket.get(1);
                Xfer fer = new Xfer(left,right);
                Xfer ferR = new Xfer(right,left);
                fer.start();
            }
        }
        
    }
    
}
