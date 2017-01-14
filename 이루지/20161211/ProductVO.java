package org.zerock.domain;
//SampleController3.java
//만들어진 결과 데이터를 전달해야 하는 경우 
public class ProductVO {

	private String name;
	private double price;
	
	public ProductVO(String name, double price){
		super();
		this.name = name;
		this.price = price;
	}
	public String getName(){
		return name;
	}
	public double getPrice(){
		return price;
	}
	
	public String toString(){
		return "ProductVO [name="+name+ ", price="+ price+"]";
	}
}
