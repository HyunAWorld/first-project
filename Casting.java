
public class Casting {

	public static void main(String[] args) {

			double a = 1.1;
			double b = 1;
			System.out.println(b);

//			int c = 1.1;
			double d = 1.1;
			int e = (int) 1.1;
			System.out.println(e);
			
			// 1 to String
			String f = Integer.toString(1);
			System.out.println(f.getClass()); //.getClass 변수가 갖고있는 값이 어떤 데이터 타입인지 알려주는 것
	}

}
