
public class Jogo{
    
        
	private String palavra;
	private String mascara;
	public int chances = 6;
	private int w;
	public String ex[]	 = {
	"|||||||",
	"|   o",
	"|  /|\\",
	"| / | \\",
	"|   |",
	"|  / \\",
	"| /   \\\n\n"};
	//funcionando
	
	public void jogar(){
		this.palavra = "abcdef";
		//funcionando
                
		//System.out.println("AFB:"+ this.palavra);
		
                
	}
	//define a mascara
	public void setMascara(){
            
            //Funcionando
		//this.mascara = this.palavra;
		int i = this.palavra.length();
                char[] b = this.palavra.toCharArray();
                for(int x =0;x<i;x++){
                //HERE chance all characters 
                b[x] = '-';
                    
                }
                this.mascara = String.valueOf(b);
		System.out.println(mascara);
	}
        
	/*public void mostrarMascara(){
            System.out.println(mascara);
            
            //done
		//System.out.println("mostrando mascara");
	}*/
	
	public void mostrarForca(int x){
            //Funcionando
	
		for(this.w =0;this.w < x; this.w ++){ 
	System.out.println(this.ex[this.w]);
		}
	
	
	}
	
	
	public void jogadaN(char x){
                if(this.chances <= 0){
                
                }
            
                //Funcionando
                boolean contem = false;
		char[] b = this.palavra.toCharArray();
                int i,max;
                max = this.palavra.length();
              for(i=0;i<max;i++){
		if(b[i] == x  ){
                    contem = true;
                    this.subistituir(i, x);
                    //System.out.println("xfx");
                    
                    }
                
                
                
                
              } //end for
		if(contem == false){
                this.chances = this.chances - 1;
                }
	}//end void
	
	public void subistituir(int pox, char c){
            char[] b = this.mascara.toCharArray();
            b[pox] = c;
            this.mascara = String.valueOf(b);
            
        
        }
	
	
	
}