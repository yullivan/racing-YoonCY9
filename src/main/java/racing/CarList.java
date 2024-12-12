package racing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CarList {

    private List<String> carList;

    public List<String> getCarList() {
        return carList;
    }

    public List<String> car() {

        Scanner scanner = new Scanner(System.in);
        String cars = scanner.nextLine();
        String[] carsArray = cars.split(",");
        for (int i = 0; i < carsArray.length; i++) {
            if (carsArray[i].length() > 10) {
                throw new IllegalArgumentException("자동차의 이름은 10자를 초과할수 없습니다.");
            }
        }
        List<String> carList = Arrays.asList(carsArray);
        this.carList = carList;
//        System.out.println(carList.get(0));
//        System.out.println(carList.get(1));
//        System.out.println(carList.get(2));
        return this.carList;
    }
}
