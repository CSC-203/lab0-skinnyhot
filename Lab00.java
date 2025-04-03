public class Lab00
{
   public static void main(String[] args)
   {
      //declaring and initializing some variables
      int x = 5;
      String y = "hello";
      float z = 9.8f;

      //printing out variables
      System.out.println("x:" + x + " y:" + y + " z:" + z);

      // a list (make an array in java)
      int[] nums = {3, 6, -1, 2};
      for (int i = 0; i < nums.length; i++) {
         System.out.println(nums[i]);
      }
      // call a function
      int numFound = char_count(y, 'l');
      System.out.println("Found:" + numFound);
      // A counting loop
      for(int i = 1; i < 11; i++){
         System.out.print(i + " ");
      }
   }
   // function
   public static int char_count(String s, char c){
      int count = 0;
      for (int i = 0; i < s.length(); i++){
         if(s.charAt(i) == c) {
            count += 1;
         }
      }
      return count;
   }
}

