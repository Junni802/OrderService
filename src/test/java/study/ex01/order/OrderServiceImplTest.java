package study.ex01.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import study.ex01.discount.FixDiscountPollicy;
import study.ex01.discount.RateDiscountPolicy;
import study.ex01.member.Grade;
import study.ex01.member.Member;
import study.ex01.member.MemberRepository;
import study.ex01.member.MemoryMemberRepository;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceImplTest {

    @Test
    public void OrderServiceTest(){
        MemoryMemberRepository memberRepository = new MemoryMemberRepository();
        memberRepository.save(new Member(1L, "name", Grade.VIP));
        OrderServiceImpl orderService = new OrderServiceImpl(memberRepository, new FixDiscountPollicy());
        Order order = orderService.createOrder(1L, "memberA", 10000);

        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);

    }

}