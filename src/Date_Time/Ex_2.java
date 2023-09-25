package Date_Time;

import java.util.Calendar;

/**
 * Calendar 클래스
 * set 메서드 이용해서 날짜와 시간 지정하기
 * 월은 배열을 사용하기 때문에 0부터 시작하는 점을 주의
 *
 * 시간을 지정할 때는 시, 분, 초 각각 따로 지정해줘야 한다.
 */

public class Ex_2 {
    public static void main(String[] args) {

        final String[] WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        date1.set(2023, 8, 5);      // month는 0부터 시작
        System.out.println("date1 = " + changeDate(date1) + WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일");

        date2.set(2023, 11, 31);
        System.out.println("date2 = " + changeDate(date2) + WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일");

        long dDay = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
        System.out.println("2023년까지 남은 기간은 " + dDay / (24 * 60 * 60) + "일 입니다.");

        System.out.println("==============================================================================");

        final int[] BASIC = {3600, 60, 1};      // 1시간 = 3600초, 1분 = 60초, 1초 = 1초
        final String[] NAME = {"시", "분", "초"};

        Calendar time1 = Calendar.getInstance();
        Calendar time2 = Calendar.getInstance();

        time1.set(Calendar.HOUR_OF_DAY, 10);
        time1.set(Calendar.MINUTE, 30);
        time1.set(Calendar.SECOND, 40);

        time2.set(Calendar.HOUR_OF_DAY, 20);
        time2.set(Calendar.MINUTE, 50);
        time2.set(Calendar.SECOND, 50);

        long diff = Math.abs(time2.getTimeInMillis() - time1.getTimeInMillis()) / 1000;
        System.out.println("시간 차이: " + diff + "초 입니다.");

        String result = "";
        for (int i = 0; i < BASIC.length; i++) {
            result += diff / BASIC[i] + NAME[i] + " ";
            diff %= BASIC[i];
        }

        System.out.println("시 | 분 | 초 --> " + result + "입니다.");
    }

    private static String changeDate(Calendar date) {
        return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) + "일 ";

    }
}
