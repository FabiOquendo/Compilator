package Logica;

public class SymbolTable {
	
	String tipo;
	String valor;
	
	public SymbolTable(String tipo, String valor){
		this.tipo=tipo;
		this.valor=valor;
	}
	
	public String getTipo(){
		return tipo;
	}
	public String getValor(){
		return valor;
	}
}
