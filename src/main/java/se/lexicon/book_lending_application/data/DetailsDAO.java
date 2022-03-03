package se.lexicon.book_lending_application.data;

import se.lexicon.book_lending_application.entity.Details;

import java.util.Collection;

public interface DetailsDAO {

    Details findById(int id);
    Collection<Details> findAll();
    Details create(Details details);
    Details update(Details details);
    void delete(int id);

}
