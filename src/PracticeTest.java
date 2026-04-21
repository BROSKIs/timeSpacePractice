import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient
  @Test
  void testMostCommonTimeEfficient() {
    //arrange
    int expected = 7;
    int[] nums = {1, 7, 4, 7, 8, 4, 12};

    //act
    int actual = Practice.mostCommonTimeEfficient(nums);

    //assert
    assertEquals(expected, actual);
  }

  @Test
  void testMostCommonSpaceEfficient() {
    //arrange
    int expected = 7;
    int[] nums = {1, 7, 4, 7, 8, 4, 12};

    //act
    int actual = Practice.mostCommonSpaceEfficient(nums);

    //assert
    assertEquals(expected, actual);
  }
  }
  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls

