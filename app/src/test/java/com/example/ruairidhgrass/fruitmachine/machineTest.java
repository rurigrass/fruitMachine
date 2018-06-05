package com.example.ruairidhgrass.fruitmachine;

import android.util.Range;

import com.example.ruairidhgrass.fruitmachine.fruitMachine.Fruit;
import com.example.ruairidhgrass.fruitmachine.fruitMachine.Machine;
import com.example.ruairidhgrass.fruitmachine.fruitMachine.Player;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static com.example.ruairidhgrass.fruitmachine.fruitMachine.Fruit.CHERRY;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class machineTest {

    Fruit machineChoosesCherry = CHERRY;

    Machine machine;
    Fruit[] fruits;

    @Before
    public void before() {
        machine = new Machine(100);
        fruits = new Fruit[]{CHERRY, CHERRY, CHERRY};
    }

    @Test
    public void canGetRandomFruit() {
        Fruit randomFruit = machine.getRandomFruit();
        assertNotNull(randomFruit);
    }

    @Test
    public void canSpin() {
        Fruit[] outcome = machine.spin();
        assertNotNull(outcome);
    }

    @Test
    public void canWin() {
        assertNotNull(machine.win());
    }

//    @Test
//    public void canWin(){
//        Fruit[] outcome = machine.spin();
//        boolean checkOutcome = outcome.checkWin();
//        int winner = checkOutcome.win();
//        assertEquals(winner, machine.win());
//    }

//    @Test
//    public void canGetArray() {
//        assertEquals("cherrycherrycherry", machine.getArray());
//    }


}
