package menu;
import logic.askGPT;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
public class menu {
    Scanner sc = new Scanner(System.in);
    String[] genres = {"reggeaton", "jazz", "pop", "rock", "alternative"};
    public void menu(){
        boolean addGenre = false;
        boolean hasGenre = false;
        String[] activeGenres = {"","","","",""};
        String lyrics = lyrics();

        do{
            System.out.println("Añadir genero a la mezcla?[y/n]");
            if (Objects.equals(sc.nextLine(), "y")) {
                addGenre = true;
                String newGenre=genre();
                for(int i=0;i<5;i++)
                    if(Objects.equals(newGenre, genres[i])) {
                        activeGenres[i]=newGenre;
                        i=5;
                        hasGenre=true;
                    }
                    else if(i==4) {

                        System.out.println("genero no reconocido");
                    }
            }else
                addGenre=false;
        }while(addGenre);
        if(hasGenre) {
            askGPT ask = new askGPT();
            ask.askForSong(lyrics, activeGenres);
        }
        else
            System.out.println("Debe ingresar un genero");
    }

    public String lyrics(){
        System.out.println("Escriba la letra inicial que será continuada automáticamente:");
        return sc.nextLine();
    }
    public String genre(){

        System.out.println("Indique el género de la canción:");
        System.out.println(Arrays.toString(genres));
        return sc.nextLine();
    }
}
