package Pokemons;

import Moves.Swadloon.GrassWhistle;
import ru.ifmo.se.pokemon.Type;

public class Swadloon extends Sewaddle{


    public Swadloon(String name, int level) {

        super(name, level);

        super.setType(Type.BUG, Type.GRASS);
        super.setStats(55, 63, 90, 50, 80, 42);



        super.addMove(new GrassWhistle());
    }

}
