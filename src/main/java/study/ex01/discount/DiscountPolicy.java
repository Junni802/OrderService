package study.ex01.discount;

import study.ex01.member.Member;


public interface DiscountPolicy {

    int discouint(Member member, int price);

}
