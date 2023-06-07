public class Serie extends Critica{
    private String nomeSerie;
    private int temporada;
    private String episodio;

    public String getNomeSerie() {
        return nomeSerie;
    }

    public void setNomeSerie(String nomeSerie) {
        this.nomeSerie = nomeSerie;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public String getEpisodio() {
        return episodio;
    }

    public void setEpisodio(String episodio) {
        this.episodio = episodio;
    }

    public void postarCritica(String nomeSerie, int temporada, String epsodio, String tituloCritica, String analise, double nota){
        setTituloCritica(tituloCritica);
        setNomeSerie(nomeSerie);
        setTemporada(temporada);
        setEpisodio(epsodio);
        setAnalise(analise);
        setNota(nota);
    }
}
