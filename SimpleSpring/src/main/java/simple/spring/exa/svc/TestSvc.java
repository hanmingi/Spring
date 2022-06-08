package simple.spring.exa.svc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import simple.spring.exa.dao.TestDao;

@Service
public class TestSvc {
	
	@Autowired
	private TestDao dao;
	
	public Integer selectNow() {
		return dao.selectNow();
	}
}
