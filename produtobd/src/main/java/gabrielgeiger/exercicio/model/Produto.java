package gabrielgeiger.exercicio.model;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Produto
{
  @Getter @Setter
  private int codigo;
  @Getter @Setter
  private String nome;
  @Getter @Setter
  private double valor;
  @Getter @Setter
  private int quantidade;

}
