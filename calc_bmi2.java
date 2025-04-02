package bmi;
import java.util.Scanner;
public class all_people {
	public static void main(String [] args) {
		// 스캐너 활성화
		Scanner scanner = new Scanner(System.in);
		//배열 정의
		double [] height = new double[5];
		double [] weight = new double[5];
		double [] bmi = new double[5];
		
		//변수 초기화
		int people_low = 0;
        int people_standard = 0;
        int people_high = 0;
        int people_error = 0;
		
       
		for (int i=0; i<5; i++) {
			//키, 몸무게 입력 받음.
			System.out.print("키를 입력: ");
			height[i] = scanner.nextDouble();
			System.out.print("몸무게를 입력: ");
			weight[i] = scanner.nextInt();
			
			//bmi 계산
            bmi[i] = weight[i] / (height[i] - 100);
			
            //bmi 값에 따라 과체중, 표준체중, 저체중, 이상 변수에 1씩 추가해줌.
			if (bmi[i] >= 1.0) {
                people_high++;
            } 
            else if (bmi[i] >= 0.80) {
                people_standard++;
            } 
            else if (bmi[i] >= 0.60) {
                people_low++;
            } 
            else {
                people_error++;
            }
        }
		//위 for문을 통해 얻은 변수값을 통해 몇명인지 출력. 또한 그에따라 별의 개수도 달라짐.
        System.out.println("\n저체중(" + people_low + "명)     | " + "*".repeat(people_low));
        System.out.println("표준 체중(" + people_standard + "명)     | " + "*".repeat(people_standard));
        System.out.println("과체중(" + people_high + "명)     | " + "*".repeat(people_high));
        System.out.println("관리 절실(" + people_error + "명)     | " + "*".repeat(people_error));
		scanner.close();

	}
}
