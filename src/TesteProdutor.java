import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TesteProdutor {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();
		
		Buffer buffer = new Buffer();
	
		// executa o produtor e consumidor para gravar e consumir os dados.
		executor.execute(new Produtor( buffer ));
		executor.execute(new Consumidor( buffer ));
		executor.shutdown(); // finaliza a aplicacao
	}
}
