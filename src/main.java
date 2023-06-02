import java.util.Scanner;

public class main {
    static Scanner scanner = new java.util.Scanner(System.in);
    static int opcion = 0;

    public static void main(String[] args) {
        while (opcion != 4) {
            opcion = mostrarMenuPrincipal();
            switch (opcion) {
                case 1:
                    submenuAccion();
                    break;
                case 2:
                    submenuAventura();
                    break;
                case 3:
                    submenuEstrategia();
                    break;
                case 4:
                    System.out.println("Saliendo del programa....");
                    break;
                default:
            }
        }

    }
//MENU PRINCIPAL
    public static int mostrarMenuPrincipal() {
        System.out.println("VIDEOJUEGOS");
        System.out.println("1.-ACCION");
        System.out.println("2.-AVENTURA");
        System.out.println("3.-Estrategia");
        System.out.println("4.-Salir");
        System.out.println("Ingrese una opcion: ");
        opcion = scanner.nextInt();
        while (opcion < 1 || opcion > 4) {
            System.out.println("------------------------------------------");
            System.out.println("Ingrese una opcion valida");
            System.out.println("Ingrese la opcion: ");
            opcion = scanner.nextInt();

        }
        return opcion;
    }
    //SUBMENU DE LOS JUEGOS DE ACCION
    public static void submenuAccion() {
        //objetos de la clase Peliculas
        Viedeojuego viedeojuego1 = new Viedeojuego("CALL OF DUTY", "Ingles", 2007, "Juego de guerras y supervivencia", "Galon de la fama");
        Viedeojuego viedeojuego2 = new Viedeojuego("WARZONE", "Ingles", 2020, "Juego de guerras y supervivencia", "Mejor juego 2020");
        int opcion;
        do {
            System.out.println("Detalles");
            System.out.println("1.-Detalles del videojuego CALL OF DUTTY");
            System.out.println("2.-Detalles deL videojuego WARZONE");
            System.out.println("3.-Volver al menu principal");
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();
            while (opcion < 1 || opcion > 3) {
                System.out.println("-----------------------------------------");
                System.out.println("Ingrese un opcion valida");
                System.out.println("-----------------------------------------");
                System.out.print("Digite la opcion: ");
                opcion = scanner.nextInt();
            }
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("DETALLES DEL VIDEOJUEGO CALL OF DUTTY");
                        mostrarDetallesPelicula(viedeojuego1);
                        System.out.println("Deseas continuar en esta seccion 1--si o 2---no: ");
                        opcion = scanner.nextInt();

                    } while (opcion == 1);
                    break;
                case 2:
                    do {
                        System.out.println("DETALLES DEL VIDEOJUEGO WARZONE");
                        mostrarDetallesPelicula(viedeojuego2);
                        System.out.println("Deseas continuar en esta seccion 1--si o 2---no: ");
                        opcion = scanner.nextInt();

                    } while (opcion == 1);
                    break;
                case 3:
                    System.out.println("Volviendo al menu principal....");
                    break;
            }
        } while (opcion != 3);
    }

    //SUBMENU DE LOS JUEGOS DE AVENTURA
    public static void submenuAventura() {
        //objetos de la clase Peliculas
        Viedeojuego viedeojuego3 = new Viedeojuego("Mario Bros", "Ingles", 2000, "Explorar mundos y ganar", "Mejor juego del siglo");
        Viedeojuego viedeojuego4 = new Viedeojuego("CRASH", "Frances", 2001, "Subir niveles y conquistar mundos", "Segundo mejor juego del siglo");
        int opcion;
        do {
            System.out.println("Detalles");
            System.out.println("1.-Detalles del videojuego MARIO BROS");
            System.out.println("2.-Detalles deL videojuego CRASH");
            System.out.println("3.-Volver al menu principal");
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();
            while (opcion < 1 || opcion > 3) {
                System.out.println("-----------------------------------------");
                System.out.println("Ingrese un opcion valida");
                System.out.println("-----------------------------------------");
                System.out.print("Digite la opcion: ");
                opcion = scanner.nextInt();
            }
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("DETALLES DEL VIDEOJUEGO MARIO BROS");
                        mostrarDetallesPelicula(viedeojuego3);
                        System.out.println("Deseas continuar en esta seccion 1--si o 2---no: ");
                        opcion = scanner.nextInt();

                    } while (opcion == 1);
                    break;
                case 2:
                    do {
                        System.out.println("DETALLES DEL VIDEOJUEGO CRASH");
                        mostrarDetallesPelicula(viedeojuego4);
                        System.out.println("Deseas continuar en esta seccion 1--si o 2---no: ");
                        opcion = scanner.nextInt();

                    } while (opcion == 1);
                    break;
                case 3:
                    System.out.println("Volviendo al menu principal....");
                    break;
            }
        } while (opcion != 3);
    }
    //SUBMENU DE LOS JUEGOS DE ESTRATEGIA
    public static void submenuEstrategia() {
        //objetos de la clase Peliculas
        Viedeojuego viedeojuego5 = new Viedeojuego("CRASH ROYALE", "Chino", 2020, "Juego de guerras y tropas", "Galon de mejor juego redes sociales");
        Viedeojuego viedeojuego6 = new Viedeojuego("EMPIRE", "Ingles", 2012, "Juego de guerras y colonizaciones", "Mejor juego 2012");
        int opcion;
        do {
            System.out.println("Detalles");
            System.out.println("1.-Detalles del videojuego CRASH ROYALE");
            System.out.println("2.-Detalles deL videojuego EMPIRE");
            System.out.println("3.-Volver al menu principal");
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();
            while (opcion < 1 || opcion > 3) {
                System.out.println("-----------------------------------------");
                System.out.println("Ingrese un opcion valida");
                System.out.println("-----------------------------------------");
                System.out.print("Digite la opcion: ");
                opcion = scanner.nextInt();
            }
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("DETALLES DEL VIDEOJUEGO CRASH ROYALE");
                        mostrarDetallesPelicula(viedeojuego5);
                        System.out.println("Deseas continuar en esta seccion 1--si o 2---no: ");
                        opcion = scanner.nextInt();

                    } while (opcion == 1);
                    break;
                case 2:
                    do {
                        System.out.println("DETALLES DEL VIDEOJUEGO EMPIRE");
                        mostrarDetallesPelicula(viedeojuego6);
                        System.out.println("Deseas continuar en esta seccion 1--si o 2---no: ");
                        opcion = scanner.nextInt();

                    } while (opcion == 1);
                    break;
                case 3:
                    System.out.println("Volviendo al menu principal....");
                    break;
            }
        } while (opcion != 3);
    }

    // Mostrar los detalles de los videojuegos llamando a los metodos de la clase
    public static void mostrarDetallesPelicula(Viedeojuego videojuego) {
        System.out.println("\nDetalles de los videojuegos:");
        System.out.println("Nombre: " + videojuego.getNombre());
        System.out.println("Idioma: " + videojuego.getIdioma());
        System.out.println("Año: " + videojuego.getAnio());
        System.out.println("Tipo de juego: " + videojuego.getTipo_juego());
        System.out.println("Premios: " + videojuego.getPremios());

    }
}
