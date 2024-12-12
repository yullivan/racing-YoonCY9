package racing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("레이스에 참가할 자동차들의 이름을 쉼표로 구분하여 입력하세요.");
        System.out.print(": ");
        CarList carList = new CarList();
        carList.car();
        System.out.println("몇회 시행할까요?");
        System.out.print(": ");
        int countInput = scanner.nextInt();

        for (int i = 0; i < countInput; i++) { // 차의 리스트 표시
            System.out.println("(" + (i+1) + ")");
            carList.getCarList();
            System.out.println();
        }
        DiceNum num = new DiceNum(); // 주사위 굴리기
        int goOrStop = num.getDiceResult(); // go or stop은 0또는 1

    }


}
