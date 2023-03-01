package study.ex01.order;

import study.ex01.discount.DiscountPolicy;
import study.ex01.discount.FixDiscountPollicy;
import study.ex01.member.Member;
import study.ex01.member.MemberRepository;
import study.ex01.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberID, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberID);
        int discouintPrice = discountPolicy.discouint(member, itemPrice);

        return new Order(memberID, itemName, itemPrice, discouintPrice);
    }
}
