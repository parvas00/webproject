package app.model;

import app.entities.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Model {
    private static Model instance = new Model();

    private List<User> model;

    private Model() {
        model = new ArrayList<User>();
    }

    public static Model getInstance() {
        return instance;
    }

    public void add(User user) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        model.add(user);
    }

    public List<String> list() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return model.stream()
                .map(User::getName)
                .collect(Collectors.toList());
    }
}
