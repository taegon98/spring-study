package study.login_logout.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import study.login_logout.entity.Member;
import study.login_logout.repository.MemberRepository;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberRepository memberRepository;

    @GetMapping("/")
    public String welcome() {
        return "/home";
    }

    @GetMapping("/signupForm")
    public String signupForm(Model model) {
        model.addAttribute("member", new Member());
        return "signup/signupForm";
    }

    @PostMapping("/signupForm")
    public String signup(@ModelAttribute Member member, Model model) {
        memberRepository.save(member);
        model.addAttribute("member", member);
        return "/home";
    }

}
