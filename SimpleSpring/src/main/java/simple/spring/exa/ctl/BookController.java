package simple.spring.exa.ctl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import simple.spring.exa.svc.TestSvc;

@Controller
public class BookController {
	
	@Autowired
	private TestSvc svc;
	
	@RequestMapping(value="/create", method = RequestMethod.GET)
	public ModelAndView create() {
		
		Integer result = svc.selectNow();
		System.out.println("오라클 테스트 : " + result);
		
		return new ModelAndView("book/create");
	}
}
