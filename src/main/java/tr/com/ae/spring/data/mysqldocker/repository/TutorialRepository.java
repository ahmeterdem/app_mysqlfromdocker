package tr.com.ae.spring.data.mysqldocker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import tr.com.ae.spring.data.mysqldocker.model.Tutorial;

/**
 * Prepared by ahmeterdem on 17.09.2024 for Project app_mysqlfromdocker.
 */
public interface TutorialRepository extends JpaRepository<Tutorial, String> {
    List<Tutorial> findByPublished(boolean published);
    List<Tutorial> findByTitleContaining(String title);
}
