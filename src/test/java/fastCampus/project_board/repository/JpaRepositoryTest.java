package fastCampus.project_board.repository;

import fastCampus.project_board.config.JpaConfig;
import fastCampus.project_board.domain.Article;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("JPA 연결 테스트")
@Import(JpaConfig.class)
@DataJpaTest
class JpaRepositoryTest {


    private final ArticleRepository articleRepository;
    private final ArticleCommentRepository articleCommentRepository;

    JpaRepositoryTest(
            @Autowired ArticleRepository articleRepository,
            @Autowired ArticleCommentRepository articleCommentRepository
    ) {
        this.articleRepository = articleRepository;
        this.articleCommentRepository = articleCommentRepository;
    }
    @DisplayName("DB테스트 select")
    @Test
    void givenTestData_whenSelecting_thenWorksFine(){
        //given

        //when
        List<Article> articles = articleRepository.findAll();
        //then
        assertThat(articles).isNotNull().hasSize(0);
    }
    @DisplayName("DB테스트 insert")
    @Test
    void givenTestData_whenSelecting_thenWorksInsert(){
        //given
        long previousCount = articleRepository.count();
        //when
        Article savedArticle = articleRepository.save(
                Article.of("new Article","new content","#spring")
        );
        //then
        assertThat(articleRepository.count()).isEqualTo(previousCount + 1);
    }
}