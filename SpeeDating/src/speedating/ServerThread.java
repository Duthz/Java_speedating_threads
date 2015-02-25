/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speedating;

import java.io.IOException;
import java.util.logging.Logger;

/**
 *
 * @author pierregaillard
 */
public class ServerThread {

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
