package Collections;

import java.util.HashMap;
import java.util.Scanner;

/**
 * HashMap과 HashTable
 * Map 인터페이스를 구현한다.
 * 데이터를 키와 값의 쌍으로 저장한다.
 * 순서를 보장하지 않는다.
 * 키의 중복을 허용하지 않고 값의 중복은 허용한다.
 * HashMap은 HashTable의 신버전이다. 둘의 차이는 HashMap은 동기화를 지원하지 않고 HashTable은 동기화를 지원한다.
 * 순서를 유지하고 싶으면 LinkedHashMap 클래스를 사용하면 된다.
 *
 * TreeMap
 * TreeSet과 같은 특성을 갖고 있다. (TreeSet이 TreeMap을 가지고 만든 것이다.)
 * HashMap보다 데이터 추가, 삭제에 시간이 더 걸린다. (비교하면서 저장하기 때문에)
 *
 * HashMap의 키와 값
 * 해싱(hashing) 기법으로 데이터를 저장하기 때문에 데이터가 많아도 검색이 빠르다.
 * 똑같은 키 값을 쓰면 해당 키가 가지고 있는 값을 새로운 값으로 바꾼다.
 *
 * 해싱(hashing)
 * 해시함수로 해시테이블에 데이터를 저장 및 검색을 한다. (해시 함수가 저장 위치를 알려주기 때문에 직접 접근이 가능)
 * 해시 테이블은 배열과 링크드 리스트가 조합된 형태이다.
 *
 * HashTable에 저장된 데이터를 가져오는 과정
 * 1. 키로 해시함수를 호출해서 해시코드를 얻는다.
 * 2. 해시코드에 대응하는 링크드리스트를 배열에서 찾는다.
 * 3. 링크드리스트에서 키와 일치하는 데이터를 찾는다.
 * ※ 해시함수는 같은 키에 대해 항상 같은 해시코드를 반환해야 한다.
 *    서로 다른 키일지라도 같은 값의 해시코드를 반환할 수도 있다.
 */

public class Ex_7 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        /*map.put(1, "AAA");
        map.put(2, "BBB");
        map.put(1, "CCC");      // 기존에 1번 키에서 갖고 있던 "AAA" 값이 "CCC" 값으로 바뀐다.

        System.out.println("map = " + map);*/
        
        Scanner sc = new Scanner(System.in);

        System.out.println("==============회원가입===================");
        System.out.print("아이디를 입력해주세요.");
        String setId = sc.next().trim();
        System.out.print("비밀번호를 입력해주세요.");
        String setPassword = sc.next().trim();

        map.put(setId, setPassword);

        while (true) {
            System.out.println("==============로그인====================");
            System.out.print("아이디를 입력해주세요.");
            String userId = sc.next().trim();
            System.out.print("비밀번호를 입력해주세요.");
            String password = sc.next().trim();

            if (!map.containsKey(userId)) {
                System.out.println("존재하지 않는 아이디입니다.");
                continue;
            }

            if (!map.get(userId).equals(password)) {
                System.out.println("없는 비밀번호 입니다.");
            } else {
                System.out.println("로그인 되었습니다.");
                break;
            }
        }
        
    }
}
