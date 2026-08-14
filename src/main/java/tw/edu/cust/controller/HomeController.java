package tw.edu.cust.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import tw.edu.cust.service.NewsService;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final NewsService newsService;

    @GetMapping("/")
    public String home(Model model) {
        // Fetch top 5 latest news for the homepage
        model.addAttribute("latestNews", newsService.getAllNews().stream().limit(5).toList());
        return "home";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
    
    @GetMapping("/about")
    public String about() {
        return "about"; // Placeholder for about page
    }
}
