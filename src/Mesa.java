public class Mesa {
    public static final int NUMERO_PATAS = 4;
    private Object objeto;
    private Pata[] patas;
    private Color color;
    private int capacidad;
    private int restante;

    public Mesa(Color color, int capacidad) {
        this.color = color;
        this.capacidad = capacidad;
        this.patas = new Pata[NUMERO_PATAS];
        for (Pata pata : this.patas) {
            pata = new Pata();
        }
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void poner(Object objeto, int ocupacion) {
        if (getCapacidad() <= 0 || ocupacion > restante ) {
            System.out.println("No se puede colocar objeto: " + objeto);

        }

        this.objeto = objeto;
        restante = capacidad - ocupacion;
        capacidad = restante;
        System.out.println("La mesa tiene un objeto: " + this.objeto);
        System.out.println("Capacidad restante: " + restante);
    }

    private boolean laMesaEstaVacía() {

        return this.objeto == null;

    }


    public Object quitar() {
        if (laMesaEstaVacía()) {
            System.out.println("No hay nada que quitar");
            return null;
        }
        Object objeto = this.objeto;
        this.objeto = null;
        System.out.println("Se ha quitado el objeto: " + objeto);
        return objeto;
    }
}
