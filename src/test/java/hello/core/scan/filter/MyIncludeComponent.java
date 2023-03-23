package hello.core.scan.filter;

import java.lang.annotation.*;

/**
 * Annotation을 직접 만들어 봅시다.
 * 해당 Annotation(MyIncludeComponent)가 붙은 클래스는 컴포넌트 스캔의 추가 대상이 될 것
 * */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyIncludeComponent {

}
