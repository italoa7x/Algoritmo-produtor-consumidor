import java.util.Random;

public class Consumidor implements Runnable{

	private final Buffer buffer;
	
	public Consumidor(Buffer b) {
		this.buffer = b;
	}

	@Override
	public void run() {
		Integer soma = 0;
		
		for(Integer i = 0; i <= 10; i++){
			
			try {
				Thread.sleep( 3000 ); // colocando a thread para dormir.
				
				soma += buffer.consumir(); // incrementando a variavel soma com os valores consumidos do Buffer
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.printf("\n%s %d\n%s\n","Total de produtos consumidos: ", soma, "Consumo finalizado.");
		
	}
	
	
}
