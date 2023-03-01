package study.ex01.member;

public interface MemberService {

    /**
     * 회원정보를 저장하기위한 틀
     * @param member
     */
    void Join(Member member);

    /**
     * 회원 정보를 찾기위한 틀
     * @param memberId
     */
    Member findMember(Long memberId);

}
