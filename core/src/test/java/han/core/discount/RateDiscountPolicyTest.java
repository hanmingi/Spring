package han.core.discount;

import han.core.member.Grade;
import han.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {
    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인이 되어야 한다.")
    void vip_o(){

        Member member = new Member(1L, "memberVIP", Grade.VIP);

        int discount = discountPolicy.discount(member, 10000);
        assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("VIP가 아니면 할인 적용 x")
    void vip_x(){
        Member member = new Member(2L, "memberBASIC", Grade.BASIC);

        int discount = discountPolicy.discount(member, 10000);
        assertThat(discount).isEqualTo(0);
    }

}