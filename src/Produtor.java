import java.util.Random;

public class Produtor implements Runnable{

	private final Buffer buffer;
	
	public Produtor(Buffer b) {
		this.buffer = b;
	}

	@Override
	public void run() {
		
		Integer soma = 0;
		for(Integer i = 0; i <= 10; i++){
			try {
				// thread dorme por 3 segundos.
				Thread.sleep( 3000 );
				buffer.gravar( i ); // grava o valor no buffer
				soma += i; // incrementa o valor da soma
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Produtor escreve.");
	}
	
	

}
