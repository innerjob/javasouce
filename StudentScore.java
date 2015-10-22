package Student;

import java.util.Scanner;

public class StudentScore {

	/**
	 * @param args
	 *///Java程序设计、数据库、英语、高数、体育、音乐、数据结构 zhangsan、lisi、wangwu、zhaoliu、xiaozhang、xiaowang、xiaoli、xiaozhao
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner IN =new Scanner(System.in);
		 String []name={"zhangsan","lisi","wangwu","zhaoliu","xiaozhang","xiaowang","xiaoli","xiaozhao"};
		 float[][]score={
				 {12,64,92,54,11,13,56},
				 {12,74,93,53,21,13,16},
				 {12,55,83,23,11,13,56},
				 {12,30,73,52,11,13,46},
				 {12,83,77,54,21,13,66},
				 {12,95,66,43,13,13,77},
				 {12,44,20,823,13,13,88},
				 {12,31,15,923,21,13,89}
				 
		 };
		
		 System.out.println("请输入要查询成绩的学生名字");
		 String studentName=IN.nextLine();
		 for(int i=0;i<8;i++)
		 {
			 if(name[i].equals(studentName))
				 {
				 System.out.println("学生："+name[i]+"的成绩如下：");
				 System.out.println("java程序设计:"+score[i][0]+"数据库:"+score[i][1]+"英语:"+score[i][2]+"高数:"+score[i][3]
						 +"体育:"+score[i][4]+"音乐:"+score[i][5]+"数据结构:"+score[i][6]);
				 break;
				 };
		 }
		 System.out.println("请输入要查询科目不及格的学生名单及人数的序号");
		 System.out.println("1Java程序设计、2数据库、3英语、4高数、5体育、6音乐、7数据结构");
		 int xuhao=IN.nextInt();
		 int number=0;
		 System.out.println("不及格的学生为");
		 for(int i=0;i<8;i++)
		 {
			 if(score[i][xuhao-1]<60)
			 { number++;
			 System.out.println("学生："+name[i]);
			 }
			 }
		 System.out.println("不及格人数"+number+"人");

	}

}
