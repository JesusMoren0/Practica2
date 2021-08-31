import java.util.Scanner;
public class prtc2 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int opc = 0;
		int lista = 0;
		//Aqui se generan los datos fijos a la hora de ejecutar
		Estudiante std1 = new Estudiante (null, 0, null, 0, null);
		Estudiante std2 = new Estudiante (null, 0, null, 0, null);
		Estudiante std3 = new Estudiante (null, 0, null, 0, null);
		Estudiante std4 = new Estudiante (null, 0, null, 0, null);
		Estudiante std5 = new Estudiante (null, 0 ,null, 0, null);
		Estudiante array5[] = new Estudiante[] {std1,std2,std3,std4,std5};
		//Aqui se generan los datos que el usuario debe de agregar.
		Estudiante std6 = new Estudiante (null, 0, null, 0, null);
		Estudiante std7 = new Estudiante (null, 0, null, 0, null);
		Estudiante std8 = new Estudiante (null, 0, null, 0, null);
		Estudiante std9 = new Estudiante (null, 0, null, 0, null);
		Estudiante std10 = new Estudiante (null, 0, null, 0, null);
		Estudiante array10[] = new Estudiante[] {std6,std7,std8,std9,std10};
		
		System.out.println();
		//////////////////////
		std1.nombre = "Jesus";
		std1.numControl = 99;
		std1.materia = "Ciencias";
		std1.calificacion = 89;
		std1.estado = "Aprobado";
		//////////////////////
		std2.nombre = "Frijolito";
		std2.numControl = 7;
		std2.materia = "Deporte";
		std2.calificacion = 70;
		std2.estado = "Aprobado";
		//////////////////////
		std3.nombre = "La pulga";
		std3.numControl = 25;
		std3.materia = "Quimica";
		std3.calificacion = 50;
		std3.estado = "Reprobado";
		//////////////////////
		std4.nombre = "Morde";
		std4.numControl = 36;
		std4.materia = "Matematicas";
		std4.calificacion = 10;
		std4.estado = "Aprobado";
		//////////////////////
		std5.nombre = "Jake";
		std5.numControl = 78;
		std5.materia = "Artes";
		std5.calificacion = 10;
		std5.estado = "Aprobado";
		
		for(int i=0;i<array5.length;i++) {
			System.out.println();
			System.out.println("Alumno | Numero de control | Materia | calificacion | Estado ");
			System.out.println(array5[i].nombre+" | "+array5[i].numControl+" | "+array5[i].materia+" | "+array5[i].calificacion+" | "+array5[i].estado);
		}
	//Menu de opciones del cual el usuario puede interactuar con el programa.
		do {
			System.out.println();
			System.out.println("Menu");
			System.out.println("1.Introducir alumnos.");
			System.out.println("2.Imprimir nombres.");
			System.out.println("3.Cambiar calificacion.");
			System.out.println("4.Salir.");
			System.out.println();
			System.out.println("Introduce una opcion.");
			opc = sc.nextInt();
			
			switch(opc) {
			case 1:
				nombres_agregar(array10);
				break;
			case 2:
				mostrar_nombres(array5,array10);
				break;
			case 3:
				cambiar_calificacion(lista,array10,array5);
				break;
			case 4:
				break;
				default:
					System.out.println("Opcion no valida...");
			}
		}
		while(opc!=4);
		System.out.println("Programa finalizado...");
	}
	//Metodo en el cual se agregan los 5 datos que el mismo usuario debe de ingresar.
	static void nombres_agregar(Estudiante[]array10) {
		for(int i=0;i<array10.length;i++) {
			array10[i].nombre = CapturaEntrada.capturarCadena((i+1)+". Ingrese nombre");
			array10[i].numControl = CapturaEntrada.capturarEntero((i+1)+". Introduce el numero de control");
			array10[i].materia = CapturaEntrada.capturarCadena((i+1)+". Introduce materia");
			array10[i].calificacion = CapturaEntrada.capturarEntero((i+1)+". Introduce calificacion");
			array10[i].estado = CapturaEntrada.capturarCadena((i+1)+". Introduce estado");
			System.out.println();
		}
		
	}
	//Metodo el cual el usuario puede imprimir los 10 una ves obtenidos o ingresados.
	static void mostrar_nombres(Estudiante[]array5,Estudiante[]array10) {
		for(int i=0;i<array5.length;i++) {
			System.out.println();
			System.out.println(array5[i].nombre+" | "+array5[i].numControl+" | "+array5[i].materia+" | "+array5[i].calificacion+" | "+array5[i].estado);
		}
		//////////////////////////////////////////////////////////////////////////////////////////
		for(int i=0;i<array10.length;i++) {
			System.out.println();
			System.out.println(array10[i].nombre+" | "+array10[i].numControl+" | "+array10[i].materia+" | "+array10[i].calificacion+" | "+array10[i].estado);
		}
		
	}
	//Metodo el cual se encarga de cambiar las calificaciones de un usuario en concreto de la lista de los 10 alumnos.
		static int cambiar_calificacion(int list,Estudiante[]array10,Estudiante[]array5) {
			System.out.println("Introduce el alumno de 1 a 10 para cambiar calificacion.");
			int lista = sc.nextInt();
			if(lista >=1 || lista <=5) {
				System.out.println("Inserte la calificacion a cambiar.");
			int calif = sc.nextInt();
			array5[lista-1].calificacion = calif;
			System.out.println("La calificacion de "+array5[lista-1].nombre+" cambio a = "+array5[lista-1].calificacion);
			}else if(lista>=6 || lista<=10) {
				System.out.println("Inserte la calificacion a cambiar.");
				int calif = sc.nextInt();
				array10[lista-1].calificacion = calif;
				System.out.println("La calificacion de "+array10[lista-1].nombre+" cambio a = "+array10[lista-1].calificacion);
			}
			return lista;
}
		
	//////////////////////////////////////////////////
	//Captura de entradas para los 5 datos de los 5 alumnos que el usuario debe de ingresar.
	class CapturaEntrada{
		
	    public static int capturarEntero(String msg){
	        Scanner sc = new Scanner(System.in);
	        System.out.print(""+msg+": ");
	        return (sc.nextInt());
	    }

	    public static float capturarFlotante(String msg){
	        Scanner sc = new Scanner(System.in);
	        System.out.print(""+msg+": ");
	        return (sc.nextFloat());
	    }
	    public static String capturarCadena(String msg){
	        Scanner sc = new Scanner(System.in);
	        System.out.print(""+msg+": ");
	        return (sc.nextLine());
	    }
	}
	

}
