package Lecker.s.CadastroSpring.usuario;

import Lecker.s.CadastroSpring.Tarefas.TarefasDoUsuario;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_cadastro")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
    private String nome;
    private String eMail;
    private int idade;
    //  MANYTOONE, QUER DIZER QUE O USUARIO SÓ PODE TER UMA TAREFA
    @ManyToOne
    @JoinColumn(name = "usuario_tarefas")//chave estrangeira(junta tabelas)
    private TarefasDoUsuario tarefasDoUsuario;


    public UserModel() {
    }

    public UserModel(String nome, String eMail, int idade) {
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
