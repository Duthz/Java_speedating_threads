/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speedating;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Xfer extends Thread {
    InputStream fromleft;
    OutputStream toright;
    
    public Xfer (Socket left, Socket right) {
        try {
            fromleft = left.getInputStream();
            toright = right.getOutputStream();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    
    
    public void run() {
        System.out.println("Starting Thread");
        try {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fromleft.read(buffer)) != -1) {
                toright.write(buffer, 0, bytesRead);
                //System.out.println(bytesRead);
            }

        } catch (Exception ex) {
            System.err.println(ex);
        }
    }
}
    