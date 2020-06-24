package gabrielgeiger.exercicio.controler;

import gabrielgeiger.exercicio.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ControlerProduto
{
@GetMapping("/")
    public String welcome()
{
    return "▂ ▃ ▄ BEM VINDO AO GSG SITEMAS ▄ ▃ ▂";
}
@GetMapping("/produto")
    public ArrayList<Produto> getProduto()
{
//////////PRIMEIRO PRODUTO\\\\\\\\\\\
    Produto p1 = new Produto();
//----
    p1.setNome("Azeite");
    p1.setCodigo(12345);
    p1.setQuantidade(100);
    p1.setValor(5);

//////////SEGUNDO PRODUTO\\\\\\\\\\\
    Produto p2 = new Produto();
//----
    p2.setNome("Miojo");
    p2.setCodigo(52520);
    p2.setQuantidade(90);
    p2.setValor(3);

//////////////////////////////////////

    ArrayList<Produto> cadastro = new ArrayList<>();

 cadastro.add(p1);
 cadastro.add(p1);

 return cadastro;




}

}
