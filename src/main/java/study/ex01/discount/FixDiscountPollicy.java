package study.ex01.discount;

import study.ex01.member.Grade;
import study.ex01.member.Member;


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
