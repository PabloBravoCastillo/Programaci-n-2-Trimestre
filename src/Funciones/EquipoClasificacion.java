package Funciones;


public class EquipoClasificacion {
	
	private Equipo equipo;
	private int jugados=0;
	private int ganados=0;
	private int perdidos=0;
	private int empatados=0;
	private int golesFavor=0;
	private int golesContra=0;
	private int diferenciaGoles=0;
	private int puntos=0;
	
	public Equipo getEquipo() {
		return equipo;
	}
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	public int getJugados() {
		return jugados;
	}
	public void setJugados(int jugados) {
		this.jugados = jugados;
	}
	public int getGanados() {
		return ganados;
	}
	public void setGanados(int ganados) {
		this.ganados = ganados;
	}
	public int getPerdidos() {
		return perdidos;
	}
	public void setPerdidos(int perdidos) {
		this.perdidos = perdidos;
	}
	public int getgFavor() {
		return golesFavor;
	}
	public void setgFavor(int gFavor) {
		this.golesFavor = gFavor;
	}
	public int getgContra() {
		return golesContra;
	}
	public void setgContra(int gContra) {
		this.golesContra = gContra;
	}
	public int getdGoles() {
		return diferenciaGoles;
	}
	public void setdGoles(int dGoles) {
		this.diferenciaGoles = dGoles;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	public void addGolesFavor(int valor) {
		this.golesFavor+=valor;
		this.diferenciaGoles+=valor;
	}
	
	public void addGolesContra(int valor) {
		this.golesContra+=valor;
		this.diferenciaGoles-=valor;
	}
	
	public void addVictoria() {
		this.jugados++;
		this.ganados++;
		this.puntos+=3;
	}
	
	public void addEmpate() {
		this.jugados++;
		this.empatados++;
		this.puntos++;
	}
	
	public void addDerrota() {
		this.jugados++;
		this.perdidos++;
	}
	
	@Override
	public String toString() {
		String cadena= equipo.getNombre();
		int longitud = cadena.length();
		int tabuladores = 6;
		int tabEquipo = longitud/8;
		for (int i=0; i<tabuladores-tabEquipo;i++) {
			cadena+="\t";
		}
		cadena+=jugados+"\t"+ganados+"\t"+perdidos+"\t"+
				empatados+"\t"+golesFavor+"\t"+golesContra+"\t"+diferenciaGoles+"\t"+puntos+"\n";
		return cadena;
	}
}