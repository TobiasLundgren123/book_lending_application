package se.lexicon.book_lending_application.data;

import se.lexicon.book_lending_application.entity.AppUser;

import java.util.Collection;

public interface AppUserDAO {

    AppUser findById(int id);
    Collection<AppUser> findAll();
    AppUser create(AppUser appUser);
    AppUser update(AppUser appUser);
    void delete(int id);

}
