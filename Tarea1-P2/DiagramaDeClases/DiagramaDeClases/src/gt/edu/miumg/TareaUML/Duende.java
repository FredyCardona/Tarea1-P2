package gt.edu.miumg.TareaUML;

public class Duende extends Personaje implements Villano{
    @Override
    public void desplazarce() {

    }

    @Override
    public int mostrarVida() {
        return 0;
    }

    @Override
    public void mostrarPoder() {

    }

    @Override
    public void atacar() {

    }

    @Override
    public void destruir() {

    }

    public String color;

    public Duende(String nombre, String descripcion, long tamanio, int vida, int poder, String color) {
        super(nombre, descripcion, tamanio, vida, poder);
        this.color = color;
    }
}
