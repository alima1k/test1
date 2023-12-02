package src.ru.kpfu.itis.group302.games;
public class AbstractGameWithHuman extends AbstractGame{

    public AbstractGameWithHuman(int maxHP) {
            super(maxHP);
            System.out.println("Введите имя второго игрока");
            p2 = new Player(in.nextLine(), maxHP);
    }

    public void gameProcess() {
//        AbstractPlayer kicker = p1;
//        AbstractPlayer enemy = p2;

        Player kicker = (Player) p1;
        Player enemy = (Player) p2;

        while (p1.alive() && p2.alive()) {
            System.out.println(kicker + " is going to kick " +
                    enemy + " with force: ");
            int f = in.nextInt(); // f - force
            while (!(1 <= f && f <= 10)) {
                System.out.println("Некорректный ввод");
                f = in.nextInt(); // f - force
            }
            boolean result = kicker.kick(enemy, f);
            if (result) {
                System.out.println("Success, " + enemy.getName() + "'s hp is " + enemy.getHp() + ".");
            } else {
                System.out.println("Missed");
            }
            Player swap = kicker;
            kicker = enemy;
            enemy = swap;
        }


    }


}