package tw.edu.cust.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tw.edu.cust.service.EmailService;

@Controller
@RequestMapping("/email")
@RequiredArgsConstructor
public class EmailController {

    private final EmailService emailService;

    @GetMapping("/inbox")
    public String inbox(Model model) {
        // Mock inbox implementation
        return "email/inbox";
    }

    @GetMapping("/compose")
    public String compose() {
        return "email/compose";
    }

    @PostMapping("/send")
    public String sendEmail(@RequestParam String to, @RequestParam String subject, @RequestParam String body) {
        emailService.sendSimpleMessage(to, subject, body);
        return "redirect:/email/inbox?sent=true";
    }
}
