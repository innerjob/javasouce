package Student;

import java.util.Scanner;

public class StudentScore {

	/**
	 * @param args
	 *///Java������ơ����ݿ⡢Ӣ����������������֡����ݽṹ zhangsan��lisi��wangwu��zhaoliu��xiaozhang��xiaowang��xiaoli��xiaozhao
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
		
		 System.out.println("������Ҫ��ѯ�ɼ���ѧ������");
		 String studentName=IN.nextLine();
		 for(int i=0;i<8;i++)
		 {
			 if(name[i].equals(studentName))
				 {
				 System.out.println("ѧ����"+name[i]+"�ĳɼ����£�");
				 System.out.println("java�������:"+score[i][0]+"���ݿ�:"+score[i][1]+"Ӣ��:"+score[i][2]+"����:"+score[i][3]
						 +"����:"+score[i][4]+"����:"+score[i][5]+"���ݽṹ:"+score[i][6]);
				 break;
				 };
		 }
		 System.out.println("������Ҫ��ѯ��Ŀ�������ѧ�����������������");
		 System.out.println("1Java������ơ�2���ݿ⡢3Ӣ�4������5������6���֡�7���ݽṹ");
		 int xuhao=IN.nextInt();
		 int number=0;
		 System.out.println("�������ѧ��Ϊ");
		 for(int i=0;i<8;i++)
		 {
			 if(score[i][xuhao-1]<60)
			 { number++;
			 System.out.println("ѧ����"+name[i]);
			 }
			 }
		 System.out.println("����������"+number+"��");

	}

}
