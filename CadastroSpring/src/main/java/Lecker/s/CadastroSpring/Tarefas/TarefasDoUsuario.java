package Lecker.s.CadastroSpring.Tarefas;

import Lecker.s.CadastroSpring.usuario.UserModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Entity
@Table(name = "tb_Tarefas")
@NoArgsConstructor //utilizando Lombok para criar construtores
@AllArgsConstructor
@Data
public class TarefasDoUsuario {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Tarefa ")
    private String nomeDaTarefa;

    @Column(name = "dificuldade ")
    private String dificuldade;

    //UMA MISSAO PODE TER VARIOS NINJAS
    @OneToMany(mappedBy = "tarefasDoUsuario")
    private List<UserModel> usuario; // manipulacao de banco de dados utilizando o OneToMany, para dizer que é uma tarefa para varios usuarios


    public static void main(String[] args) {

}}

