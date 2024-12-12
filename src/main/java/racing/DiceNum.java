package racing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class DiceNum {

    private int dice;


    public DiceNum() {
        this.dice = diceDraw();
    }

    public int getDice() {
        return dice;
    }

    private int diceDraw() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            list.add(i);
        }
        Collections.shuffle(list,new Random());

        int diceNum = list.get(0);
        return diceNum;
    }
}
