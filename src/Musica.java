public class Musica extends Critica{
    private String nomeMusica;
    private String nomeArtista;

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public void postarCritica(String nomeMusica, String nomeArtista, String tituloCritica, String analise, double nota){
        setTituloCritica(tituloCritica);
        setNomeMusica(nomeMusica);
        setNomeArtista(nomeArtista);
        setAnalise(analise);
        setNota(nota);
    }
}
