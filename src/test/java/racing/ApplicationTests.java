package racing;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

class ApplicationTests {

    @Test
    void 주사위테스트() {
        DiceNum num = new DiceNum();
        System.out.println(num.getDice());
    }

}
