package tr.com.ae.spring.data.mysqldocker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import tr.com.ae.spring.data.mysqldocker.model.Book;

/**
 * Prepared by ahmeterdem on 17.09.2024 for Project app_mysqlfromdocker.
 */
public interface BookRepository extends JpaRepository<Book, String> {
    List<Book> findByPublished(boolean published);
    List<Book> findByTitleContaining(String title);
}
