package listaslink3;

public class Nodo {

    private Estudiante Dato;
    private Nodo Next;

    public Nodo(Estudiante Dato, Nodo Next) {
        this.Dato = Dato;
        this.Next = Next;
    }

    public Estudiante getDato() {
        return Dato;
    }

    public void setDato(Estudiante Dato) {
        this.Dato = Dato;
    }

    public Nodo getNext() {
        return Next;
    }

    public void setNext(Nodo Next) {
        this.Next = Next;
    }

   

}
