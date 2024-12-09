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
}
