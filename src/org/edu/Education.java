package org.edu;

public class Education extends Arts {
	public void ug() {
	System.out.println("I am studying UG");
}
	public void pg() {
		System.out.println("I am studying PG");
	}
	public static void main(String[] args) {
		Education edu = new Education();
		edu.ug();
		edu.pg();
		edu.ba();
		edu.bba();
		edu.bsc();
		edu.bed();
		edu.btech();
		edu.be();
	}
}
