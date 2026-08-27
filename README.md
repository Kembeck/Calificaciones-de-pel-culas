# Ejercicio-2
- Ejercicio 2
# Integrantes
- Lourdes Lemus
- Kembeck López

# Análisis

## 1. ¿Qué propiedades y métodos tendrá cada clase?

### Clase Usuario:
Representar al usuario activo del sistema y mantener el conjunto de películas y calificaciones que ha registrado.

### Propiedades:
- nombre: almacena el nombre de la persona.
- nombreUsuario: almacena su nombre de usuario.
- edad: almacena la edad.
- peliculas: arreglo que contiene las películas registradas.
- calificaciones: arreglo que contiene las calificaciones registradas.
- cantidadCalificaciones: indica cuántas posiciones de los arreglos han sido utilizadas.

### Métodos:
- Usuario(String nombre, String nombreUsuario, int edad): inicializa un nuevo usuario sin películas calificadas.
- registrarCalificacion(Pelicula pelicula, int calificacion): agrega una película y su calificación en la siguiente posición disponible.
- consultarCalificacion(int numeroPelicula): obtiene una calificación registrada utilizando el número de película.
- modificarCalificacion(int numeroPelicula, int nuevaCalificacion): modifica una calificación existente.
- calcularPromedio(): calcula el promedio de las calificaciones registradas.
- obtenerCalificacionMayor(): determina la puntuación más alta.
- obtenerCalificacionMenor(): determina la puntuación más baja.
- obtenerCantidadCalificaciones(): devuelve la cantidad de películas calificadas.
- obtenerEspaciosDisponibles(): devuelve cuántos espacios quedan disponibles.

### Clase Pelicula:
Representar una película registrada en el sistema.

### Propiedades:
- nombre: almacena el nombre de la película.
- numero: identifica la película según su orden de registro.

### Métodos:
- Pelicula(String nombre, int numero): crea una película con su nombre y número correspondiente.
- getNombre(): devuelve el nombre de la película.
- getNumero(): devuelve el número de la película.

### Clase Interfaz:
Encargarse de la interacción con la persona que utiliza el programa. Mostrará el menú, solicitará datos y presentará resultados.

### Propiedades:
- scanner: objeto utilizado para recibir datos desde la consola.

### Métodos:
- Interfaz(): inicializa la interfaz.
- mostrarMenu(): muestra las nueve opciones del programa.
- solicitarOpcion(): solicita la opción del menú.
- solicitarNombre(): solicita el nombre.
- solicitarNombreUsuario(): solicita el nombre de usuario.
- solicitarEdad(): solicita la edad.
- solicitarNombrePelicula(): solicita el nombre de una película.
- solicitarNumeroPelicula(): solicita el número de una película.
- solicitarCalificacion(): solicita una calificación.
- mostrarInformacion(): muestra información al usuario.
- main(String[] args): inicia y controla la ejecución del programa.

## 2. ¿Qué tipo deben tener las propiedades y métodos de cada clase?

### Usuario:
- nombre: String
- nombreUsuario: String
- edad: int
- peliculas: Pelicula[]
- calificaciones: int[]
- cantidadCalificaciones: int
- registrarCalificacion(Pelicula, int): boolean
- consultarCalificacion(int): int
- modificarCalificacion(int, int): boolean
- calcularPromedio(): double
- obtenerCalificacionMayor(): int
- obtenerCalificacionMenor(): int
- obtenerCantidadCalificaciones(): int
- obtenerEspaciosDisponibles(): int

### Pelicula:
- nombre: String
- numero: int
- getNombre(): String
- getNumero(): int

### Interfaz:
- scanner: Scanner
- mostrarMenu(): void
- solicitarOpcion(): int
- solicitarNombre(): String
- solicitarNombreUsuario(): String
- solicitarEdad(): int
- solicitarNombrePelicula(): String
- solicitarNumeroPelicula(): int
- solicitarCalificacion(): int
- mostrarInformacion(): void
- main(String[] args): void

## 3. ¿Cuál de las propiedades identificadas debe implementarse utilizando un arreglo? ¿Qué tipo de datos almacenará?
Las propiedades peliculas y calificaciones de la clase Usuario serán implementadas utilizando arreglos con un máximo de 10 posiciones. peliculas será de tipo Pelicula[] y almacenará los objetos de las películas registradas, mientras que calificaciones será de tipo int[] y almacenará sus respectivas calificaciones.

## 4. ¿Cuáles deben ser los modificadores de visibilidad de los miembros en cada clase?
En las clases Usuario y Pelicula, las propiedades tendrán el modificador private, ya que los datos no deben ser modificados directamente desde otras clases. Los constructores y métodos serán public para permitir la interacción entre las clases. En la clase Interfaz, el método main() será public static porque será el punto de entrada del programa.

## 5. ¿Qué parámetros serán requeridos por los métodos en sus clases?
El constructor de Usuario recibirá el nombre, nombre de usuario y edad. El método para registrar recibirá una Pelicula y su calificación, el método para consultar recibirá el número de película y el método para modificar recibirá el número de película y la nueva calificación. En Pelicula, el constructor recibirá el nombre y número de la película.

## 6. ¿Cómo proveerá de valores iniciales a sus objetos? ¿Qué valores iniciales les asignará?
Los valores iniciales se asignarán mediante los constructores. Usuario recibirá sus datos personales, tendrá los arreglos peliculas y calificaciones con capacidad para 10 posiciones y comenzará con cantidadCalificaciones = 0. Cada Pelicula se creará con su nombre y número.

## 7. ¿Cómo determinará cuál es la siguiente posición disponible dentro del arreglo?
Se utilizará cantidadCalificaciones para indicar la siguiente posición disponible. Esta variable comenzará en 0 y aumentará cada vez que se registre una calificación, verificando primero que no se hayan ocupado las 10 posiciones.

## 8. ¿Cómo recorrerá únicamente las posiciones del arreglo que contienen calificaciones registradas?
Se recorrerán los arreglos desde la posición 0 hasta cantidadCalificaciones - 1. De esta manera, solo se tomarán en cuenta las películas y calificaciones registradas y se ignorarán las posiciones vacías.