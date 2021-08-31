//Aqui estan los datos/variables para los 5 alumnos a capturar en el programa.
public class Estudiante {
	
	String nombre;
	int numControl;
	String materia;
	int calificacion;
	String estado;
	
	
	//Método constructor
	//Aquí están los parametros que debe obtenerse del objeto
	//alumno al ser utilizado
	public Estudiante(String nombre, int numControl, String materia, int calificacion, String estado) {
		setNombre(nombre);
		setNumcontrol(numControl);
		setMateria(materia);
		setCalificacion(calificacion);
		setEstado(estado);
	}
	
	//Esta es la seccion  de metodos: setters, getters
	/*
	 * Siendo los setters los que asignaran el valor/atributo y 
	 * los getters los que regresaran un valor/atributo
	 */
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setNumcontrol(int numControl) {
		this.numControl = numControl;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	////////////////////////////////////////////
	
	public String getNombre() {
		return nombre;
	}
	public int getNumcontrol() {
		return numControl;
	}
	public String getMateria() {
		return materia;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public String getEstado() {
		return estado;
	}

}
