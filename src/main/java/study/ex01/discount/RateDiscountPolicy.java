package study.ex01.discount;

import jakarta.annotation.Priority;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import study.ex01.annotation.MainDiscountPolicy;
import study.ex01.member.Grade;
import study.ex01.member.Member;

@Component
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
