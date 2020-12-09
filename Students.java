package studentsHomework;

public class Students {
	String name,XueHao;
	public Students(String n,String id) {
		name = n;
		XueHao = id;
	}
	
	public String getString(String str) {
		str = name + XueHao + "\n";
		return str;
	}

}
