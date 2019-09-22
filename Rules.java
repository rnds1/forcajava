/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


import java.io.Console;
import java.util.Scanner;

/**
 *
 * @author W7E
 */
public class Rules {
    //objeto de auxiliar de leitura;
    Scanner ler = new Scanner(System.in);
    //escolhe  palavra da lista
    Palavras wr = new Palavras();
     
            
    
    //start varaveis
    private String linha;
    private int chances;
    private String palavra;
    private char[] mask = null;
    private String chars;
    //end variaveis
    
    Rules(){
       
        palavra = wr.getWord();
        chances = palavra.length();
        //motd();
        setMask();
        run();
        //
        
        // loop do jogo
       
        
         
    
    }
    private void setMask(){
        System.out.println("Gerando mascara...");
    this.mask = new char[palavra.length()];
    
        
        for(int i=0;i<palavra.length();i++){
           this.mask[i] = '-'; 
                
        }
    //System.out.println(mask);
    }
     private void run(){
         
     /*
        Programa deve ler uma linha;
        Comparar linha com a palavra;
        Verificar se o primeiro caractere da linha consta na palavra,
         caso não conste decrementar uma chance, e mostrar a forca;
        Continuar passos acima ate completar a palavra ou
        esgotar as chancs;
      */
     //if(){
     
        
    // }else {
    motd();
    System.out.print("\bPalavra: ");
         System.out.println(mask);
         System.out.println("");     
    
            ler();
            if(linha.equals(palavra)){
                mask = palavra.toCharArray();
            System.out.println("Vitoria");
                
                        
                   
            }else {
                chances--;
                run();
            }
    
    
     //teste1();
     //}
     
     }
     
     private void motd(){
         
         System.out.println("\t\tJOGO DA FORCA");         
         System.out.println("DIGITE UMA LETRA");
         System.out.println("CHANCES:"+chances);
     }
     
     private String ler(){
     //teste de leitura de linha;
     linha =ler.nextLine(); //leitura
     //testa linah sem caracteres;
     if(linha.length() < 1){
     ler();
     }
    // else{
     //if(linha.toLowerCase().contains(linha)|| linha.toUpperCase().contains(linha)){
     //System.out.println("oux");
     //}
     //}
     //verificar se leu;
         //System.out.println("vc digitou:"+linha);
         //sucesso
         return linha;
     }
    
     private void teste1(){
         for(int i=0;i<linha.length();i++){
             if(linha.charAt(i) == 'a'){
                 System.out.println("Tem: a\b na pos:"+i);
             }
         }
     }
     
     
     
}
