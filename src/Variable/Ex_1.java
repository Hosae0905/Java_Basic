package Variable;

/**
 * 변수
 * 하나의 값을 저장할 수 있는 메모리 공간 - RAM
 * 값을 새로 저장하면 기존의 값은 없어지고 새로운 값으로 바뀐다.
 *
 * 변수의 선언
 * 값을 저장할 공간을 마련하기 위해
 * 변수타입 변수이름 __;
 * 
 * 변수의 초기화
 * 변수에 처음으로 값을 저장하는 것
 * ※ 지역 변수는 읽기 전에 꼭 초기화해야 한다.
 *
 * 변수의 값 읽어오기
 * 변수의 값이 필요한 곳에 변수의 이름을 적는다.
 */

public class Ex_1 {
    public static void main(String[] args) {
        int age;        // 정수 타입의 변수 선언
        age = 25;       // age가 25와 같다는 뜻이 아닌 대입한다는 뜻
        
        int x = 0, y = 5;   // 타입이 같으면 여러 개 동시에 초기화가 가능
        
        x = y + 4;  // 변수 값 읽어오기
    }
}