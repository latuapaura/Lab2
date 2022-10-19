package Pokemons;

import Moves.Excadrill.SmartStrike;
import Moves.Leavanny.DoubleTeam;
import ru.ifmo.se.pokemon.Type;

public class Leavanny extends Swadloon {

        public Leavanny(String name, int level) {

            super(name, level);

            super.setType(Type.BUG, Type.GRASS);
            super.setStats(75, 103, 80, 70, 80, 92);


            super.addMove(new DoubleTeam());
        }

}
