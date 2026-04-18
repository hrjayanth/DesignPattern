package com.learn.jay.adapter;

import com.learn.jay.origional.BugattiVeyron;
import com.learn.jay.origional.Movable;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdapterTester {

    @Test
    public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() {
        Movable bugattiVeyron = new BugattiVeyron();
        MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);

        assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
    }
}
