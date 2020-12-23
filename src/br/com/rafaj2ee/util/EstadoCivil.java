package br.com.rafaj2ee.util;

public enum EstadoCivil {
	SOLTEIRO, 
	CASADO(false), 
	SEPARADO(false) {
		public void casaDeNovo() {
			System.out.println("FAIL");
		}
	}, 
	VIUVO(true);
	private boolean feliz;
	public boolean getStatus() {
		return this.feliz;
	}
	public void setStatus(boolean feliz) {
		this.feliz = feliz;
	}
	EstadoCivil(boolean feliz) {
		this.feliz = feliz;
	}
	EstadoCivil() {
	}
	public void casaDeNovo(){
		System.out.println("TODOS");
	};
}
