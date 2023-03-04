package study.ex01.autowired;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.ex01.AutoAppConfig;
import study.ex01.member.Member;

import java.util.Optional;

@SpringBootTest
public class AutoWiredTest {

    @Test
    void AutoWiredOption() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);
    }

    @SpringBootTest
    static class TestBean {

        @Autowired(required = false)
        public void setNoBean1(Member noBean1) {
            System.out.println("NoBean1 = " + noBean1);
        }

//        @Autowired
//        public void setNoBean2(@Nonnull Member noBean2) {
//            System.out.println("NoBean2 = " + noBean2);
//        }

        @Autowired
        public void setNoBean3(Optional<Member> noBean3){
            System.out.println("NoBean3= " + noBean3);
        }

    }

}
