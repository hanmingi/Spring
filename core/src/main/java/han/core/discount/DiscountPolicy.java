package han.core.discount;

import han.core.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);
}
