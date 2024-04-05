package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNota;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alumno alumno = generarAlumno();
		
		System.out.println(alumno.toString());
		
		registrarNotas(alumno,2);
		
		}

	public static Alumno generarAlumno() {
		Alumno alumno = new Alumno();
		
		Scanner scanner = new  Scanner(System.in);
		
		System.out.println("Ingrese legajo:");
		Integer legajo = scanner.nextInt();
		System.out.println("Ingrese Apellido:");
		String apellido = scanner.next();
		System.out.println("Ingrese Nombre:");
		String nombre = scanner.next();
		
		alumno.setLegajo(legajo);
		alumno.setApellido(apellido);
		alumno.setNombre(nombre);
		//scanner.close();
		return alumno;
		
	}
	public static void registrarNotas(Alumno alumno, int numMaterias) {
		
		Scanner scanner = new  Scanner(System.in);
		
		while(numMaterias <= 2) {
			System.out.println("Ingrese el Codigo de la materia:");
			String codigoMateria = scanner.next();
			System.out.println("Ingrese el Nombre de la materia:");
			String nombreMateria = scanner.next();
			
			Materia materia = new Materia(codigoMateria,nombreMateria); // creamos un objeto para cada meteria
			
			System.out.println("Ingrese el Codigo del Registro de Nota:");
			String codigoNota = scanner.next();
			System.out.println("Ingrese Nota:");
			Float nota = scanner.nextFloat();
			
			RegistroNota registroNota = new RegistroNota(codigoNota, alumno, materia, nota);//creamos objeto del registro de notas
			
			System.out.println(registroNota.toString());//muestro por pantalla
			
			numMaterias++;
		}
		scanner.close();
	}
}
