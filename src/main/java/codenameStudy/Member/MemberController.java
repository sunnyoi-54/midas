package codenameStudy.Member;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/members/create")
    public String createMemberForm(@ModelAttribute("memberForm") MemberForm memberForm) {
        return "members/register"; // Ensure this path is correct and exists
    }

    @PostMapping("/members/create")
    public String createMember(@Valid @ModelAttribute("memberForm") MemberForm memberForm, BindingResult result) {
        if (result.hasErrors()) {
            return "members/register";
        }

        memberService.create(memberForm.getUserName(), memberForm.getPwd());
        return "redirect:/";
    }
}