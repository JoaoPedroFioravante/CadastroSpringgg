package Lecker.s.CadastroSpring;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
    private String nome;
    private String eMail;
    private int idade;


    public User() {
    }

    public User(String nome, String eMail, int idade) {
        this.nome = nome;
        this.eMail = eMail;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
