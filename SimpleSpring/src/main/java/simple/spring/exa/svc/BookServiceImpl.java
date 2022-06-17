package simple.spring.exa.svc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import simple.spring.exa.dao.BookDao;

@Service
public class BookServiceImpl implements BookService{
	@Autowired
	BookDao bookDao;
	
	@Override
	public String create(Map<String, Object> map) {
		int affectRowCount = this.bookDao.insert(map);
		if(affectRowCount == 1) {
			return map.get("book_id").toString();
		}
		return null;
	}
}
