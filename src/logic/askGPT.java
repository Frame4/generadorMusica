package logic;


import menu.menu;

public class askGPT extends musicGen {
    menu menu = new menu();
    String genres="";
    String lyrics;

    public void askForSong(String lyric, String[] genre){

        for(int i=0; i<5; i++){
            if (!genre[i].equals(""))
                genres+=genre[i]+", ";
        }
        lyrics=lyric;
        askPrompt();
    }

    public String chatGPT(String prompt){
        System.out.println(context);
        System.out.println(prompt);
        System.out.println("...");
        System.out.println(lyrics+" *continua la canción*");

        return lyrics+" *continua la canción*";
    }
    public void askPrompt(){
        prompt = "\nletra:"+lyrics+"\ngéneros: "+genres;
        chatGPT(prompt);
    }
    
}
