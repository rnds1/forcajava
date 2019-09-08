
import java.util.Scanner;





public class Controle{
		
	public static void main (String []arg){
            Scanner ler = new Scanner(System.in);
                String li;
                char l[];
		
		
		//cria nova partida;
		Jogo partida = new Jogo();
			partida.jogar();
			//debug
                      // partida.mostrarForca(7);
			//partida.setMascara();
			
			//motd
			//System.out.println("Bem vindo");
			
			//in-game DebugGraphics
			
                        
                      // partida.jogadaN((char) l[0]);
                    
			//in-game Debug
                        while(partida.chances> 0){
                           li= ler.nextLine();
                        //System.out.println(li);
                        l = li.toCharArray();
                        //System.out.println(l[0]);
                               
                        }
			
			//partida.jogada(b);
		//enquanto houverem chances
		
		
		
		
	}
	
}