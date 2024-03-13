/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaslink3;

/**
 *
 * @author ASUS
 */
public class ListaSimpleLink {

 
    private Nodo primero;

    public ListaSimpleLink() {
        primero = null;
    }

    public void insertInicio(Estudiante dato) {
        Nodo nuevo = new Nodo(dato, primero);
        primero = nuevo;
    }

    public void insertFinal(Estudiante dato) {
        Nodo nuevo = new Nodo(dato, primero);
        if (primero == null) {
            primero = nuevo;
        } else {
            Nodo actual = primero;
            while (actual.getNext() != null) {
                actual = actual.getNext();

            }
            actual.setNext(nuevo);
        }
    }

    public void ContarElementosSexo() {
        int contH = 0;
        int cantidadH = 0;
        int contF = 0;
        int cantidadF = 0;
        Nodo actual = primero;
        while (actual != null) {
            if  (actual.getDato().getSexo()== 'f') {
                cantidadF = contF++;
            } else {
                cantidadH = contH++;
            }
            actual = actual.getNext();
        }
        System.out.println("La cantidad de hombres es : " + cantidadH + " y la cantidad de mujeres es " + cantidadF);
    }

    public void borrar(String nombre) {
   
        if (primero == null) {
            System.out.println("lista vacía");
        } else if ( estudiante.getNombre().equals(nombre)) {
            primero = primero.getNext();
        } else {
            Nodo actual = primero;
            while (actual.getNext() != null && actual.getNext().estudiante.getNombre() != nombre) {
                actual = actual.getNext();
            }
            if (actual.getNext() == null) {
                System.out.println("elemento " + nombre + " no esta en la lista");
            } else {
                actual.setNext(actual.getNext().getNext());
            }
        }
    }

    public void calcularEdadPromedio() {
        Nodo actual = primero;
        int cont = 0;
        int cantidadEstudiantes = 0;
        int sumaEdad = 0;
        int promedio = 0;
        while (actual != null) {
            sumaEdad += actual.
            cantidadEstudiantes = cont++;

            actual = actual.getNext();
        }

        promedio = sumaEdad / cantidadEstudiantes;
        System.out.println("La edad promedio es : " + promedio);
    }

    public boolean ListaVacia() {

        if (primero == null) {
            return true;
        } else {
            return false;
        }
    }

    public void MostarLista() {

        Estudiante actual = primero;
        while (actual != null) {
            System.out.println(actual.getNombre() + " " + actual.getEdad() + " " + actual.getSexo() + " " + actual.getProgramaEstudia());
            actual = actual.getNext();
        }
    }

}
