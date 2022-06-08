package simple.spring.exa.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface TestDao {
	Integer selectNow();
}
