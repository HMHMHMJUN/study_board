package fastCampus.project_board.repository;

import fastCampus.project_board.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Projection for {@link fastCampus.project_board.domain.Article}
 */
@Repository
public interface ArticleRepository extends JpaRepository<Article,Long> {

}