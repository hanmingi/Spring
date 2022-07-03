package introduction.introductionSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IntroductionController {
	
	@GetMapping("Introduction")
	public String introducion(Model model) {
		model.addAttribute("data", "Introduction!!");
		return "Introduction";
	}
	
	@GetMapping("Introduction-MVC")
	public String IntroductionMVC(@RequestParam("name") String name, Model model) {
		model.addAttribute("name", name);
		return "Introduction-template";
	}
	
	@GetMapping("Intro-string")
	@ResponseBody
	public String IntroString(@RequestParam("name") String name) {
		return "Intro " + name;
	}
	
	@GetMapping("Intro-api")
	@ResponseBody
	public Intro IntroApi(@RequestParam("name") String name) {
		Intro intro = new Intro();
		
		intro.setName(name);
		return intro;
	}
	
	static class Intro{
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
}