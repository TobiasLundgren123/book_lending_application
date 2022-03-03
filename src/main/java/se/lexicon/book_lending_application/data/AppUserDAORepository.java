package se.lexicon.book_lending_application.data;

import se.lexicon.book_lending_application.entity.AppUser;

import java.util.Collection;

public class AppUserDAORepository implements AppUserDAO{

    @Override
    public AppUser findById(int id) {
        return null;
    }

    @Override
    public Collection<AppUser> findAll() {
        return null;
    }

    @Override
    public AppUser create(AppUser appUser) {
        return null;
    }

    @Override
    public AppUser update(AppUser appUser) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
