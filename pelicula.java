public class pelicula {
    private String nombre;
    private int numero;

    public pelicula(String nombre, int numero){
        this.nombre=nombre;
        this.numero=numero;
    
    }

    public String getNombre(){
        return nombre;
    }
    public int getNumero(){
        return numero;
    }

}
