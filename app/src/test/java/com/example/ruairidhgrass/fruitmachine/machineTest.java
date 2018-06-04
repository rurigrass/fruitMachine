package com.example.ruairidhgrass.fruitmachine;

import com.example.ruairidhgrass.fruitmachine.fruitMachine.Fruit;
import com.example.ruairidhgrass.fruitmachine.fruitMachine.Machine;

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
        machine = new Machine(10);
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


}
