package gabrielgeiger.calculadora.control;

import gabrielgeiger.calculadora.model.Calculadora;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Control
{
    @GetMapping("/")
    public String welcome()
    {
        return "BEM VINDO A CALCULADORA";
    }

    @GetMapping("rest")
    public String getResultado()
    {
        Calculadora c1 = new Calculadora();

        c1.setNumero1(500);
        c1.setNumero2(300);


        return "▊ Numero 1 :"+c1.getNumero1()+
                " ▊ Numero 2 : "+c1.getNumero2()+
                " ▊ Soma: "+c1.calcularSoma()+
                " ▊ Multiplicação: "+c1.calcularMultiplicacao()+
                " ▊ Subtração: "+c1.calcularSubtracao()+
                " ▊ Divisão: "+c1.calcularDivisao()+" ▊";


    }
}
