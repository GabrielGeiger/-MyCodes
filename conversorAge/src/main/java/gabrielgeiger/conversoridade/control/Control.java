package gabrielgeiger.conversoridade.control;


import gabrielgeiger.conversoridade.model.ConversorIdade;
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
@GetMapping("/rest")
public String getResultado()
{
    ConversorIdade c1 = new ConversorIdade();

    c1.setAnos(30);



    return "Resultado: "+c1.getAnos()+" Anos | "+c1.mostrarDias()+" Dias | "+c1.mostrarSemanas()+" Semanas | "+c1.mostrarMeses()+" Meses ";



}


}
