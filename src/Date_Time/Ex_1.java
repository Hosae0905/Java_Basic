package Date_Time;

import java.util.Calendar;

/**
 * Date 패키지
 * 날짜와 시간을 다룰 목적으로 만들어진 클래스
 * Date의 메서드는 거의 사장되었지만, 여전히 쓰이고 있다.
 *
 * Calendar 패키지
 * Date 클래스를 개선한 새로운 클래스를 만들었다.
 * 항상 날짜와 시간을 같이 다뤄야 한다는 단점이 있다.
 *
 * Time 패키지
 * Date와 Calendar의 단점을 개선한 새로운 클래스들을 제공한다. (JDK 1.8부터)
 *
 */

public class Ex_1 {
    public static void main(String[] args) {
        
        // TODO: Calendar 클래스 알아보기
        
//        Calendar cal = new Calendar();        // 추상 클래스는 인스턴스를 생성할 수 없음
        Calendar cal = Calendar.getInstance();  // 추상 클래스이므로 getInstance()를 통해 구현된 객체를 얻어야 한다.
                                                // 현재 날짜와 시간으로 셋팅이 된다.

        // TODO: get()으로 날짜와 시간 필드를 가져오기 
        // TODO: Calendar에 정의된 날짜 필드
        System.out.println("===============날짜 필드================");
        System.out.println("이번 년도는 " + cal.get(Calendar.YEAR) + "년 입니다.");     // 년
        System.out.println("이번 달은 " + (cal.get(Calendar.MONTH) + 1) + "월 입니다.");    // 월 (0부터 시작하기 때문에 주의해야 한다.)
        System.out.println("지금은 " + cal.get(Calendar.DATE) + "일 입니다.");     // 일
        System.out.println("1월1일부터 지금까지 " + cal.get(Calendar.WEEK_OF_YEAR) + "번째주 입니다.");     // 1월1일부터 지금까지 몇번째 주인지
        System.out.println("이번달 " + cal.get(Calendar.WEEK_OF_MONTH) + "번째주 입니다.");    // 그 달의 몇 번째 주인지
        System.out.println("올해 " + cal.get(Calendar.DAY_OF_YEAR) + "일 입니다.");      // 그 해의 몇 번째일
        System.out.println("이번달 " + cal.get(Calendar.DAY_OF_MONTH) + "일입니다.");     // 그 달의 몇 번째일
        System.out.println("지금은 " + cal.get(Calendar.DAY_OF_WEEK) + "입니다. (1부터 일요일)");      // 그 주의 몇 번째 일 (1부터 7까지 1은 일요일)
        System.out.println("이번달 " + cal.get(Calendar.DAY_OF_WEEK_IN_MONTH) + "번째 일요일입니다.");     // 그 달의 몇 번째 요일

        // TODO: Calendar에 정의된 시간 필드
        System.out.println("===============시간 필드================");
        System.out.println("현재 시간은 " + cal.get(Calendar.HOUR) + "시 입니다.");     // 시간(0 ~ 11)
        System.out.println("현재 시간은 " + cal.get(Calendar.HOUR_OF_DAY) + "시 입니다.");  // 시간(0 ~ 23)
        System.out.println("지금은 " + cal.get(Calendar.MINUTE) + "분 입니다.");       // 분
        System.out.println("지금은 " + cal.get(Calendar.SECOND) + "초 입니다.");       // 초
        System.out.println("지금은 " + cal.get(Calendar.MILLISECOND) + "밀리초 입니다.");  // 천분의 일초
        System.out.println("GMT기준 " + (cal.get(Calendar.ZONE_OFFSET) * 0.001 / 60 / 60) + "시 시차입니다.");  // GMT기준 시차(천분의 일초 단위)
        System.out.println("지금은 " + cal.get(Calendar.AM_PM) + "입니다. (0은 오전 | 1은 오후)");        // 오전 / 오후  (오전 = 0 | 오후 = 1)
        
    }
}
