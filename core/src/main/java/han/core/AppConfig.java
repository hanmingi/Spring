package han.core;

import han.core.discount.DiscountPolicy;
import han.core.discount.FixDiscountPolicy;
import han.core.discount.RateDiscountPolicy;
import han.core.member.MemberRepository;
import han.core.member.MemberService;
import han.core.member.MemberServiceImpl;
import han.core.member.MemoryMemberRepository;
import han.core.order.Order;
import han.core.order.OrderService;
import han.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }
    @Bean
    public static MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }
    @Bean
    public DiscountPolicy discountPolicy(){
        //return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}

