package racing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

import static javax.swing.text.html.HTML.Tag.U;

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

        HashMap<String, String> result = new HashMap<>();
        for (int i = 0; i < carList.getCarsSize(); i++) {
            result.put(carList.getCarsName().get(i), "");
        }
        for (int i = 0; i < countInput; i++) { // 차의 리스트 표시
            System.out.println("(" + (i + 1) + ")");
            for (String car : result.keySet()) {
                DiceNum diceNum = new DiceNum();
                if (diceNum.getDiceResult() == 1) {
                    result.put(car, result.get(car) + "-");
                }
                // 각 차량의 현재 상태 출력
                System.out.println(car + " : " + result.get(car));
            }
            System.out.println();
        }

        // 최종 결과
        System.out.println("최종 결과");
        for (Map.Entry<String, String> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
