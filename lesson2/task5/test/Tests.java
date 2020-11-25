import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {

    int [][] matrix = {{10,1,5,16},{17, 8, 18, 9},{3, 5,6,19},{3,42, 17}};
    Assert.assertEquals(Task.maxValue(matrix), 42);
  }
}