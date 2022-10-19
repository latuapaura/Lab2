package Pokemons;

import Moves.Excadrill.SmartStrike;
import ru.ifmo.se.pokemon.Type;

public class Excadrill extends Drilbur {

    public Excadrill(String name, int level) {

        super(name, level);

        super.setType(Type.GROUND, Type.STEEL);
        super.setStats(110, 135, 60, 50, 65, 88);



        super.addMove(new SmartStrike());
    }
}
