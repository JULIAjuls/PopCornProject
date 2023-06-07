import java.util.Objects;

public class Usuario {
    private String nome;
    private String nickname;
    private String email;
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void criarUsuario(String nome, String nickname, String email, String senha){
        this.nome = nome;
        this.nickname = nickname;
        this.email = email;
        this.senha = senha;
    }

    public boolean acessoUsuario(String email, String senha){
        return Objects.equals(getEmail(), email) && Objects.equals(getSenha(), senha);
    }

}
