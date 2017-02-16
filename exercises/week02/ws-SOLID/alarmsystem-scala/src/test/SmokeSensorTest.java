package test;

import org.junit.Test;
import main.SmokeSensor;
import main.TriggerContacts;

import static org.junit.Assert.assertEquals;

public class SmokeSensorTest {

  @Test
  public void testThatGetLocationReturnsKitchen() {
    SmokeSensor sensor = new SmokeSensor(new TriggerContacts());
    String location = sensor.getLocation();
    assertEquals("Kitchen", location);
  }

  @Test
  public void testThatGetSensorTypeReturnsSmokeSensor() {
    SmokeSensor sensor = new SmokeSensor(new TriggerContacts());
    String sensorType = sensor.getSensorType();
    assertEquals("Smoke Sensor", sensorType);
  }

  @Test
  public void testThatGetBatteryPercentageDepreciatesByTwentyPercent() {
    SmokeSensor sensor = new SmokeSensor(new TriggerContacts());
    double batteryPercentage = sensor.getBatteryPercentage();
    sensor.isTriggered();
    double batteryPercentageAfterPolling = sensor.getBatteryPercentage();
    assertEquals(100.0, batteryPercentage, 0.01);
    assertEquals(80.0, batteryPercentageAfterPolling, 0.01);
  }
}
