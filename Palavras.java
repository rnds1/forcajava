/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Random;

/**
 *
 * @author Rnds1@hotmail.com
 * @@code Random word
 */
public class Palavras {
    // LISTA DE PALAVRAS
    private  String[] a = {"batata","laranja","jaca","mamao","coco","morango","caju","pessego"};
    
    
    public String getWord(){
        
        Random r = new  Random();
       return a[r.nextInt(a.length)];
    }

    public Palavras() {
       System.out.println("Gerando palavra....");
    }
    
    
    

    
   
    

    
}
