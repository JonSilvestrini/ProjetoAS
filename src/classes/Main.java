/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author jonatas
 */
public class Main {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resX, resY;
        Toolkit tela = Toolkit.getDefaultToolkit();
        Dimension res = tela.getScreenSize();
        resX = res.width;
        resY = res.height;
        TelaLogin tl = new TelaLogin(resX, resY);
        tl.setBounds((resX / 2 - 125), (resY / 2- 125), 250, 250);
        tl.setVisible(true);
    }
    
}