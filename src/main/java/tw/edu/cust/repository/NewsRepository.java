package tw.edu.cust.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tw.edu.cust.domain.News;

import java.util.List;

public interface NewsRepository extends JpaRepository<News, Long> {
    List<News> findAllByOrderByPublishDateDesc();
    List<News> findByCategoryOrderByPublishDateDesc(String category);
}
