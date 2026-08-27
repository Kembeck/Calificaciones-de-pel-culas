public class usuario {
    private String nombre;
    private String nombreUsuario;
    private int edad;
    private pelicula[] peliculas;
    private int[] calificacion;
    private int cantidadDeCalificaciones;

    public usuario (String nombre, String nombreUsuario, int edad){
        this.nombre=nombre;
        this.edad=edad;
        this.nombreUsuario=nombreUsuario;
        peliculas=new pelicula[10];
        calificacion = new int[10];
        cantidadDeCalificaciones=0;


    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public int getEdad() {
        return edad;
    }

    public boolean registrarCalificacion (pelicula pelicula, int calificacion){
        if (cantidadDeCalificaciones<10){
            peliculas[cantidadDeCalificaciones]=pelicula;
            this.calificacion[cantidadDeCalificaciones]=calificacion;

            cantidadDeCalificaciones = cantidadDeCalificaciones + 1;
            return true;

        }
        return false;


    }

    public int consultarCalificacion(int numeroPelicula){
        for(int i = 0; i < cantidadDeCalificaciones; i++){
            if (peliculas[i].getNumero()==numeroPelicula){
                return calificacion[i];
            }
        }
        return -1;

    }

    public boolean modificarCalificacion(int numeroPelicula, int nuevaCalificacion){
        for(int i=0; i<cantidadDeCalificaciones; i++){
            if (peliculas[i].getNumero()==numeroPelicula){
             calificacion[i]=nuevaCalificacion;
             return true;
              }
              }
        return false;
    }
    public double calcularPromedio(){
        if (cantidadDeCalificaciones == 0) {
            return 0;
        }
        int suma = 0;
        for (int i=0; i<cantidadDeCalificaciones; i++){
            suma = suma + calificacion[i];
        }
        return (double)suma/cantidadDeCalificaciones;
    }

    public int obtenerCalificacionMayor(){
        if (cantidadDeCalificaciones == 0) {
            return 0;
        }
        int mayor=calificacion[0];
        for (int i=1; i<cantidadDeCalificaciones; i++){
            if (calificacion[i]>mayor){
                mayor=calificacion[i];
            }

        }
        return mayor;
    }

    public int obtenerCalificacionMenor(){
        if(cantidadDeCalificaciones == 0){
            return 0;
        }
        int menor = calificacion[0];
        for (int i=1; i<cantidadDeCalificaciones; i++){
            if(calificacion[i]<menor){
                menor=calificacion[i];
            }
        }
        return menor;
    }
    public int obtenerCantidadCalificaciones(){
        return cantidadDeCalificaciones;
        

    }
    public int obtenerEspaciosDisponibles(){
        return 10-cantidadDeCalificaciones;
    }


    
}
