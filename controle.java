



public class Controle{
		
	public static void main(String []arg){
		char b = 'a';
		
		//cria nova partida;
		Jogo partida = new Jogo();
			partida.jogar();
			//debug
			partida.setMascara();
			
			//motd
			System.out.println("Bem vindo");
			
			//in-game DebugGraphics
			partida.mostrarForca(7);
			//in-game Debug
			
			//partida.jogada(b);
		//enquanto houverem chances
		
		
		
		
	}
	
}