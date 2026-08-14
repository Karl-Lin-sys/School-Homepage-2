package tw.edu.cust.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tw.edu.cust.domain.News;
import tw.edu.cust.repository.NewsRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class NewsService {

    private final NewsRepository newsRepository;

    public List<News> getAllNews() {
        return newsRepository.findAllByOrderByPublishDateDesc();
    }

    public List<News> getNewsByCategory(String category) {
        return newsRepository.findByCategoryOrderByPublishDateDesc(category);
    }

    public Optional<News> getNewsById(Long id) {
        return newsRepository.findById(id);
    }

    public News saveNews(News news) {
        return newsRepository.save(news);
    }

    public void deleteNews(Long id) {
        newsRepository.deleteById(id);
    }
}
