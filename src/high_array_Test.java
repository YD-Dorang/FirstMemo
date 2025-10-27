class Book{
    String title;
    String author;

    Book(String title,String author){
        this.title=title;
        this.author=author;
    }

    public void showBookInfo(){
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

        
        
        

    }
}
