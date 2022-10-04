package study.login_logout.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import study.login_logout.dto.MemberDTO;
import study.login_logout.entity.Member;
import study.login_logout.repository.MemberRepository;
import study.login_logout.service.MemberService;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/")
    public String welcome() {
        return "/home";
    }

    @GetMapping("/signupForm")
    public String signupForm(Model model) {
        model.addAttribute("memberDTO", new MemberDTO());
        return "signup/signupForm";
    }

    @PostMapping("/signupForm")
    public String signup(@ModelAttribute MemberDTO memberDTO, Model model) {
        memberService.register(memberDTO);
        model.addAttribute("memberDTO", memberDTO);
        return "/home";
    }

}
