package com.example.ruairidhgrass.fruitmachine;

import com.example.ruairidhgrass.fruitmachine.fruitMachine.Fruit;
import com.example.ruairidhgrass.fruitmachine.fruitMachine.Machine;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class machineTest {

    Fruit machineChoosesCherry = Fruit.CHERRY;

    Machine machine;

    @Before
    public void before() {
        machine = new Machine();
    }

    @Test
    public void canGetRandomFruit() {
        Fruit randomFruit = machine.getRandomFruit();
        assertNotNull(randomFruit);
    }

    @Test
    public void canSpin() {
        Fruit[] outcome = machine.Spin();
        assertNotNull(outcome);
    }

}
