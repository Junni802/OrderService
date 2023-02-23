package study.orderservice.member;

public interface MemberRepository {

    /**
     * 회원정보를 저장하기위한 틀
     * @param member
     */

    void save(Member member);

    /**
     * 회원 정보를 찾기위한 틀
     * @param memberId
     */

    Member findById(Long memberId);

}
