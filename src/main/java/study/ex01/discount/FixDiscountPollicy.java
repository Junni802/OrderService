package study.ex01.discount;

import org.springframework.stereotype.Component;
import study.ex01.member.Grade;
import study.ex01.member.Member;


@Component
public class FixDiscountPollicy implements DiscountPolicy {

    private int discountFixAmount = 1000;

    Grade grade;


    @Override
    public int discouint(Member member, int price) {
        if(member.getGrade() == grade.VIP){
            return discountFixAmount;
        }else{
            return 0;
        }

    }
}
