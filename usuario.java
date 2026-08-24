public class usuario {
    private String nombre;
    private String nombreUsuario;
    private int edad;
    private Pelicula[] peliculas;
    private int[] calificaciones;
    private int cantidadDeCalificaciones;

    public usuario (String nombre, int edad, String nombreUsuario){
        this.nombre=nombre;
        this.edad=edad;
        this.nombreUsuario=nombreUsuario;
        peliculas=new Pelicula[10];
        calificaciones = new int[10];
        cantidadDeCalificaciones=0;


    }

    public boolean registrarCalificacion (Pelicula pelicula, int calificaciones){
        if (cantidadDeCalificaciones<10){
            pelicula[cantidadDeCalificaciones]=peliculas;
            calificaciones[cantidadDeCalificaciones]=calificaciones;

            cantidadDeCalificaciones = cantidadDeCalificaciones + 1;
            return true;

        }
        return false;


    }

    public int consultarCalificaion(int numeroPelicula){
        for(int i = 0; i < cantidadDeCalificaciones; i++){
            if (peliculas[i].getNumero()==numeroPelicula){
                return calificaciones[i];
            }
        }
        return -1;

    }


    
}
