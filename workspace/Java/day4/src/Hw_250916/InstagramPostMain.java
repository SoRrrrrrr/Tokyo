package Hw_250916;

public class InstagramPostMain {

	public static void main(String[] args) {
		InstagramPost insta = new InstagramPost();
		insta.setWriter("민지");
		insta.setContent("오늘 날씨 짱");
		
		System.out.println("작성자 : " + insta.getWriter());		
		System.out.println("내용: " + insta.getContent());
	}

}
