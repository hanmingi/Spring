package han.core;

import han.core.member.Grade;
import han.core.member.Member;
import han.core.member.MemberService;
import han.core.member.MemberServiceImpl;

public class MemberApp {
	public static void main(String[] args) {
		AppConfig appConfig = new AppConfig();
		MemberService memberService = appConfig.memberService();
		//MemberService memberService = new MemberServiceImpl();
		
		Member member = new Member(1L, "memberA", Grade.VIP);
		memberService.join(member);
		
		Member findMember = memberService.findMember(1L);
		
		System.out.println("member = " + member.getName());
		System.out.println("find Member = " + findMember.getName());
	}
}
