package controller;

import view.Mensagem;

public class CpfException extends Exception{
	public CpfException(String mensagem) {
		super(mensagem);
		Mensagem.exibirMensagem(mensagem);
	}
}
