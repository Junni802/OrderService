package study.ex01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.ex01.member.Grade;
import study.ex01.member.Member;
import study.ex01.member.MemberService;
import study.ex01.order.Order;
import study.ex01.order.OrderService;

public class OrderApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext sc = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = sc.getBean("memberService", MemberService.class);
        OrderService orderService = sc.getBean("orderService", OrderService.class);

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.Join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println(order);
    }
}
