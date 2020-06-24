package gabrielgeiger.conversoridade.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ConversorIdade
{
    @Getter @Setter
    private int anos;

    public int mostrarDias()
    {
        return anos*365;
    }

    public int mostrarSemanas()
    {
        return anos*52;
    }

    public int mostrarMeses()
    {
        return anos*12;
    }
}
