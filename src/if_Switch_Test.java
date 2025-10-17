import java.util.Scanner;

public class if_Switch_Test {

    static void main() {

        /* if문 */

        // 1. 절대값 출력

        // int i = -3;
        //
        // if (i < 0) // 실행문이 하나일때 생략가능
        //     i = -i;
        //
        // IO.println("절대값은 : " + i);


        // 코드 자동정리 (CTRL+ALT+L)


        // 2. if ~ else

        // n이 7일때 짝수 홀수 판별
        // int n = 7;
        //
        // if (n % 2 == 0)
        //     IO.println("n은 짝수");
        // else
        //     IO.println("n은 홀수");


        // 3. 삼항 연산자

        // 홀짝 구분해보기
        // int t = 7;
        // IO.println(t + "는" + (t % 2 == 0?"짝수" : "홀수"));


        // 4. 문자열 비교해보기 (equals)

        // String a = "김치";
        // if(a.equals("김치"))
        //     IO.println(a+"와 같은 문자열");
        // else
        //     IO.println(a+"와 다른 문자열");

        // 5. 다중if문 else if
        // 성적비교해보기
        // int y = 94;
        // if (y >= 95)
        //     IO.println("A학점");
        // else if (y >= 90)
        //     IO.println("B학점");
        // else
        //     IO.println("불합격");

        // *주의점* else는 가장 가까운 if와 짝을 이룬다


        // ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ


        // 1. Scanner  import java.util.Scanner; 추가해줘야함

        //int i;
        //float f;
        //double d;
        //String s;
        //
        //Scanner sc = new Scanner(System.in);
        //
        //IO.print("i 입력 : ");
        //i = sc.nextInt();
//
//
        //IO.print("f 입력 : ");
        //f = sc.nextFloat();
//
//
        //IO.print("d 입력 : ");
        //d = sc.nextDouble();
//
//
        //IO.print("s 입력 : ");
        //s = sc.next();
//
        //IO.println("\n"+i+" "+f+" "+d+" "+s);
//
        //sc.close();


        // ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ


        // switch문 (수치나 문자에 따른 이동의 처리가 if보다 빠르다, 컴파일시 위치가정해진다)

        /* 형식 
            switch(변수){
            case 값1: 
                실행문;
                break;
            case 값2: 
                실행문;
                break;
            default:
                실행문;
            }
        */

        // 문제 : 해당월은 몇일인지 보여달라

        //Scanner sc = new Scanner(System.in);
//
        //IO.print("월을 입력하세요 : ");
        //int i = sc.nextInt();
        //int d = 0;
//
        //switch (i) {
        //    case 2:
        //        d = 28;
        //        break;
        //    case 3,4,5,6:
        //        d = 30;
        //        break;
        //    default:
        //        d = 31;
        //        break;
        //}

        // 지시자 사용 예시
        //switch (i) {
        //    case 2 -> d = 28;
        //        break;
        //    case 3,4,5,6 -> d = 30;
        //        break;
        //    default -> d = 31;
        //        break;
        //}
        
//
        
        //IO.println(i+"월은 "+d+"일입니다");
        
        
        IO.println("\n총정리 : if문, switch문, Scanner사용법\n");

    }
}
