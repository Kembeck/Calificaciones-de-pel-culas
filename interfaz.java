import java.util.Scanner;


public class interfaz {
 public Scanner scanner;

 public interfaz(){
    scanner=new Scanner(System.in);

 }

    public void mostrarInformacion(usuario usuario) {
    System.out.println("Nombre: " + usuario.getNombre());
    System.out.println("Nombre de usuario: " + usuario.getNombreUsuario());
    System.out.println("Edad: " + usuario.getEdad());
    }
    

    public void mostrarMenu(){
        System.out.println("Menu");
        System.out.println("1. Registar pelicula");
        System.out.println("2. Consultar Calificación");
        System.out.println("3. Modificar Calificacion");
        System.out.println("4. Calcular Promedio");
        System.out.println("5. Mostrar Calificacion Mayor");
        System.out.println("6. Mostrar Calificacion Menor");
        System.out.println("7. Mostrar Cantidad de Calificaciones");
        System.out.println("8. Mostrar Espacios Disponibles");
        System.out.println("9. Salir");

    }
    public int solicitarOpcion(){
        System.out.println("Selleccione una opcion: ");
        return Integer.parseInt(scanner.nextLine());

    }
    public String solicitarNombre(){
        System.out.println("Ingrese su nombre: ");
        return scanner.nextLine();
    }
    public String solicitarNombreUsuario(){
        System.out.println("Ingrese su nombre de usuario: ");
        return scanner.nextLine();
    }
    public int solicitarEdad(){
        System.out.println("Ingrese su edad: ");
        return Integer.parseInt (scanner.nextLine());
    }
    public String solicitarNombrePelicula(){
        System.out.println("Ingrese el nombre de la pelicula: ");
        return scanner.nextLine();
    }
    public int solicitarNumeroPelicula(){
        System.out.println("Ingrese el numero de la Pelicula 1-10: ");
        return Integer.parseInt(scanner.nextLine());
    }
    public int solicitarCalificaion(){
        System.out.println("Ingrese la calificaion de la Pelicula 0-10: ");
        return Integer.parseInt(scanner.nextLine());
    }
    public static void main(String[] args) {
        interfaz interfaz = new interfaz();

        String nombre=interfaz.solicitarNombre();
        String Usuario=interfaz.solicitarNombreUsuario();
        int edad=interfaz.solicitarEdad();

        usuario usuario = new usuario(nombre, Usuario, edad);

        interfaz.mostrarInformacion(usuario);

        int opcion=0;

        while (opcion!=9){
            interfaz.mostrarMenu();
            opcion = interfaz.solicitarOpcion();
            if (opcion==1){

                String nombrePelicula = interfaz.solicitarNombrePelicula();
                int calificacion = interfaz.solicitarCalificaion();

                int numeroPelicula = usuario.obtenerCantidadCalificaciones() + 1;

                pelicula pelicula = new pelicula(
                   nombrePelicula, numeroPelicula
                    );

                boolean registrada= usuario.registrarCalificacion(pelicula, calificacion);
                
                if (registrada==true){
                    System.out.println("Pelicula regustrada");

                }
                else{
                    System.out.println("Alcanzo la cantidad maxima de registros disponibles");

                }
             }

            else if(opcion==2){
                int numeroPelicula=interfaz.solicitarNumeroPelicula();
                int resultado=usuario.consultarCalificacion(numeroPelicula);
                if (resultado==-1){
                    System.out.println("Pelicula no encontrada");

               }
               else{
                System.out.println("La calificacion es: "+ resultado);

               }
             }
            else if(opcion==3){
                 int numeroPelicula =
                    interfaz.solicitarNumeroPelicula();

                 int nuevaCalificacion =interfaz.solicitarCalificaion();

                 boolean modificada = usuario.modificarCalificacion(
                            numeroPelicula,
                            nuevaCalificacion
                    );
                 if (modificada == true) { 
                    System.out.println( "Calificación modificada");
                } 
                else {
                    System.out.println("Película no encontrada");
                }
            }
            else if (opcion==4){
                double promedio=usuario.calcularPromedio();
                System.out.println("El promedio es: "+ promedio);

            }
            else if(opcion==5){
                int mayor=usuario.obtenerCalificacionMayor();
                System.out.println("La calificacion mayor es: "+ mayor);

                
            }
            else if(opcion==6){
                int menor=usuario.obtenerCalificacionMenor();
                System.out.println("La calificaion menor es de: "+menor);

            }
            else if (opcion==7){
                int cantidad=usuario.obtenerCantidadCalificaciones();
                System.out.println("La cantidad de calificaciones registradas es de : "+cantidad);
            }
            else if (opcion==8){
                int espacion=usuario.obtenerEspaciosDisponibles();
                System.out.println("La cantidad de espacios disponibles es de: " + espacion);
            }

            else{
                System.out.println("Seleccionar una opcion del 1 al 8");
            }

        
        }

    }

}
