package fastCampus.project_board.repository;

import fastCampus.project_board.domain.Article;
import fastCampus.project_board.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

/**
 * Projection for {@link fastCampus.project_board.domain.Article}
 */
@Repository
public interface ArticleRepository extends JpaRepository<Article,Long> {

}