package by.stqa.pft.sandbox;

import by.stqa.pft.sandox.Point;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void tesDistance() {
    Point p = new Point(2, 2);
    Point p2 = new Point(9, 9);
    Assert.assertEquals(p.distance(p2), 9.899494936611665);
  }
  @Test
  public void tesDistance2() {
    Point p = new Point(2, 2);
    Point p2 = new Point(9, 5);
    Assert.assertEquals(p.distance(p2), 9.899494936611665);
  }
  @Test
  public void tesDistance3() {
    Point p = new Point(2, 2);
    Point p2 = new Point(9, 9);
    Assert.assertEquals(p.distance(p2), 9.899494936611664);
  }
}

