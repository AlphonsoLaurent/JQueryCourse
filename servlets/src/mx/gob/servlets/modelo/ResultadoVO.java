package mx.gob.servlets.modelo;

public class ResultadoVO {
	private String items;
	private int puntuacion;
	private String interpretacion;
	private String nivel;
	private String aptitud;
	
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public int getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	} 
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public String getAptitud() {
		return aptitud;
	}
	public void setAptitud(String aptitud) {
		this.aptitud = aptitud;
	}
	@Override
	public String toString() {
		return "ResultadoVO [items=" + items + ", puntuacion=" + puntuacion + ", interpretacion=" + interpretacion
				+ "]";
		
	}
	
	
	
	
}
