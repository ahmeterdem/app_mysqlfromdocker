package tr.com.ae.spring.data.mysqldocker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Prepared by ahmeterdem on 17.09.2024 for Project app_mysqlfromdocker.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Book")
public class Book {
    @Id
    private String id;

    private String title;
    private String description;
    private boolean published;

    public Book(String title, String description, boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean isPublished) {
        this.published = isPublished;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
    }
}
