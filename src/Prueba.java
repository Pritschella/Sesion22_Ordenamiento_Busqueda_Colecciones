import java.util.ArrayList;
import java.util.Collections;

/*
 * Framework Colecciones Java
 * 
 * INTERFACES
 * 	Set 	NO permite duplicados
 * 	List 	S� permite duplicados 
 * 	Map 	NO permite duplicados de CLAVES (pares CLAVE-VALOR)
 * 
 * 	Implementaciones 
 * 	Set -> HashSet, LinkedHashSet y Treeset	
 * 	List -> ArrayList y LinkedList
 * 	Map -> HashMap, LinkedHasMap y TreeMap
 * 
 * CLASES
 * 	Vector
 * 	Que
 * 	Deque
 * 	Stack
 * 
 */


public class Prueba {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(10);
		numeros.add(4);
		numeros.add(-9);
		numeros.add(32);
		numeros.add(-1);
		
		System.out.println(numeros.toString());
		
		//MergeSort
		Collections.sort(numeros);
		System.out.println(numeros.toString());
		
		ArrayList<String> nombres = new ArrayList<>();
		nombres.add("Luke");
		nombres.add("Leia");
		nombres.add("Anakyn");
		nombres.add("Obi Wan Kenobi");
		
		ArrayList<String> copiaNombres = ((ArrayList<String>) nombres.clone());
		
		System.out.println(nombres.toString());
		Collections.sort(nombres);
		System.out.println(nombres.toString());
		
		System.out.println("=== Ordenamiento en orden inverso ===");
		System.out.println(copiaNombres.toString());
		Collections.sort(copiaNombres, Collections.reverseOrder());
		System.out.println(copiaNombres.toString());
		
		class Alumno implements Comparable<Alumno>{
			String numControl;
			Integer edad;
			
			public Alumno(String numControl, int edad) {
				super();
				this.numControl = numControl;
				this.edad = edad;
			}

			@Override
			public String toString() {
				return "Alumno [numControl=" + numControl + ", edad=" + edad + ", getClass()=" + getClass()
						+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
			}
/*
			@Override
			public int compareTo(Alumno o) {
				
				return numControl.compareTo(o.numControl);
			}
			*/
			
			public int compareTo(Alumno o) {
				
				return edad.compareTo(o.edad);
			}
			
		}//ClaseAlumno
		
		Alumno a1 =  new Alumno("17", 20);
		Alumno a2 =  new Alumno("173", 1);
		Alumno a3 =  new Alumno("7", 56);
		Alumno a4 =  new Alumno("878", 30);
		Alumno a5 =  new Alumno("3", 7);
		
		ArrayList<Alumno> alumnos = new ArrayList<>();
		alumnos.add(a1);
		alumnos.add(a2);
		alumnos.add(a3);
		alumnos.add(a4);
		alumnos.add(a5);
		
		System.out.println(alumnos.toString());
		
		//ORDENAR LOS ALUMNOS
		Collections.sort(alumnos);
		System.out.println();
		
		System.out.println(Collections.binarySearch(numeros, -1));
		
		//TAREA; APLICAR BINARY SEARCH EN COLLECTION ALUMNOS
		
		System.out.println();
		System.out.println(Collections.binarySearch(alumnos, new Alumno("1", 1)));

	}//main

}//clase
