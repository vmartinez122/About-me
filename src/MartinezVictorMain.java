public class MartinezVictorMain {
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
        System.out.println(miPerfil);
    }

    private void menu(){
        System.out.println(

        );
    }
}