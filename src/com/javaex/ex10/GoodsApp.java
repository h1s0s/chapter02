package com.javaex.ex10;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods[] goodsArray = new Goods[3];
		Goods camera = new Goods("니콘", 400000);
		goodsArray[0] = camera;
		Goods cup = new Goods("머그컵", 2000); 
		goodsArray[1] = cup;
		Goods computer = new Goods("LG그램", 900000);
		goodsArray[2] = computer;
		
		System.out.println(camera.toString());
		System.out.println(goodsArray[0].toString());//배열이 갖고있는 주소값이 같기에 결과가 같음
		
		int count = 0;
		
		for(int i=0; i<goodsArray.length; i++) {
			if(goodsArray[i] != null) {//배열에 주소가 없지 않을때
			System.out.println(goodsArray[i].toString());
			count++;
			}
		}
		System.out.println("count:"+count);
		
		//이름만 출력하기
		for(int i=0; i<goodsArray.length; i++) {
			System.out.println(goodsArray[i].getName());
		}
	}

}
