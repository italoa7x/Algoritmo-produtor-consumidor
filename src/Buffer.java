
import java.util.concurrent.ArrayBlockingQueue;

public class Buffer {
	private final ArrayBlockingQueue<Integer> buffer;
	
	public Buffer() {
		buffer = new ArrayBlockingQueue<Integer>(1);
	}

	public synchronized void gravar(Integer valor) throws InterruptedException{
		buffer.put(valor); // grava o dado no buffer
		System.out.printf("%s%2d\t%s%d\n","Produtor escreve:  ", valor,"Buffer ocupado: ",buffer.size());
	}
	
	public synchronized Integer consumir() throws InterruptedException{
		Integer valorConsumido = buffer.take(); // pega o dado do buffer se existir
		System.out.printf("%s %2d\t%s%d\n","Consumidor lendo: ",
				valorConsumido, "Buffer ocupado: ",buffer.size());
		return valorConsumido;
	}
	
}
