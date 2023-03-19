package study.ex01.autowired.allbean;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import study.ex01.AutoAppConfig;
import study.ex01.discount.DiscountPolicy;
import study.ex01.member.Grade;
import study.ex01.member.Member;
import study.ex01.member.MemberRepository;

import java.util.List;
import java.util.Map;

public class AllBeanTest {

    @Test
    void AllBeanTest() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class, DiscountService.class);
        DiscountService discountService = ac.getBean(DiscountService.class);
        Member member = new Member(1L, "userA", Grade.VIP);
        int discountPrice = discountService.discount(member, 20000, "rateDiscountPolicy");

        Assertions.assertThat(discountService).isInstanceOf(DiscountService.class);
        Assertions.assertThat(discountPrice).isEqualTo(2000);
    }


    @SpringBootTest
    static class DiscountService {
        @Autowired
        private final Map<String, DiscountPolicy> poliocyMap;

        @Autowired
        private final List<DiscountPolicy> policy;

        public DiscountService(Map<String, DiscountPolicy> poliocyMap, List<DiscountPolicy> policy) {
            this.poliocyMap = poliocyMap;
            this.policy = policy;
            System.out.println("poliocyMap = " + poliocyMap);
            System.out.println("policy = " + policy);
        }

        public int discount(Member member, int i, String rateDiscountPolicy) {
            DiscountPolicy discountPolicy = poliocyMap.get(rateDiscountPolicy);
            return discountPolicy.discouint(member, i);
        }
    }

}
