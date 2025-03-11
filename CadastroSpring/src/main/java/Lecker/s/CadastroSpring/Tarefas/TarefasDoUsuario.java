package Lecker.s.CadastroSpring.Tarefas;

import Lecker.s.CadastroSpring.usuario.UserModel;
import jakarta.persistence.*;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Entity
@Table(name = "tb_Tarefas")
public class TarefasDoUsuario {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeDaTarefa;
    private String dificuldade;
    //UMA MISSAO PODE TER VARIOS NINJAS
    @OneToMany(mappedBy = "tarefasDoUsuario")
    private List<UserModel> usuario;


    public static void main(String[] args) {



}

    public TarefasDoUsuario(String dificuldade, String nomeDaTarefa) {
        this.dificuldade = dificuldade;
        this.nomeDaTarefa = nomeDaTarefa;

    }

    public TarefasDoUsuario() {
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getNomeDaTarefa() {
        return nomeDaTarefa;
    }

    public void setNomeDaTarefa(String nomeDaTarefa) {
        this.nomeDaTarefa = nomeDaTarefa;
    }

    public List<UserModel> getUsuario() {
        return usuario;
    }
}
