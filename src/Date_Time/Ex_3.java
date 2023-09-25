package Date_Time;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 형식화 클래스
 * 숫자와 날짜를 원하는 형식으로 쉽게 출력 가능하다.
 * 형식 문자열에서 숫자와 날짜를 뽑아낼 수도 있다.
 *
 * DecimalFormat
 * 숫자를 형식화할 때 사용(숫자 --> 형식 문자열)
 * 콤마가 포함된 문자열도 변환할 수 있다. (다른 메서드들은 콤마가 있는 문자열을 변환하지 못함)
 *
 * SimpleDateFormat
 * 날짜와 시간을 다양한 형식으로 출력할 수 있게 해준다.
 * 특정 형식으로 되어 있는 문자열에서 날짜와 시간을 뽑아낼 수도 있다.
 */

public class Ex_3 {
    public static void main(String[] args) {
        DecimalFormat dc1 = new DecimalFormat("#,###.##");
        DecimalFormat dc2 = new DecimalFormat("#.###E0");
        DecimalFormat dc3 = new DecimalFormat("0,000.0000");

        SimpleDateFormat date1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat time1 = new SimpleDateFormat("HH:mm:ss");

        try {
            System.out.println("1,234,567.89 --> " + dc1.parse("1,234,567.89"));
            Number num = dc1.parse("1,234,567.89");
            System.out.println("1,234,567.89 --> " + dc2.format(num));
            System.out.println("1,234,567.89 --> " + dc3.format(num));
//            System.out.println(Double.parseDouble("1,234,567.89"));     // 래퍼 클래스의 parse 메서드는 콤마가 포함된 문자열을 변환하지 못한다.
            System.out.println("==============================================");

            Date d = new Date();
            Date d1 = date1.parse("1999-01-01");
            System.out.println(date1.format(d));
            System.out.println(time1.format(d));
            System.out.println(date1.format(d1));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
