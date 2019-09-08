
public class Jogo{
	private String palavra;
	private String mascara;
	public int chances = 0;
	private int w;
	public String ex[]	 = {
	"|||||||",
	"|   o",
	"|  /|\\",
	"| / | \\",
	"|   |",
	"|  / \\",
	"| /   \\"};
	//funcionando
	
	public void jogar(){
		this.palavra = "abc";
		//funcionando
		//System.out.println("AFB:"+ this.palavra);
		
	}
	//define a mascara
	public void setMascara(){
		this.mascara = this.palavra;
		
		System.out.println("mascara definida:"+mascara);
	}
	public void mostrarMascara(){
		System.out.println("mostrando mascara");
	}
	
	public void mostrarForca(int x){
	
		for(this.w =0;this.w < x; this.w ++){ 
	System.out.println(this.ex[this.w]);
		}
	
	
	}
	
	
	public void jogadaN(char x){
		
		if(x == palavra.charAt(0)){

		}
		
	}
	
	
	
	
	
}