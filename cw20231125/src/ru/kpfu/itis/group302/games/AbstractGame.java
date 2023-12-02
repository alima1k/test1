package ru.kpfu.itis.group302.games;
import ru.kpfu.itis.group302.players.*;
import java.util.Scanner;

public abstract class AbstractGame {
    protected AbstractPlayer p1, p2;
    protected Scanner in = new Scanner(System.in); // чтобы лишний раз не инициализировать

    public AbstractGame(int maxHP) {
        System.out.println("Введите имя первого игрока");
        p1 = new Player(in.nextLine(), maxHP);
    }

    public void go() {
        start();
        gameProcess();
        end();
    }

    public abstract void gameProcess();



    public void start() {
        System.out.println("The battle has begun.");
    }

    public void end() {
        AbstractPlayer winner = p1.alive() ? p1: p2;
        System.out.println(winner.getName() + " won.");
    }
}
