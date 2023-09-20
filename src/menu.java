import java.util.Scanner;

public class menu {
    Scanner sc = new Scanner(System.in);
    public String lyrics(){
        System.out.println("Escriba la letra inicial que será continuada automáticamente:");
        return sc.nextLine();
    }
    public String genre(){
        System.out.println("Indique el género de la canción:");
        return sc.nextLine();
    }
}
