package studentsHomework;

import java.io.*;

public class ProssHomework {
	public static void main(String[] args) throws IOException{
		byte[] buffer = new byte[1000];
		
		File file = new File("C:\\Users\\xieyuxiang0072\\Desktop\\文本文件B.txt");
		
		InputStream inputStream = new FileInputStream(file);
		int n = inputStream.read(buffer,0,1000);
		inputStream.close();		
		
		String str = new String(buffer,0,n-19,"UTF-8");
		StringBuilder str_ex = new StringBuilder(1000);
		str_ex.append(str);
		System.out.println(str_ex.length());
		int j = 0,z;
		for(int i=7;i<str_ex.length()-45;i=i+7) {
			z = i + j;
			if(i%2 == 0) {
				str_ex.insert(z, "。\n");
				j = j + 2;
			}
			else {
				str_ex.insert(z, "，");
				j = j+1;
			}
		}
		
		byte[] data = str_ex.toString().getBytes("UTF-8");
		Students student = new Students("谢宇翔","2019311448");
		byte[] data_s = student.getString(null).getBytes("UTF-8");
		File file_in = new File("C:\\Users\\xieyuxiang0072\\Desktop\\文本文件A.txt");
		OutputStream outputStream = new FileOutputStream(file_in);
		outputStream.write(data_s);
		outputStream.write(data);
		outputStream.close();
		
		
		
	}

}
