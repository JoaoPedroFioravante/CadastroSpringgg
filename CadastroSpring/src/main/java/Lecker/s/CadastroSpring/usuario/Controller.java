package Lecker.s.CadastroSpring.usuario;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping
public class Controller {

    @GetMapping("/helloman")
    public String helloman(){
       return (" essa é a minha primeira mensagem");

    }

}
