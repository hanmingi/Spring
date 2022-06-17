package simple.spring.exa.ctl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import simple.spring.exa.svc.BookService;
import simple.spring.exa.svc.TestSvc;

@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@RequestMapping(value="/create", method = RequestMethod.POST)
	public ModelAndView createPost(@RequestParam Map<String, Object> map) {
		ModelAndView mav = new ModelAndView();
		
		String bookId = this.bookService.create(map);
		if(bookId == null) {
			mav.setViewName("redirect:/create");
		}
		else {
			mav.setViewName("redirect:/detail?bookId=" + bookId);
		}
		//Integer result = svc.selectNow();
		//System.out.println("오라클 테스트 : " + result);
		
		return mav;
	}
}
