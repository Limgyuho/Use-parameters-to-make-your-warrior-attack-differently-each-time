// 문제 : 매개변수를 사용해서 전사가 매번 다르게 공격하도록 해주세요.

class Main {
  public static void main(String[] args) {
    전사 a전사 = new 전사();

    a전사.공격("브라이언이(가)","칼(으)로");
    //실행문안에 있는 것은 인자값 이라고한다
    // 브라이언이(가) 칼(으)로 공격합니다.

    a전사.공격("필립이(가)","창(으)로"); 
    // 필립이(가) 창(으)로 공격합니다.

    a전사.공격("마크이(가)","지팡이(으)로"); 
    // 마크(가) 지팡이(으)로 공격합니다.
  }
}
class 전사{
	
	public void 공격(String 전사, String 무기) {
		//위의 실행문에서 받아서 사용할수 있게 하는 매개변수 파라미터를 넣어준다
		System.out.printf("%s가%s로 공격합니다\n",전사,무기);
	}
}