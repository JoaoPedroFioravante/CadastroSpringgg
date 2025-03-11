package Lecker.s.CadastroSpring.usuario;

import Lecker.s.CadastroSpring.Tarefas.TarefasDoUsuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor //utilizando Lombok para criar construtores
@AllArgsConstructor
@Data
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
    private TarefasDoUsuario tarefasDoUsuario;// utilização do ManyToOne para dizer que sao varios usuarios para uma missao


}
