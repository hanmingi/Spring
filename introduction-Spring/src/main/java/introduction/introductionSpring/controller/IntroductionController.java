package introduction.introductionSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IntroductionController {
	
	@GetMapping("Introduction")
	public String introducion(Model model) {
		model.addAttribute("data", "Introduction!!");
		return "Introduction";
	}
}