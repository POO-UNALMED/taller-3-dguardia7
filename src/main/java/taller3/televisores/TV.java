package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 150;
	private boolean estado;
	private int volumen = 1;
	Control control;
	private static int numTV;
	
	public TV (Marca marca, Boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTV ++;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public void setControl(Control control) {
		this.control = control;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public void setVolumen(int volumen) {
		if(estado == true) {
			if(volumen <= 7 && volumen >= 0) {
				this.volumen = volumen;
			}
		}
	}
	public void setCanal(int canal) {
		if(estado == true) {
			if (canal <= 120 && canal >= 1) {
				this.canal = canal;
			}
		}
	}
	public Marca getMarca() {
		return marca;
	}
	public Control getControl() {
		return control;
	}
	public int getPrecio() {
		return precio;
	}
	public int getVolumen() {
		return volumen;
	}
	public int getCanal() {
		return canal;
	}
	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	public static int getNumTV() {
		return numTV;
	}
	public void turnOn() {
		estado = true;
	}
	public void turnOff() {
		estado = false;
	}
	public boolean getEstado() {
		return estado;
	}
	public void canalUp() {
		if(estado == true) {
			if (canal <= 120 && canal >= 1) {
				canal++;
			}
		}
	}
	public void canalDown() {
		if(estado == true) {
			if (canal <= 120 && canal >= 1) {
				canal--;
			}
		}
	}
	public void volumenUp() {
		if(estado == true) {
			if(volumen < 7 && volumen >= 0) {
				volumen++;
			}
		}
	}
	public void volumenDown() {
		if(estado == true) {
			if(volumen <= 7 && volumen > 0) {
				volumen--;
			}
		}
	}
}
