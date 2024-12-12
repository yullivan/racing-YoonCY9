package racing;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

class ApplicationTests {
    @Test
    void name() {

    }
    //    @Test
//    void 주사위테스트() {
//        DiceNum num = new DiceNum();
//
//    }
//
//    @Test
//    void 차들테스트() {
////        String cars = "aaa,nnn,ccc,bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb";
//        String cars2 = "aaa,nnn,ccc,bbbb";
//        String[] carsArray = cars2.split(",");
//        for (int i = 0; i < carsArray.length; i++) {
//            if (carsArray[i].length() > 10) {
//                throw new IllegalArgumentException("자동차의 이름은 10자를 초과할수 없습니다.");
//            }
//        }
//        List<String> carList = Arrays.asList(carsArray);
//        System.out.println(carList);
//    }
//
//    @Test
//    void 자동차이름을해쉬맵키에넣기() {
//        String cars2 = "aaa,bbb,ccc,ddd";
//        String[] carsArray = cars2.split(",");
//        for (int i = 0; i < carsArray.length; i++) {
//            if (carsArray[i].length() > 10) {
//                throw new IllegalArgumentException("자동차의 이름은 10자를 초과할수 없습니다.");
//            }
//        }
//        List<String> carList = Arrays.asList(carsArray);
//        HashMap<String, Integer> cars = new HashMap<>();
//        for (int i = 0; i < carList.size(); i++) {
//            cars.put(carList.get(i),i);
//        }
//        for (int i = 0; i < 3; i++) {
//            System.out.println("-------------");
//            for (Map.Entry<String, Integer> entry : cars.entrySet()) {
//                String key = entry.getKey();
//                Integer value = entry.getValue();
//                System.out.println(key + "." + value);
//            }
//        }
//    }
//
//    @Test
//    void 전진후진값을밸류에넣기() {
//
//        String cars2 = "aaa,bbb,ccc,ddd";
//        String[] carsArray = cars2.split(",");
//        for (int i = 0; i < carsArray.length; i++) {
//            if (carsArray[i].length() > 10) {
//                throw new IllegalArgumentException("자동차의 이름은 10자를 초과할수 없습니다.");
//            }
//        }
//
//        List<String> carList = Arrays.asList(carsArray);
//
//
//        HashMap<String, String> result = RaceGoOrStop.raceResult(carList);
//        for (Map.Entry<String, String> entry : result.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//
//    }


//    private static void print(HashMap<String, String> cars) {
//        for (Map.Entry<String, String> entry : cars.entrySet()) {
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key + "." + value);
//        }
//    }
}
