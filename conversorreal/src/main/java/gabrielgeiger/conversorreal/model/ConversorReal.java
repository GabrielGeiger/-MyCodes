package gabrielgeiger.conversorreal.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ConversorReal
{
    @Getter @Setter
private double  real;


    public double mostrarDolar()
    {
        return real*0.1861;
    }

    public double mostrarEuro()
    {
        return real*0.1661;
    }

}
