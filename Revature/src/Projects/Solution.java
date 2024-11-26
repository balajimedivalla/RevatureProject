package Projects;

		public class Solution
{
	
	  public int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
        
        /*5-1 =4 and 5-2=3;
         * 4-1=3 and 4-2=2;=== 3+2=5;
         * 3-1=2 and 3-2=1;
         * 2-1=1; and 2-2=0;
         * */
	}
	  
	  
	  	public static void main(String[] args) {	
	        Solution a = new Solution();
	        int n = 5;
	        System.out.println( a.fibonacci(n));
	        
	  }
}