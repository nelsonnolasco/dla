package foguete;
public class Main
{
	public static void main(String[] args) {
		int lancamento = 10;
		
		while (lancamento >=0){
		    if (lancamento == 3){
		        System.out.println ("Atenção!");
		    } else{
		        System.out.println(lancamento);
		    }
		    lancamento --;
		}
	
	    System.out.println ("Lançamento do foguete!!!");
	}
	
}

