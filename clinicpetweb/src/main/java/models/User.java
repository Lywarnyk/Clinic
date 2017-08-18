package models;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by lywar on 16.08.2017.
 */
public class User {
    private final int id;
    private final String login;
    private final String email;
    private List<Pet> pets = new CopyOnWriteArrayList<Pet>();

    public User(final int id, final String login, final String email){
        this.id = id;
        this.login = login;
        this.email =email;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

    public List<Pet> getPets() {
        return pets;
    }
}
