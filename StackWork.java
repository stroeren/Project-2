package textbook;


public class StackWork
{
   private int[] S0;
   private int S0top;   
   private int S0length;
   
   private int[] S1;
   private int S1top;   
   private int S1length;
   
   private int[] S2;
   private int S2top;   
   private int S2length;
   
   
   // Precondition: S0size, S1size, and S2size are greater than 0.
   // Postcondition: The stacks S0, S1, and S2, are created, and their respective lengths are initialized.
   public StackWork(int S0size, int S1size, int S2size)
   {
	   // Implement me.
   }

   // Precondition: StackSelector is equal to 0, 1, or 2.
   // Postcondition: If StackSelector is 0, then the new element x is inserted in stack S0. If StackSelector is 1, 
   // then the new element x is inserted in stack S1. If StackSelector is 2, then the new element x is inserted 
   // in stack S2.
   public void Push(int StackSelector, int x)
   {	 
	   // Implement me.
   }
   

   // Precondition: StackSelector is equal to 0, 1, or 2.
   // Postcondition: If StackSelector is 0, then an element is taken out of stack S0 and is returned to the caller. 
   // If StackSelector is 1, then an element is taken out of stack S1 and is returned to the caller.
   // If StackSelector is 2, then an element is taken out of stack S2 and is returned to the caller.
 
   public int Pop(int StackSelector)
   {
	   // Implement me.  
   }
   
   
   // Precondition: 
   // Postcondition: The elements of the stack S0 are displayed, followed by the elements of the stack S1, and in the end
   // the elements of the Stack S2.
   public void displayStackData()
   {
	   // Implement me.
   }

      
   // Precondition: The StackWork object exists.
   // Postcondition: The instance variable S0top is returned.
   public int getS0top()   
   {
	   // Implement me.
   }
   
}	