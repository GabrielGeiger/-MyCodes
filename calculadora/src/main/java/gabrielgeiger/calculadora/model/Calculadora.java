package gabrielgeiger.calculadora.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Calculadora
{
    @Getter @Setter
   private double numero1;
    @Getter @Setter
    private double numero2;


    public double calcularSoma()
    {
        return numero1+numero2;
    }

    public double calcularMultiplicacao()
    {
        return numero1*numero2;
    }

    public double calcularSubtracao()
    {
        return numero1-numero2;
    }

    public double calcularDivisao()
    {
        return numero1/numero2;
    }


}
