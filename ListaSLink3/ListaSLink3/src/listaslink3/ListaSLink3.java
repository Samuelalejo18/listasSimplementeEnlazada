/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaslink3;

import java.util.Scanner;

/**
 * Lista simplemente enlzada: - Inserta el nodo al inicio. - inserta el nodo al
 * final - Cuenta la cantidad de nodos - Muestra la lista - método para saber si
 * la lista está vacia - Borrar elementos de la lista
 */
public class ListaSLink3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaSimpleLink Lst = new ListaSimpleLink();

        Lst.insertInicio("Samuel", 19, 'M', "Ingenieria de sistemas");
        Lst.insertInicio("Daniel", 19, 'M', "Spicologia");
        Lst.insertInicio("Sofia", 20, 'F', "Ingenieria de sistemas");
        Lst.insertInicio("Alejandra", 21, 'F', "Spicologia");
        int opcion = sc.nextInt();
        while (opcion != 0) {

            System.out.println("Ingresa la opción:");
            System.out.println("1.  Registras a cuatro estudiantes insertando los nodos al inicio de la lista");
            System.out.println("2.Borrar un estudiante seleccionado");
            System.out.println("3. Determinar la cantidad de estudiantes del sexo seleccionado por el usuario. ");
            System.out.println("4, Calcular la edad promedio de los estudiantes.");
            System.out.println("5,Agregar dos estudiantes al final de la lista.");
            switch (opcion) {
                case 1: {
                    int repetidor = 0;
                    while (repetidor == 4) {
                        System.out.println("Ingrese nombre del estudiante");
                        String nombre = sc.next();
                        System.out.println("Ingrese edad del estudiante");
                        int edad = sc.nextInt();
                        System.out.println("Ingrese sexo del estudiante");
                        char sexo = sc.next().charAt(0);
                        System.out.println("Ingrese programa del estudiante");
                        String programa = sc.next();
                        Lst.insertInicio(nombre, edad, sexo, programa);
                    }
                    break;
                }
                case 2: {
                    System.out.println("Ingrese el nombre del estudiante a borrar : ");
                    String nombre = sc.next();
                    Lst.borrar(nombre);
                    break;
                }
                case 3: {
                    Lst.ContarElementosSexo();
                    break;
                }
                case 4: {
                    Lst.calcularEdadPromedio();
                    break;
                }
                case 5: {
                    int repetidor = 0;
                    while (repetidor == 2) {
                        System.out.println("Ingrese nombre del estudiante");
                        String nombre = sc.next();
                        System.out.println("Ingrese edad del estudiante");
                        int edad = sc.nextInt();
                        System.out.println("Ingrese sexo del estudiante");
                        char sexo = sc.next().charAt(0);
                        System.out.println("Ingrese programa del estudiante");
                        String programa = sc.next();
                        Lst.insertFinal(nombre, edad, sexo, programa);
                    }
                    break;
                }
                case 0: {
                    System.out.println("Saliendo de la biblioteca. ¡Hasta luego!"); // Impresión de mensaje de tiempo constante, O(1)
                    break;
                }
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida."); // Impresión de mensaje de tiempo constante, O(1)
            }
        }

    }
}
