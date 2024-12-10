import java.util.Scanner;

public class MartinezVictorMain {
    Scanner input = new Scanner(System.in);
    final static String ANSI_RED = "\u001B[31m"; //Color rojo
    final static String ANSI_YELLOW = "\u001B[33m"; //Color amarillo
    final static String ANSI_RESET = "\u001B[0m"; //Devolver color predeterminado

    public static void main(String[] args) { //Utilizamos el método main únicamente para llamar al método de inicio
        MartinezVictorMain programa = new MartinezVictorMain();
        programa.inicio();
    }

    private void inicio(){
        MartinezVictorPerfil miPerfil = new MartinezVictorPerfil( //Llamamos al constructor de Perfil, con los datos correspondientes
                "Victor Martinez",
                "I hope they can brighten up someone's day.",
                new String[]{"🎮","🗻","🧗‍♂️"},
                new String[]{"🥞","☕","🍛"},
                new String[]{
                        "The mitochondria is the powerhouse of the cell.",
                        "Path of Exile is a good game.",
                        "Studying Web App Development."}
        );
        System.out.println(ANSI_YELLOW+"Perfil creado:\n"+ANSI_RESET+miPerfil); //Podemos acceder directamente al método toString
        // escribiendo el nombre del perfil dentro del String
        menu(miPerfil); //Muestra el menú por pantalla
    }

    /**
     * Imprime el menú de selección del perfil por pantalla
     * @param perfil Perfil a mostrar (En este caso solo hay 1 pero pedimos el perfil igualmente para mejor expandibilidad)
     *
     */
    private void menu(MartinezVictorPerfil perfil){
        boolean exit = false; //Variable que cierra el menú
        do {
            System.out.println(ANSI_YELLOW+"Menu AboutMe [" + perfil.getName() + "]\n"+ANSI_RESET+"""
                            [1] Story
                            [2] Favourites
                            [3] Fun Fact
                            [4] Salir
                            """
            ); //Utilizamos el getter de name para mostrar el nombre del perfil por el que queremos navegar

            switch (intFromConsole(1, 4)){ //Para navegar por el case, llamamos al método
                case 1: //Muestra la historia del perfil
                    System.out.println(ANSI_YELLOW+"Story:"+ANSI_RESET);
                    System.out.println(perfil.getStory());
                    break;
                case 2: //Muestra los hobbies y la comida favorita del perfil
                    System.out.println(ANSI_YELLOW+"Favourites:"+ANSI_RESET);
                    System.out.println("Hobbies: "+perfil.getHobbies()+'\n'+"Foods: "+perfil.getFoods());
                    break;
                case 3: //Muestra un fun fact aleatorio del perfil
                    System.out.println(ANSI_YELLOW+"Fun fact:"+ANSI_RESET);
                    System.out.println(perfil.getRandFact());
                    break;
                case 4: //Detiene el bucle del menú, y con este el programa
                    System.out.println("Saliendo del programa...");
                    exit = true;
                    break;
                default:
                    //Valor erróneo
                    break;
            }
            System.out.println(); //Inserta separación
        }while(!exit);
    }

    /**
     * Verifica el input del usuario, para verificar que és una integer
     * @param min Valor mínimo de la integer
     * @param max Valor máximo de la integer
     * @return Integer validada, devuelve -1 si el input és inválido
     */
    public int intFromConsole(int min, int max) {
            if (input.hasNextInt()) {
                int x = input.nextInt();
                if (x >= min && x <= max) {
                    input.nextLine(); //Limpiar búfer
                    return x;
                }
            }
            input.nextLine(); //Limpiar búfer
            System.out.println(ANSI_RED+"Opción inválida. Introduce un número [" + min + " - " + max + "]"+ANSI_RESET);
            return -1; //Si el número es inválido, el método devuelve -1, para que se vuelva a mostrar el menú
    }
}