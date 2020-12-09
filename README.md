# JAVA5
谢宇翔 物191 2019311448（老师我前面更新了学生选课那个实验）
JAVA实验5模拟学生作业处理

# 阅读程序

## 实验过程
1. 将要处理的文本内容粘贴到文本文件B中
2. 编写学生类
3. 编写作业处理类(ProssHomework类)

## 核心方法
核心都在ProssHomework类里：
> 读取文本文件B内的内容：
```java
    byte[] buffer = new byte[1000];//缓冲区，用于接收数据。
		
		File file = new File("C:\\Users\\xieyuxiang0072\\Desktop\\文本文件B.txt");
		
		InputStream inputStream = new FileInputStream(file);
		int n = inputStream.read(buffer,0,1000);
		inputStream.close();	
```
> 对读取到的内容进行“改造”:
```java
    String str = new String(buffer,0,n-19,"UTF-8");
		StringBuilder str_ex = new StringBuilder(1000);//StringBuilder用来创建一个可变的字符序列
		str_ex.append(str);
		System.out.println(str_ex.length());//拿来统计字符数
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
```
> 将处理后的内容写入到新的文件“文本文件A”中：
```java
    byte[] data = str_ex.toString().getBytes("UTF-8");//将StringBuilder类型的str_ex转化为字符串然后再转化为字节数组
		Students student = new Students("谢宇翔","2019311448");
		byte[] data_s = student.getString(null).getBytes("UTF-8");//学生信息的字节数组
		File file_in = new File("C:\\Users\\xieyuxiang0072\\Desktop\\文本文件A.txt");
		OutputStream outputStream = new FileOutputStream(file_in);
		outputStream.write(data_s);
		outputStream.write(data);
		outputStream.close();
```

## 实验结果
> 文本文件A：
![结果](http://chuantu.xyz/t6/741/1607528678x1954578519.png)
