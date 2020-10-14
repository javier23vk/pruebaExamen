package es.upm.profundizacion.pruebaExamen2018;

public class MyString {
	private String str;
	public MyString() {
		this.str="";
	}
	public MyString(String p) {
		this.str=p;
	}

	public int compareTo(String str ) {
		int len ;
		if (str.length()>this.str.length()) {
			len =this.str.length();
		}
		else if (str.length()<this.str.length()) {
			len = str.length();
		}
		else {
			len = str.length();
		}
		for (int i =0;i<len;i++) {
			if (this.str.charAt(i)>str.charAt(i)) {
				return 1;
			}
			if (this.str.charAt(i)<str.charAt(i)) {
				return -1;
			}

		}
		if (str.length()<this.str.length()) {
				return 1;
		}
		if(str.length()==this.str.length()) {
			return 0;
		}
		return -1;

	}
}
