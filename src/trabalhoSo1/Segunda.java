package trabalhoSo1;

import java.util.Scanner;

public class Segunda implements Runnable{
	
	private String nome;
	int num1;
	
	public Segunda(String nome) {
		this.nome=nome;
		Thread t2 = new Thread(this);
		t2.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread2 executando... digite um número");
		
		Scanner ler = new Scanner(System.in);
		num1= ler.nextInt();
		System.out.println("O número: "+num1+" elevado ao quadrado eh: "+ Math.pow(num1, 2));
		System.out.println("Thread2 terminando");
		
		
		
	}

}
