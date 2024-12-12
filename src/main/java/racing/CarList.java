package racing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CarList {

    private List<String> carList;

    public void getCarList() {
        for (int i = 0; i < carList.size(); i++) {
            System.out.println(carList.get(i));
        }
    }
    // 해쉬맵에 넣을때 리스트의 사이즈를 알기 위해 만듦
//    public int getCarsSize() {
//        int carsSize = carList.size();
//        return carsSize;
//    }
//    // 해쉬맵에 넣을때 차의 이름을 알기 위해 만듦
//    public List<String> getCarsName() {
//        List<String> name = new ArrayList<>();
//        for (int i = 0; i < getCarsSize(); i++) {
//            name.add(carList.get(i));
//        }
//        return name;
//    }

    public List<List<String>,String> car() {

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
//        return this.carList;
    }
}
