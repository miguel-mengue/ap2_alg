package ex3_carrossel;

public class NoAnuncio {
    Anuncio anuncio;
    NoAnuncio proximo;

    public NoAnuncio(Anuncio anuncio) {
        this.anuncio = anuncio;
        this.proximo = null;
    }
}
