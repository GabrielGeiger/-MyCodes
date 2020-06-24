package gabrielgeiger.conversorreal.control;

import gabrielgeiger.conversorreal.model.ConversorReal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Control
{
    @GetMapping("/")
    public String welcome()
    {
        return "BEM VINDO AO CONVERSOR";
    }

    @GetMapping("rest")
    public String getResultado()
    {
        ConversorReal c1 = new ConversorReal();

        c1.setReal(45);

        return "► Reais R$"+c1.getReal()+" | Dolar $"+c1.mostrarDolar()+"| Euro €"+c1.mostrarEuro()+" ◄";

    }


}
