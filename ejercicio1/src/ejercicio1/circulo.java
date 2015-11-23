package ejercicio1;

public class circulo {
	/*crear una clase circulo con el atributo radio, y el metodo getArea(). crear dos
	 * constructores, el primero sin argumentos, el segundo con el parametro de entrada*/
	 
	private double radio;
	
	public circulo(){	
	}
	
	public circulo(double radioParam){
		this.radio=radioParam;	
		}
	
	public void setRadio(double radioParam){
		this.radio=radioParam;
	}
	
	public double getRadio(){
		return this.radio;
	}
	
    
	public double getArea(){
		return Math.PI*radio*radio;
	}
}
