package study.ex01.discount;

import study.ex01.member.Grade;
import study.ex01.member.Member;

public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPercent = 10;

    @Override
    public int discouint(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return price* discountPercent / 100;
        }else{
            return 0;
        }
    }
}
