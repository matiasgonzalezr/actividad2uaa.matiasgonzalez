package py.edu.uaa.pooj.actividad2;

import java.util.Date;

public class Prestamo {
	
	private Lector lector;
	private Ejemplar ejemplares;
	private boolean estado;
	private Date fechaPrestamo;
	
	public Prestamo(){
		
	}
	
	public void realizarPrestamo(){
		
	}
	
	public void consultarEstadoPrestamo(){
		
	}
	
	public void librosAdeudadosLector(){
		
	}

	public Lector getLector() {
		return lector;
	}

	public void setLector(Lector lector) {
		this.lector = lector;
	}

	public Ejemplar getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(Ejemplar ejemplares) {
		this.ejemplares = ejemplares;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}
	
	
}
