package Generics;

import java.util.ArrayList;

/**
 * 제네릭
 * 컴파일시 타입을 체크해 주는 기능
 * 제네릭가 도입된 JDK1.5 이후로는 꼭 타입을 지정해줘야 한다.
 * 객체의 타입 안정성을 높이고 형변환의 번거로움을 줄여준다.
 *
 * 타입 변수
 * 클래스를 작성할 때 Object타입 대신 타입 변수(E)를 선언해서 사용
 * 객체를 생성시 타입 변수를 대신 실제 타입을 지정한다.
 * 실제 타입이 지정되면 형변환을 생략할 수 있다.
 * 참조 변수와 생성자의 대입된 타입은 일치해야 한다.
 * JDK 1.7부터 생성자에 타입 변수를 지정하는 것을 생략할 수 있다.
 *
 */

class Member {}

public class Ex_1 {
    public static void main(String[] args) {
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(new Member());
        Member member = (Member) arrayList1.get(0);      // 일반 클래스는 Object를 반환하기 때문에 형변환이 필요하다.

//        ArrayList<Member> arrayList = new ArrayList<>();      // 생성자 타입 생략 가능
        ArrayList<Member> arrayList2 = new ArrayList<Member>();
        arrayList2.add(new Member());
        Member member1 = arrayList2.get(0);             // 제네릭의 타입 변수를 사용하면 형변환이 불필요하다.
    }
}
