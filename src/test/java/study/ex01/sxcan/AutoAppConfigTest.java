package study.ex01.sxcan;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.ex01.AutoAppConfig;
import study.ex01.member.MemberService;
import study.ex01.order.OrderService;

public class AutoAppConfigTest {
    @Test
    void basicScan(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);

        MemberService memberService = ac.getBean(MemberService.class);
        OrderService orderService = ac.getBean(OrderService.class);
        Assertions.assertThat(memberService).isInstanceOf(MemberService.class);
        Assertions.assertThat(orderService).isInstanceOf(OrderService.class);
        System.out.println("memberService = " + memberService);
        System.out.println("orderService = " + orderService);
    }

}
