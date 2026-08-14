package tw.edu.cust.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import tw.edu.cust.service.NewsService;

@Controller
@RequestMapping("/news")
@RequiredArgsConstructor
public class NewsController {

    private final NewsService newsService;

    @GetMapping
    public String listNews(Model model) {
        model.addAttribute("newsList", newsService.getAllNews());
        return "news/list";
    }

    @GetMapping("/{id}")
    public String getNewsDetail(@PathVariable Long id, Model model) {
        model.addAttribute("news", newsService.getNewsById(id).orElse(null));
        return "news/detail";
    }
}
