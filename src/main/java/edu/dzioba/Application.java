package edu.dzioba;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        GameSessionManager manager = new GameSessionManager(
                                     new Scanner(System.in)::nextLine,
                                     new Journalist(Language.ENGLISH),
                                     new InputConverter(), new InputValidator(new InputConverter()));
        GameSession session = new GameSession(manager, new SetUpState(manager));
        session.start();
    }
}
