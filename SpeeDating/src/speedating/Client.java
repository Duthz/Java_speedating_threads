/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speedating;

import java.io.*;
import java.net.*;

/**
 *
 * @author Shinthu
 */
public class Client {

    public static void main(String[] args) throws IOException {
            Socket soc = new Socket("localhost", 6464);
            Thread t;
            t = new Thread(new ThreadClient(soc));
            t.start();
    }

}
