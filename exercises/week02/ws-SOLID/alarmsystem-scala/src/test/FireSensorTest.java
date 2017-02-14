package test;

import main.FireSensor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FireSensorTest {

  @Test
  public void testThatGetLocationReturnsBedroom() {
    FireSensor sensor = new FireSensor();
    String location = sensor.getLocation();
    assertEquals("Bedroom", location);
  }

  @Test
  public void testThatGetSensorTypeReturnsFireSensor() {
    FireSensor sensor = new FireSensor();
    String sensorType = sensor.getSensorType();
    assertEquals("Fire Sensor", sensorType);
  }

  @Test
  public void testThatGetBatteryPercentageDepreciatesByTenPercent() {
    FireSensor sensor = new FireSensor();
    double batteryPercentage = sensor.getBatteryPercentage();
    sensor.isTriggered();
    double batteryPercentageAfterPolling = sensor.getBatteryPercentage();
    assertEquals(100.0, batteryPercentage, 0.01);
    assertEquals(90.0, batteryPercentageAfterPolling, 0.01);
  }
}
