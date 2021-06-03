package trabalhoSo1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

public class Primeira implements Runnable {
	private String nome;

	public Primeira(String nome) {
		this.nome=nome;
		Thread t1 = new Thread(this);
		t1.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread 1 executando");
		DateFormat formato = new SimpleDateFormat("HH:mm:ss");
		
		
		
		try {
			for (int i = 0; i < 60; i++) {
				Date data = new Date();
				String formattedDate = formato.format(data);
				System.out.println(formattedDate);
				Thread.sleep(1000);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("Thread 1 terminando");
		
	}
}
