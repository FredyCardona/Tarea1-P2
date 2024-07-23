package gt.edu.miumg.TareaUML;

public class Ogro extends Personaje implements Villano{

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

    public Ogro(String nombre, String descripcion, long tamanio, int vida, int poder) {
        super(nombre, descripcion, tamanio, vida, poder);
    }
}
