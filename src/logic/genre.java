package logic;

public class genre {
    private String name;
    private String rhythm;
    private String tempo;
    private String musicalKey;

    public genre(String name, String rhythm, String tempo, String musicalKey) {
        this.name = name;
        this.rhythm = rhythm;
        this.tempo = tempo;
        this.musicalKey = musicalKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRhythm() {
        return rhythm;
    }

    public void setRhythm(String rhythm) {
        this.rhythm = rhythm;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public String getMusicalKey() {
        return musicalKey;
    }

    public void setMusicalKey(String musicalKey) {
        this.musicalKey = musicalKey;
    }
}
