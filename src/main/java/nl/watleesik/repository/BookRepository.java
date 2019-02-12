package nl.watleesik.repository;

import nl.watleesik.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository <Book, Long> {

    public Book findBookByAuthor(String authorName);
    public Book findBookByTitle(String name);
}
