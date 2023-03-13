package study.ex01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.ex01.discount.FixDiscountPollicy;
import study.ex01.discount.RateDiscountPolicy;
import study.ex01.member.MemberService;
import study.ex01.member.MemberServiceImpl;
import study.ex01.member.MemoryMemberRepository;
import study.ex01.order.OrderService;
import study.ex01.order.OrderServiceImpl;

@Configuration
public class AppConfig {

    // @Bean memberService --> new MemoryMemberRepository()
    // @Bean OrderService --> new MemoryMemberRepository();

    @Bean
    public MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public RateDiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }
}
