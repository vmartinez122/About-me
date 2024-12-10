import java.util.Arrays;

public class MartinezVictorPerfil {
    private String name; //El nombre del perfil
    private String story; //La historia personal del perfil
    private String[] hobbies; //Colección de hobbies del perfil
    private String[] foods; //Colección de comidas favoritas del perfil
    private String[] funFacts; //Colección de datos curiosos

    /*
    ** La clase deberá tener métodos para acceder a estos atributos y métodos que devuelvan la información
    ** de manera formateada para que sea fácil de mostrar por consola la información.
    */

    public MartinezVictorPerfil(String name, String story, String[] hobbies, String[] foods, String[] funFacts) {
        this.name = name;
        this.story = story;
        this.hobbies = hobbies;
        this.foods = foods;
        this.funFacts = funFacts;
    }

    @Override
    public String toString() {
        return  name+'\n' +
                "Story:" + story + '\n' +
                "Hobbies:" + Arrays.toString(hobbies) +'\n' +
                "Foods:" + Arrays.toString(foods) +'\n' +
                "Fun facts:" + Arrays.toString(funFacts) +'\n';
    }

    public String getName() {
        return name;
    }

    //Muestra la historia del perfil por pantalla
    public void showStory(){
        System.out.println(story);
    }

    //Muestra los hobbies y comidas favoritas del perfil por pantalla
    public void showFavourites(){
        System.out.println("Hobbies: "+loopArray(hobbies));
        System.out.println("Foods: "+loopArray(foods));
    }

    /**
     * Itera sobre un array de Strings para devolver una cadena de texto separada por comas
     * @param array Array que se quiere mostrar
     * @return String del contenido del array concatenado
     */
    public String loopArray(String[] array){
        String out=""; //Variable que devolvemos. Necesita ser inicializada
        for (int i=0; i < array.length; i++){
            if (i != array.length-1){
                out=out.concat(array[i]+","); //La función concat(), añade el string que introducimos como parámetro
                // al final del objeto string que llama a la función. En este caso, añadimos el contenido de la iteración del array
            }else {
                out=out.concat(array[i]); //El último elemento no requiere de una coma al final
            }
        }
        return out;
    }
}
