/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speedating;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shinthu
 */
public class ThreadClient implements Runnable {

    private Socket soc;
    Scanner sc = null;
    private String msg = null;

    public ThreadClient(Socket socket) {
        soc = socket;
    }

    @Override
    public void run() {
        PrintWriter out = null;
        try {
            out = new PrintWriter(soc.getOutputStream());
            //BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        } catch (IOException ex) {
            Logger.getLogger(ThreadClient.class.getName()).log(Level.SEVERE, null, ex);
        }

        sc = new Scanner(System.in);
        while (true) {
            System.out.println("Message sortant :");
            msg = sc.nextLine();
            out.println(msg);
            out.flush();
        }

    }

}
