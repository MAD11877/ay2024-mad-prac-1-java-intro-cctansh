import java.util.Scanner;
import java.util.Arrays;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    int count = in.nextInt();

    int[] nums = new int[count];
    
    for (int i = 0; i < count; i++) {
      nums[i] = in.nextInt();
    }
    
    Arrays.sort(nums);

    int mode = 0;
    int current = 0;
    int count1 = 0;
    int count2 = 0;
    
    for (int j = 0; j <= count; j++) {

      if (j == 0) {
        current = nums[j];
      }
      else if (j == count) {
        count2++;
        if (count2 > count1) {
          count1 = count2;
          mode = current;
        }
        break;
      }
      
      if (nums[j] != current) {
        if (count2 > count1) {
          count1 = count2;
          mode = current;
        }
        current = nums[j];
        count2 = 0;
      }
      count2++;
    }
    
    System.out.println(mode);
  }
}
