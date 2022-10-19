package Moves.Drilbur;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class X_Scissor extends PhysicalMove {

    public X_Scissor(double pow, double acc) {
        super(Type.BUG, 80, 100);
    }


    @Override
    protected String describe() {
        return "использует X-Scissor";
    }
}
