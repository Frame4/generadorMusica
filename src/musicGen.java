public abstract class musicGen {
    String context = "Se le dará la letra una letra inicial y un género musical,\ndebe continuar la letra en el idioma en la que esta se presente, manteniendo la temática \ny adaptandola al genero especificado:";
    String prompt;
    String genre;
    String lyrics;
    
    abstract void askPrompt();
}
