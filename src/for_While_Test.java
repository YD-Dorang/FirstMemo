public class for_While_Test {

    static void main() {

        // 1. for 반복문
        // 동일하거나 유사한 문장을 수치에 의해 제어하는문
        // 반복횟수가 정해진 경우에 주로 사용
        // for문은 내부에 보통 초기화 코드를 가지고 있음
        
        /*  형식
            for(초기식; 조건식; 증감식){
                실행문;
            }
            
            초기식 -> 조건식 비교 -> 실행문 -> 증감식 -> 2,3,4 조건이 만족할때까지 반복 후에 종료
        */

        // ex) 1부터 10까지합
        // int sum=0;

        // for(int i=0; i<=10; i++)
        //     sum+=i;

        // IO.println(sum);

        // ex) 무한루프 만들기
        // int cnt=0;
//
        // for(;;){
        //     cnt++;
        //     IO.println("무한 루프 : " + cnt);
        // }

        // ex) 1부터 100까지 짝수합
        // int sum1=0;

        // for(int i=0; i<=100; i+=2)
        //     sum1+=i;

        // IO.println(sum1);

        // ex) 반복문을 빠져나가는 break

        // for(int i=1; i<10; i++){
        //     if(i==5) break;
        //     IO.println(i); //1,2,3,4
        // }

        // ex) 다음 실행문을 생략함 continue
        // for(int i=0; i<10; i++){
        //     if(i==5) continue;
        //     IO.println(i);
        // }

        // ex) 구구단 만들기
        // IO.println("구구단을 만들어보자\n");

        // for(int i=2; i<10; i++){
        //     for(int j=1; j<10; j++)
        //         IO.print(i+" * "+j+" = "+ i*j + "  ");
        //     IO.println("");
        // }

        // ex) 세로로 만들어보자
        // for(int i=1; i<10; i++){
        //     for(int j=2; j<10; j++)
        //         IO.print(j+" * "+i+" = "+ j*i + "  ");
        //     IO.println("");
        // }

        // 다중 for문을 한꺼번에 빠져나오는 방법 (label사용) break loop;
        // loop:
// 
        // for(int row=0; row<=3; row++){
        //     for(int col=0; col<=5; col++) {
        //         IO.println("(" + row + ", " + col + ")");
        //         if ((row == 1) && (col == 3))
        //             break loop;
        //     }
        // }

        // 다중 for문의 바깥쪽 반복을 계속하는 방법 continue loop;
        // loop:
        //     for(int row=0; row<=3; row++){
        //         for(int col=0; col<=5; col++){
        //             IO.println("(" + row + ", " + col + ")");
        //             if((row==1)&&(col==3))
        //                 continue loop;
        //         }
        //     }

        // 향상된 for문 배열항목의 값을 변수에 자동으로 대입
        // int []num = {1,2,3,4,5};
        // for(int i : num)
        //     IO.print(i + " ");

        //ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ


        // 2. While
        // 조건이 참인 동안 반복 실행
        // 순환 횟수를 정확히 지정할 수 없을 경우 사용
        // while문과 for문은 상호 변환가능
        // while(조건식){
        //      실행문;
        // }


        // ex)1부터 10까지 합 
        // int tot=0, i=0;
        //
        // while(i++ <10){
        //
        //     tot+=i;
        //
        // }
        // IO.println("1부터 10까지 합은 " + tot);

        // ex) 무한루프 만들기 while(true)
        // int cnt=0;
        // while(true)
        // {
        //    IO.println(cnt++);
        // }

        // ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
        
        // do while문
        // 조건에 관계없이 무조건 1회 실행후 조건을 비교하는 반복문
        // 반드시 while문 끝에 세미콜론을 붙인다
        // do {
        //     실행문
        // }while(조건식);
        // 실행문-> 조건식 -> 반복후 종료

        
        // ex) 1부터 10까지 합
        // int tot=0,i=1;
//
        // do {
        //     tot+=i;
        // }while(i++<10);
//
        // IO.println(tot);
        
        

        
    }

}
