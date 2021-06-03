package trabalhoSo1;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Terceira implements Runnable {
	private String nome;
	
	public Terceira(String nome) {
		this.nome=nome;
		Thread t3 = new Thread(this);
		t3.start();
	}

	@Override
	public void run() {
		try {
			Thread.sleep(500);
			System.out.println("Trhed 3 executando");
			DateFormat formato = new SimpleDateFormat("EEEE");
			Date data = new Date();
			String formattedDate = formato.format(data);
			System.out.println("Hoje é : "+formattedDate);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Thread 3 terminando");
	}

}
