package gt.edu.miumg.TareaUML;

public class Enano extends Personaje implements Heroe {

    @Override
    public void atacar() {

    }

    @Override
    public void defender() {

    }

    @Override
    public void recibirAtaque() {

    }

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

    public String habitat;

    public Enano(String nombre, String descripcion, long tamanio, int vida, int poder, String habitat) {
        super(nombre, descripcion, tamanio, vida, poder);
        this.habitat = habitat;
    }
}
