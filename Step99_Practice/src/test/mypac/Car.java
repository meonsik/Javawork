package test.mypac;
/*
 * Å¬·¡½ºÀÇ ¿ªÇÒÀº ¹»±î¿ä?
 * 1.°´Ã¼ÀÇ ¼³°èµµ ¿ªÇÒ. new Car() - ¼³°èµÈ´ë·Î ÇÊµå¿Í ¸Ş¼Òµå¸¦ °¡Áü
 * ¤¤ ¼³°èÇÑ class·Î ¸®¸ğÄÜ(°´Ã¼)À» Âï¾î³¿. ¶È°°Àº ±â´ÉÀ» °¡Áø ´Ù¸¥ °´Ã¼ »ı¼º
 * ¤¤ ÂüÁ¶µ¥ÀÌÅÍ Å¸ÀÔ (String PrintStream Car...
 * 2.µ¥ÀÌÅÍ Å¸ÀÔÀÇ ¿ªÇÒ
 * 3.Å¬·¡½º¸¦ Á¤È®È÷ ½Äº°ÇÏ´Â ¹æ¹ı? - ÆĞÅ°Áö¸íÀ¸·Î ±¸ºĞÇÏ±â. test.maypac.Car
 * 4.static ÇÊµå¿Í ¸Ş¼Òµå¸¦¤© Á¦°ø heap¿µ¿ªÀ» ÂüÁ¶°ªÀ¸·Î ±¸ºĞµÇ´Â °´Ã¼.
 * 		stack¿µ¿ªÀº ¸Ş¼Òµå È£­„¸¶´Ù Áö¿ªº¯¼ö°¡ ¸¸µé¾îÁü ¸®ÅÏµÇ¸é »ç¶óÁü
 * `	static¿µ¿ªÀº
 */
public class Car {
	//ÀúÀå¼Ò(field)
	public String name;
	//´Ş¸®´Â ±â´É(method)
	public void drive() {
		System.out.println(this.name+"ÀÌ(°¡) ´Ş·Á¿ä!");
	}
	//¸ØÃß´Â ±â´É(method) 
	public void stop() {
		System.out.println(this.name+"ÀÌ(°¡) ¸ØÃç¿ä!");
		
		
	}
}
