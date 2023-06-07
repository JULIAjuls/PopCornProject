public class Filme extends Critica{
    private String nomeFilme;

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public void postarCritica(String nomeFilme, String tituloCritica, String analise, double nota){
        setNomeFilme(nomeFilme);
        setTituloCritica(tituloCritica);
        setAnalise(analise);
        setNota(nota);
    }
}
