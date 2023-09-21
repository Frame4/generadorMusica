package control;

import logic.genre;

public class genreControl {

    public genre[] genreList(){
        genre[] genres = new genre[5];
        genres[0]=new genre("rock","fast","120 BPM","Sol");
        genres[1]=new genre("pop","fast","120 BPM","Sol");
        genres[2]=new genre("reggeaton","fast","100 BPM","Sol");
        genres[3]=new genre("alternative","fast","120 BPM","Sol");
        genres[4]=new genre("jazz","slow","70 BPM","Sol");

        return genres;
    }
}
