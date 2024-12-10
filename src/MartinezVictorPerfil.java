import java.util.Arrays;
import java.util.Random;

public class MartinezVictorPerfil {
    private String name; //El nombre del perfil
    private String story; //La historia personal del perfil
    private String[] hobbies; //Colección de hobbies del perfil
    private String[] foods; //Colección de comidas favoritas del perfil
    private String[] funFacts; //Colección de datos curiosos

    //Constructor de la clase
    public MartinezVictorPerfil(String name, String story, String[] hobbies, String[] foods, String[] funFacts) {
        this.name = name;
        this.story = story;
        this.hobbies = hobbies;
        this.foods = foods;
        this.funFacts = funFacts;
    }

    //Devuelve el perfil en un formato legible por pantalla
    @Override
    public String toString() {
        return  name+'\n' +
                "Story:" + story + '\n' +
                "Hobbies:" + Arrays.toString(hobbies) +'\n' +
                "Foods:" + Arrays.toString(foods) +'\n' +
                "Fun facts:" + Arrays.toString(funFacts) +'\n';
    }

    //Getter del nombre del perfil
    public String getName() {
        return name;
    }

    //Getter historia del perfil
    public String getStory() {
        return story;
    }

    //Devuelve los hobbies del perfil en un solo string
    public String getHobbies() {
        return loopArray(hobbies);
    }

    //Devuelve la comida favorita del perfil en un solo string
    public String getFoods() {
        return loopArray(foods);
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

    //Devuelve un "fun fact" aleatorio, escogiendo una posición del array entre 0 y la longitud del array (excluida)
    public String getRandFact(){
        Random rand = new Random(); //Constructor clase Random
        return funFacts[rand.nextInt(0, funFacts.length)];
    }

}
