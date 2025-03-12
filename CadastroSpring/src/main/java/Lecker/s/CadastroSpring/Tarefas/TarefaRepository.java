package Lecker.s.CadastroSpring.Tarefas;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<TarefasDoUsuario, Long> {
}
