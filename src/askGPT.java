public class askGPT extends musicGen {
    menu menu = new menu();

    String lyrics = menu.lyrics();
    String genre = menu.genre();

    public String charGPT(String prompt){
        System.out.println(context);
        System.out.println(prompt);
        System.out.println("...");
        System.out.println(lyrics+" *continua la canción*");

        return lyrics+" *continua la canción*";
    }
    public void askPrompt(){
        prompt = "letra:"+lyrics+"\ngénero: "+genre;
        charGPT(prompt);
    }
    
}
