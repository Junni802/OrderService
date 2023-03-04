package study.ex01.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.ex01.AppConfig;
import study.ex01.member.MemberRepository;
import study.ex01.member.MemberServiceImpl;
import study.ex01.order.OrderServiceImpl;

public class ConfigurationSingleTonTest {

//    @Test
//    void configurationTest(){
//        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
//
//        MemberServiceImpl memberService = ac.getBean("memberService", MemberServiceImpl.class);
////        OrderServiceImpl orderService = ac.getBean("orderService", OrderServiceImpl.class);
//        MemberRepository memberRepository = memberService.getMemberRepository();
////        MemberRepository memberRepository1 = orderService.getMemberRepository();
//
//        System.out.println("memberService -> memberRepository = " + memberRepository);
////        System.out.println("orderService -> memberRepository1 = " + memberRepository);
//
//    }

}
