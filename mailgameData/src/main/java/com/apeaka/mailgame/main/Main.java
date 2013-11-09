package com.apeaka.mailgame.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.apeaka.mailgame.data.model.Game;

public class Main {

    private static final String PERSISTENCE_UNIT_NAME = "mailgamePU";

    private static EntityManagerFactory factory;

    public static void main(final String[] args) {

        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

        final EntityManager em = factory.createEntityManager();

        // read the existing entries and write to console
        final Query q = em.createQuery("select g from Game g");

        List<Game> games = q.getResultList();
        for (final Game game : games) {
            System.out.println(game);
        }
        System.out.println("Size: " + games.size());

        // create new todo
        em.getTransaction().begin();
        final Game game = new Game();
        game.setName("Test Game");
        game.setDeckCount(3);
        game.setMaximumPoint(250);
        em.persist(game);
        em.getTransaction().commit();

        games = q.getResultList();
        for (final Game game2 : games) {
            System.out.println(game2);
        }
        System.out.println("Size: " + games.size());

        em.close();
    }
}