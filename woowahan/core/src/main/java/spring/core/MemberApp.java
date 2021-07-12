package spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.core.member.Grade;
import spring.core.member.Member;
import spring.core.member.MemberService;

public class MemberApp {

    public static void main(String[] args) {
//        1. 추상화와 구현체 둘 다 의존하는 방법. / DIP, OCP 위반
//        MemberServiceImpl memberService = new MemberServiceImpl();

//        2. AppConfig 으로 생성자 주입
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();

//        3. 스프링 컨테이너로 생성자 주입
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new Member = " + member.getName());
        System.out.println("find member = " + findMember.getName());

    }
}
