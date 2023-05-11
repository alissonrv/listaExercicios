package app;

import view.Tela1;
import view.Tela2;

public class App {
	public static void main(String[] args) {
		Tela2 tela2 = new Tela2();
		Tela1 tela1 = new Tela1(tela2);
	}
}
