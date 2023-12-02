package src.ru.kpfu.itis.group302.games;
public class GameWithComputer extends AbstractGame{

    public GameWithComputer(int maxHP) {
        super(maxHP);

        // Ввод конструктора

        p2 = new DummyBot(maxHP);
    }

    public void gameProcess() {
        Bot bot = (Bot) p2;
        while (p1.alive() && bot.alive()) {
            System.out.println(p1 + " is going to kick " +
                    bot + " with force: ");
            int f = in.nextInt(); // f - force
            while (!(1 <= f && f <= 10)) {
                System.out.println("Некорректный ввод");
                f = in.nextInt(); // f - force
            }
            boolean result = p1.kick(bot, f);

            Log.logResult(result, bot);

            // next

            result = bot.kick(p1);
            Log.logResult(result, p1);

        }


    }


}