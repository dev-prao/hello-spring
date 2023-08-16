package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id); //Optional -> Java 8에 들어간 기능
    //반환값이 null인 경우에도 코드를 안전하게 다룸 -> NullPointerException 예방 및 코드 가독성 향상
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
