import java.util.Scanner;

public class MartinezVictorMain {
    Scanner input = new Scanner(System.in);
    final static String ANSI_RED = "\u001B[31m"; //Color rojo
    final static String ANSI_RESET = "\u001B[0m"; //Devolver color predeterminado

    public static void main(String[] args) {
        MartinezVictorMain programa = new MartinezVictorMain();
        programa.inicio();
    }

    private void inicio(){
        MartinezVictorPerfil miPerfil = new MartinezVictorPerfil(
                "Victor Martinez",
                "I hope they can brighten up someone's day.",
                new String[]{"🎮","🗻","🧗‍♂️"},
                new String[]{"🥞","☕","🍛"},
                new String[]{
                        "The mitochondria is the powerhouse of the cell.",
                        "Path of Exile is a good game.",
                        "Studying Web App Development."}
        );
        System.out.println("Perfil creado:\n"+miPerfil);
        menu(miPerfil);
    }

    /**
     * Imprime el menú de selección del perfil por pantalla
     * @param perfil Perfil a mostrar (En este caso solo hay 1 pero pedimos el perfil igualmente para mejor expandibilidad)
     *
     */
    private void menu(MartinezVictorPerfil perfil){
        boolean exit = false;
        do {
            /*
            [1] Story: se mostrará al usuario la historia del perfil y se regresará al menú.
            [2] Favorites: se mostrará al usuario los hobbies y foods del perfil y se regresará al menú
            [3] Fun Fact: se mostrará al usuario uno de los fun facts del perfil (escogido de forma aleatoria) y se
            regresarña al menú
            [4] Salir: se terminará el programa
             */
            System.out.println("Menu AboutMe [" + perfil.getName() + "]\n" +"""
                            [1] Story
                            [2] Favourites
                            [3] Fun Fact
                            [4] Salir
                            """
            );

            switch (intFromConsole(1, 4)){
                case 1:
                    System.out.println("Story");
                    break;
                case 2:
                    System.out.println("Favourites");
                    break;
                case 3:
                    System.out.println("Fun fact");
                    break;
                case 4:
                    System.out.println("Salir");
                    exit = true;
                    break;
                default:
                    //Valor erróneo
                    break;
            }
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
            System.out.println(ANSI_RED+"Error de formato. Introduce un número [" + min + " - " + max + "]"+ANSI_RESET);
            return -1; //Si el número es inválido, el método devuelve -1, para que se vuelva a mostrar el menú
    }
}