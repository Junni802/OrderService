package study.ex01.order;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import study.ex01.annotation.MainDiscountPolicy;
import study.ex01.discount.DiscountPolicy;
import study.ex01.discount.FixDiscountPollicy;
import study.ex01.member.Member;
import study.ex01.member.MemberRepository;
import study.ex01.member.MemoryMemberRepository;

@Component
public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;


    @Autowired
    public OrderServiceImpl(MemberRepository memberRepository, @MainDiscountPolicy DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }


    public MemberRepository getMemberRepository() {
        return memberRepository;
    }

    @Override
    public Order createOrder(Long memberID, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberID);
        int discouintPrice = discountPolicy.discouint(member, itemPrice);

        return new Order(memberID, itemName, itemPrice, discouintPrice);
    }
}
