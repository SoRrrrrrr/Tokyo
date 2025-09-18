package Hw_250918;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Novel novel = new Novel();
		TextBook tb = new TextBook();
		
		novel.setTitle("소설 제목");
		novel.setAuthor("소설 작가");
		novel.setPrice(15000);
		novel.setGenre("추리물");
		
		tb.setTitle("교과서 제목");
		tb.setAuthor("교과서 작가");
		tb.setPrice(20000);
		tb.setSubject("영어");
		
		System.out.println("제목: "+novel.getTitle()+", 저자: "+novel.getAuthor()+", 가격: "+novel.getPrice());
		System.out.println("장르: "+novel.getGenre());
		System.out.println("=================");
		System.out.println("제목: "+tb.getTitle()+", 저자: "+tb.getAuthor()+", 가격: "+tb.getPrice());
		System.out.println("장르: "+tb.getSubject());
		
		
	}

}
