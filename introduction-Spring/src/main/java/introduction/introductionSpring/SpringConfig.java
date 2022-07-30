package introduction.introductionSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import introduction.introductionSpring.repository.MemberRepository;
import introduction.introductionSpring.repository.MemoryMemberRepository;
import introduction.introductionSpring.service.MemberService;

@Configuration
public class SpringConfig {
	
	@Bean
	public MemberService memberService() {
		return new MemberService(memberRepository());
	}
	
	@Bean
	public MemberRepository memberRepository() {
		return new MemoryMemberRepository();
	}
}
