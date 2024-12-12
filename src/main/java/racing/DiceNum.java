package racing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class DiceNum {

    private int dice;
    private int diceResult;

    // 생성하면 바로 주사위값이 나옴
    public DiceNum() {
        this.dice = diceDraw();
    }

    private int getDice() {
        return dice;
    }
    public int getDiceResult() {
        this.diceResult = diceResult(this.dice);
        return diceResult;
    }

    // 주사위를 굴려서 나온 결과를 DiceNum에 리턴
    private int diceDraw() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            list.add(i);
        }
        Collections.shuffle(list,new Random());

        int diceNum = list.get(0);
        return diceNum;
    }

    // 주사위 결과가 3미만이면 0을 리턴, 그 이상이면 1을 리턴
    private int diceResult(int dice) {
        this.dice = dice;
        int diceResult = 0;
        if (getDice() < 3) {
            return diceResult;
        }else {
            diceResult = 1;
            return diceResult;
        }
    }
}
