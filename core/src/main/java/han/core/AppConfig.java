package han.core;

import han.core.discount.FixDiscountPolicy;
import han.core.member.MemberService;
import han.core.member.MemberServiceImpl;
import han.core.member.MemoryMemberRepository;
import han.core.order.Order;
import han.core.order.OrderService;
import han.core.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService(){
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService(){
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }

}

