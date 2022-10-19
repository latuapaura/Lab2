import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Program {


    public static void main(String[] args) {

        Battle b = new Battle();
        Aerodactyl aerodactyl = new Aerodactyl("СФ", 1);  // Название, уровень
        Drilbur drilbur = new Drilbur("Пуджастер", 1);
        Excadrill excadrill = new Excadrill("Пангольер", 1);
        Sewaddle sewaddle = new Sewaddle("Висп", 1);
        Swadloon swadloon = new Swadloon("Кунка", 1);
        Leavanny leavanny = new Leavanny("Квапа", 1);

        b.addAlly(aerodactyl);
        b.addAlly(drilbur);
        b.addAlly(excadrill);

        b.addFoe(sewaddle);
        b.addFoe(swadloon);
        b.addFoe(leavanny);

        b.go();

    }



}
