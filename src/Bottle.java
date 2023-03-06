public class Bottle {
    public static void main(String[] args) {

        Bottle[] bottle = new Bottle[3];

        bottle[0] = new Bottle(3,5);

        bottle[1] = new Bottle(4,5);

        bottle[2] = new Bottle(3,5);

        bottle[0].transferirAgua(3,bottle[2]);
        System.out.println(bottle[0].getCantidadAgua());
        System.out.println(bottle[2].getCantidadAgua());
bottle[0].getCantidadAgua();



    }

    double cantidadAgua;
    double capacidadBotella;

    Bottle(double cantidadAgua, double capacidadBotella){
        this.cantidadAgua = cantidadAgua;
        this.capacidadBotella = capacidadBotella;
    }



    boolean sacarAgua(double cantidad){
        if (cantidadAgua >= cantidad && cantidadAgua <=capacidadBotella)
        this.cantidadAgua -= cantidad;
        else
            return false;

        return true;
    }

    boolean ponerAgua(double cantidad){
        if(cantidadAgua >= cantidad && cantidadAgua <=capacidadBotella)
        this.cantidadAgua += cantidad;
        else
        return false;

        return true;
    }

    void transferirAgua (double cantidad, Bottle transferirABotella){
        if(this.sacarAgua(cantidad))
            transferirABotella.ponerAgua(cantidad);
        else
            System.out.println("No hay sufiecente agua para transferir");
    }

    public double getCantidadAgua() {
        return cantidadAgua;
    }

    public void setCantidadAgua(double cantidadAgua) {
        this.cantidadAgua = cantidadAgua;
    }

}
