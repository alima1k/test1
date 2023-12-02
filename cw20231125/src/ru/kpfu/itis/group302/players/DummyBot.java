package src.ru.kpfu.itis.group302.players;
public class DummyBot extends Bot {

    private int force = 2;
    public DummyBot(int maxHP) {
        super(maxHP);
        this.name = "Bot";


    }

    public boolean kick(AbstractPlayer ap) {
        this.kick(ap, force);
        return true;
    }
}
