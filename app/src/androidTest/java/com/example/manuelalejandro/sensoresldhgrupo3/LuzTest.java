package com.example.manuelalejandro.sensoresldhgrupo3;

import android.hardware.Sensor;
import android.hardware.SensorManager;

import junit.framework.TestCase;

import java.util.List;

/**
     * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */

public class LuzTest extends TestCase {

    protected Sensor s;
    protected SensorManager sensorM;
    protected List<Sensor> sensores;

    protected void setUp()
    {
        sensores = sensorM.getSensorList(Sensor.TYPE_LIGHT);
    }

    public void testAdd() {

        assertTrue("Existe el Sensor Luz",sensores!=null);
    }

}
