package bmi;
import java.util.Scanner;

public class calc_bmi {
    public static void main(String[] args) {
    	// 스캐너 활성화
        Scanner scanner = new Scanner(System.in);
        
        //변수 초기화
        int people_low = 0;
        int people_standard = 0;
        int people_high = 0;
        int people_error = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("키를 입력: ");
            double height = scanner.nextDouble();

            System.out.print("몸무게를 입력: ");
            double weight = scanner.nextDouble();
            
            //필요한 변수 계산
            double standard_weight = (height - 100) * 0.9;
            double unit = weight / (height - 100);
            int over_weight = (int) (weight - standard_weight);
           
            //계산된 유닛에 따라 체중 판별
            if (unit >= 1.0) {
                people_high++;
                System.out.println("당신의 체중은 " + over_weight + "kg 과체중입니다.");
            } 
            else if (unit >= 0.80) {
                people_standard++;
                System.out.println("당신은 표준체중입니다.");
            } 
            else if (unit >= 0.60) {
                people_low++;
                System.out.println("당신의 체중은 " + over_weight + "kg 저체중입니다.");
            } 
            else {
                System.out.println("관리가 필요합니다.");
                people_error++;
            }
        }
        //위 for문을 통해 얻은 변수값을 통해 몇명인지 출력. 또한 그에따라 별의 개수도 달라짐.
        System.out.println("\n저체중(" + people_low + "명)     | " + "*".repeat(people_low));
        System.out.println("표준 체중(" + people_standard + "명)     | " + "*".repeat(people_standard));
        System.out.println("과체중(" + people_high + "명)     | " + "*".repeat(people_high));
        System.out.println("이상(" + people_error + "명)     | " + "*".repeat(people_error));
        scanner.close();
    }
}
