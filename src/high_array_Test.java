import java.util.Arrays;

class Book {
    String title;
    String author;

    Book() {
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void showBookInfo() {
        IO.println(title + " / " + author);
    }

}

public class high_array_Test {
    static void main() {

        // 1. 객체 배열
        // 객체에 대한 레퍼런스(참조)를 원소로 갖는 배열
        // 배열 작성 후 객체 생성을 따로 해야한다.
        // new 키워드로 생성되는 것은 객체를 담을 배열이고, 실제 객체 생성은 별개로 이루어짐
        // 배열 요소는 객체이다.

        // ex)
        // Book 클래스 작성

        // Book[] library = new Book[5];
        // for(int i=0; i<library.length; i++){
        //     IO.println(library[i]);
        // }
// 
        // // 실제 객체 생성
        // library[0] = new Book("행복한 이기주의자","웨인 다이어");
        // library[1] = new Book("개선문","에리히 레마르크");
        // library[2] = new Book("사람의 아들","이문열");
        // library[3] = new Book("노인과 바다","어니스트 헤밍웨이");
        // library[4] = new Book("무소유","법정스님");
// 
        // for(int i=0; i<library.length; i++){
        //     library[i].showBookInfo();
        // }


        // 복사를 통한 배열 확장
        // int [] source = {1,2,3,4,5};
        // int [] target = new int[10];
//
        // for(int i=0; i<source.length; i++){
        //     target[i] = source[i];
        // }
//
        // IO.println(Arrays.toString(target));
//
        // int [] a = {1,2,3,4,5};
        // int [] b = new int [a.length];
//
        // for(int i=0; i<a.length; i++)
        // {
        //     b[i] = a[i];
        // }
//
        // IO.println(Arrays.toString(b));
//
        // a[3] = 999;
        // IO.println(b[3]);

// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

        // 객체 배열 복사
        // 1) 얕은복사
        // 참조(주소)값의 복사
        // 같은 데이터를 참조
        // 일반적으로 = 연산자는 얕은복사
        // 반복문 사용 복사
        // System.arraycopy(() 메서드 사용

        // String [] a = {"Java","C#","C++"};
        // String [] b = a;
//
        // for(String s : a)
        //     IO.print(s+" ");
//
        // IO.println();
        // a[2] = "Python";
//
        // for(String s : b)
        //     IO.print(s+ " ");
//
        // IO.println();
//
        // Book[] book1 = new Book[3];
        // Book[] book2 = new Book[3];
//
        // book1[0] = new Book("행복한 이기주의자","웨인다이어");
        // book1[1] = new Book("개선문","에리히 레마르크");
        // book1[2] = new Book("사람의 아들","이문열");
//
        // System.arraycopy(book1,0,book2,0,3);
//
        // for(int i=0; i<book2.length; i++)
        // {
        //     book2[i].showBookInfo();
        // }

        // 2) 깊은복사
        // 값 자체의 복사
        // 같은 데이터를 복제
        // 완벽하게 2개의 배열이 따로존재
        // 기본 자로형은 모두 깊은 복사
        // String 배열에 Object.clone() 사용

        // Book[] book1 = new Book[3];
        // Book[] book2 = new Book[3];
//
//
//
        // book1[0] = new Book("행복한 이기주의자", "웨인 다이어");
        // book1[1] = new Book("개선문", "에리히 레마르크");
        // book1[2] = new Book("사람의 아들", "이문열");
//
        // book2[0] = new Book();
        // book2[1] = new Book();
        // book2[2] = new Book();
//
        // for (int i = 0; i < book1.length; i++) {
        //     book2[i].title = book1[i].title;
        //     book2[i].author = book1[i].author;
        // }
//
        // for (int i = 0; i < book2.length; i++) {
        //     book2[i].showBookInfo();
        // }
//
        // book1[0].title = "무소유";
        // book1[0].author = "법정스님";
//
        // System.out.println("--------------------------");
//
        // for (int i = 0; i < book2.length; i++) {
        //     book2[i].showBookInfo();
        // }
//
        // System.out.println("--------------------------");
//
        // for (int i = 0; i < book1.length; i++) {
        //     book1[i].showBookInfo();
        // }


        //String[] a = {"Java", "C#", "C++"};
        //String[] b = a.clone();
//
//
        //for (String s : b)
        //    System.out.println(s);
        //System.out.println("-------");
//
//
        //a[2] = "Python";
//
        //for (String s : b)
        //    System.out.println(s);
        //System.out.println("-------");
//
        //for (String s : a)
        //    System.out.println(s);
//

        // 얕은복사 깊은복사 정리 (값 자체를 복사하는건 깊은복사고 주소값을 복사하는건 얕은복사다


    }
}
