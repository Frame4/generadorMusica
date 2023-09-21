package menu;

import java.util.Objects;
import java.util.Scanner;

import logic.genre;

public class menu {






    Scanner sc = new Scanner(System.in);
    public void menu(){
        boolean addGenre = false;
        String lyrics = lyrics();
        String[] genres = {"reggeaton", "jazz", "pop", "rock", "alternative"};

        do{
            System.out.println("Añadir otro genero a la mezcla?[y/n]");
            if (Objects.equals(sc.nextLine(), "y")) {
                addGenre = true;
                String newGenre=genre();
                for(int i=0;i==5;i++)
                    if(Objects.equals(newGenre, genres[i]))
                        System.out.println();
                    else
                        System.out.println("genero no reconocido");
            }else
                addGenre=false;
        }while(addGenre);
    }
    public String lyrics(){
        System.out.println("Escriba la letra inicial que será continuada automáticamente:");
        return sc.nextLine();
    }
    public String genre(){

        System.out.println("Indique el género de la canción:");
        return sc.nextLine();
    }
}
