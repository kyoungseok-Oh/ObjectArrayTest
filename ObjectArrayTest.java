public class ObjectArrayTest {
    public static void main(String[] args) {
        //Q. 책3권을 저장 할 배열을 생성하고 책3권의 데이터를 저장하고 출력하세요
        Book[] b=new Book[3];
        b[0]=new Book();
        b[0].title="자바";
        b[0].price=30000;
        b[0].company="한빛";
        b[0].author="박매일";
        b[0].page=500;
        b[0].isbn="11889900";
        System.out.println(b[0].title+"\t"+b[0].price+"\t"+b[0].company+"\t"+b[0].author+"\t"+b[0].page+"\t"+b[0].isbn);
        b[1]=new Book();
        b[1].title="C프로그래밍";
        b[1].price=25000;
        b[1].company="한빛";
        b[1].author="홍길동";
        b[1].page=450;
        b[1].isbn="12389900";
        System.out.println(b[1].title+"\t"+b[1].price+"\t"+b[1].company+"\t"+b[1].author+"\t"+b[1].page+"\t"+b[1].isbn);
        b[2]=new Book();
        b[2].title="파이썬 프로그래밍";
        b[2].price=20000;
        b[2].company="한빛";
        b[2].author="홍길동";
        b[2].page=400;
        b[2].isbn="12356900";
        System.out.println(b[2].title+"\t"+b[2].price+"\t"+b[2].company+"\t"+b[2].author+"\t"+b[2].page+"\t"+b[2].isbn);


    }
}
