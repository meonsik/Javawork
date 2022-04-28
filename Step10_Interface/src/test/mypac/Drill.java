package test.mypac;
//추상메소드가 1개인 인터페이스
	// useWeapon( ()->{} ); 의 코딩을 하기 위해 @fun을 적는다. 메소드 2개 이상이면 에러가 남. 
@FunctionalInterface
public interface Drill {
	public void hole();
}
