package com.jsp;

public class CustomString{
	private char[] value;
	public CustomString() {
		value = new char[0];
	}
	public CustomString(char[] ch) {
		value = new char(ch.length) {
			for(int i = 0; i<ch.length; i++) {
				{
					value[i] = ch[i];
				}
			}
			public int length() {
				return value.length;
			}
			public boolean isEmpt() {
				return value.length == 0;
			}
			
			@Override
			public  String toString() {
				if(isEmpty()) {
					return "";
				}
				String res = "";
				for(int i = 0; i<value.length; i++) {
					res = res+value[i];
				}
				return res;
			}
			public static void main(String[] args) {
				String s = new String():
					System.out.println(s);
				
				CustomeString cs = new CustomString();
				System.out.println(cs):
					
					
			}
		}
	}
}