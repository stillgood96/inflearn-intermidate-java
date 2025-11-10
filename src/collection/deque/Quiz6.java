package collection.deque;

import java.util.HashMap;
import java.util.Map;

public class Quiz6 {

  public static void main(String[] args) {
    Member member1 = new Member("id1", "회원1");
    Member member2 = new Member("id2", "회원2");
    Member member3 = new Member("id3", "회원3");
    // 회원 저장
    MemberRepository repository = new MemberRepository();
    repository.save(member1);
    repository.save(member2);
    repository.save(member3);
    // 회원 조회
    Member findMember1 = repository.findById("id1");
    System.out.println("findMember1 = " + findMember1);
    Member findMember3 = repository.findByName("회원3");
    System.out.println("findMember3 = " + findMember3);
    // 회원 삭제
    repository.remove("id1");
    Member removedMember1 = repository.findById("id1");
    System.out.println("removedMember1 = " + removedMember1);
  }


  private static class MemberRepository {
    private Map<String,Member> memberRepository = new HashMap<>();


    public Member save(Member member) {
      memberRepository.put(member.getId(), member);
      return memberRepository.get(member.getId());
    }

    public Member remove(String memberId) {
      Member member = memberRepository.get(memberId);
      memberRepository.remove(memberId);
      return member;
    }

    public Member findById(String memberId) {
      return memberRepository.get(memberId);
    }

    public Member findByName(String name) {
      return memberRepository.values()
          .stream()
          .filter(member -> member.getName().equals(name))
          .findFirst()
          .orElse(null);
    }
  }

  private static class Member {
    private String id;
    private String name;

    public Member(String id, String name) {
      this.id = id;
      this.name = name;
    }

    public String getId() {
      return id;
    }

    public void setId(String id) {
      this.id = id;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    @Override
    public String toString() {
      return "Member{" +
          "id='" + id + '\'' +
          ", name='" + name + '\'' +
          '}';
    }
  }
}
