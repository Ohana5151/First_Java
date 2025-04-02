package bmi;
import java.util.Scanner;
public class grade_calc {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		//배열의 길이를 5로 고정
		double [] point = new double[5];
		
		//변수 초기화
		int all = 0;
		double ave = 0;
		int d_ave = 0;
			
		int A = 0;
	    int B = 0;
	    int C = 0;
	    int D = 0;
	    int F = 0;
		
	    //입력받은 점수에 따라 등급판별
	    for (int i=0; i<5; i++) {
			System.out.print("점수를 입력: ");
			point[i] = scanner.nextDouble();
			if (point[i] >= 90) {
				A++;
				} 
	        else if (point[i] >= 80) {
	            B++;
	            } 
	        else if (point[i] >= 70) {
	            C++;
	            } 
	        else if (point[i] >= 60) {
	            D++;
	            }
	        else {
	            F++;
	            }
	    }
	    for (int i=0; i<5; i++) {
	    	//전체 점수 합산
	    	all += point[i];
	    }
	    //평균 계산
	    ave = all/5;
	    for (int i=0; i<5; i++) {
	    	if (point[i]<ave) {
	    		//평균이하 학생 판별
	    		d_ave++;
	    	}
	    	
	    }
				
	    //위 for문을 통해 얻은 변수값을 통해 몇명인지 출력. 또한 그에따라 별의 개수도 달라짐.	
	    System.out.println("\n평균 미만 학생 수는" + d_ave + "명이고 성적 분포는 아래와 같습니다.");    
	    System.out.println("A(" + A + "명)| " + "*".repeat(A));
	    System.out.println("B(" + B + "명)| " + "*".repeat(B));
	    System.out.println("C(" + C + "명)| " + "*".repeat(C));
	    System.out.println("D(" + D + "명)| " + "*".repeat(D));
	    System.out.println("F(" + F + "명)| " + "*".repeat(F));
	    scanner.close();
	    }
	}
