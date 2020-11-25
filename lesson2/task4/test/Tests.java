import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {

    int [][] matrix = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};

    Assert.assertEquals(15, Task.sum(matrix));
  }
}