package introduction.introductionSpring.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
	private MemberService memberService;
	
	@Autowired
	public MemberController(MemberService memberService) {
		this.memerService = memberService;
	}
}
