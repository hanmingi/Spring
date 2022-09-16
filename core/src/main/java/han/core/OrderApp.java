package han.core;

import han.core.member.Grade;
import han.core.member.Member;
import han.core.member.MemberService;
import han.core.member.MemberServiceImpl;
import han.core.order.Order;
import han.core.order.OrderService;
import han.core.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
    }
}
