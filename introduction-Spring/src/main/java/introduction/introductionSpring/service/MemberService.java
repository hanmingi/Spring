package introduction.introductionSpring.service;


import java.util.List;
import java.util.Optional;

import introduction.introductionSpring.domain.Member;
import introduction.introductionSpring.repository.MemberRepository;
import introduction.introductionSpring.repository.MemoryMemberRepository;

public class MemberService {
	private final MemberRepository memberRepository = new MemoryMemberRepository();
	/**
	 * 회원가입
	 */
	
	public Long join(Member member) {
		//중복 회원 X
//		Optional<Member> result = memberRepository.findByName(member.getName());
//		result.ifPresent(m-> {
//			throw new IllegalStateException("이미 존재한다");
//		});
		
		validateDuplicateMember(member); //중복회원 검증
		memberRepository.save(member);
		return member.getId();
	}
	
	private void validateDuplicateMember(Member member) {
		memberRepository.findByName(member.getName())
			.ifPresent(m-> {
				throw new IllegalStateException("이미 존재한다");
			});
	}
	
	/**
	 * 전체회원 조회
	 */
	public List<Member> findMembers(){
		return memberRepository.findAll();
	}
	
	public Optional<Member> findOne(Long memberId){
		return memberRepository.findById(memberId);
	}
}
