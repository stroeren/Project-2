package textbook;


public class StackWork
{
   int[] S0;
   int S0top;   
   int S0length;
   
   int[] S1;
   int S1top;   
   int S1length;
   
   int[] S2;
   int S2top;   
   int S2length;
   
   
   // Precondition: S0size, S1size, and S2size are greater than 0.
   // Postcondition: The stacks S0, S1, and S2, are created, and their respective lengths are initialized.
   public StackWork(int S0size, int S1size, int S2size)
   {
      this.S0length = S0size;
      this.S1length = S1size;
      this.S2length = S2size;
      this.S0 = new int[S0size];
      this.S1 = new int[S1size];
      this.S2 = new int[S2size];
      this.S0top = -1;
      this.S1top = -1;
      this.S2top = -1;
   }

   // Precondition: StackSelector is equal to 0, 1, or 2.
   // Postcondition: If StackSelector is 0, then the new element x is inserted in stack S0. If StackSelector is 1, 
   // then the new element x is inserted in stack S1. If StackSelector is 2, then the new element x is inserted 
   // in stack S2.
   public void Push(int StackSelector, int x) {
   if (StackSelector == 0) {
      if (S0top < S0length - 1) {
         S0[++S0top] = x;
      } else {
         System.out.println("S0 is full. Cannot push " + x);
      }
   }
   if (StackSelector == 1) {
      if (S1top < S1length - 1) {
         S1[++S1top] = x;
      } else {
         System.out.println("S1 is full. Cannot push " + x);
      }
   }
   if (StackSelector == 2) {
      if (S2top < S2length - 1) {
         S2[++S2top] = x;
      } else {
         System.out.println("S2 is full. Cannot push " + x);
      }
   }
}

   

   // Precondition: StackSelector is equal to 0, 1, or 2.
   // Postcondition: If StackSelector is 0, then an element is taken out of stack S0 and is returned to the caller. 
   // If StackSelector is 1, then an element is taken out of stack S1 and is returned to the caller.
   // If StackSelector is 2, then an element is taken out of stack S2 and is returned to the caller.
 
   public int Pop(int StackSelector) {
   if (StackSelector == 0) {
      if (S0top >= 0) {
         return S0[S0top--];
      } else {
         System.out.println("S0 is empty. Cannot pop.");
         return -1;
      }
   }
   if (StackSelector == 1) {
      if (S1top >= 0) {
         return S1[S1top--];
      } else {
         System.out.println("S1 is empty. Cannot pop.");
         return -1;
      }
   }
   if (StackSelector == 2) {
      if (S2top >= 0) {
         return S2[S2top--];
      } else {
         System.out.println("S2 is empty. Cannot pop.");
         return -1;
      }
   }
   return -1; // Default return if StackSelector is not valid
}

   
   
   // Precondition: 
   // Postcondition: The elements of the stack S0 are displayed, followed by the elements of the stack S1, and in the end
   // the elements of the Stack S2.
   public void displayStackData() {
   System.out.println("Stack S0:");
   for (int i = 0; i <= S0top; i++) {
      System.out.println(S0[i]);
   }
   System.out.println("Stack S1:");
   for (int i = 0; i <= S1top; i++) {
      System.out.println(S1[i]);
   }
   System.out.println("Stack S2:");
   for (int i = 0; i <= S2top; i++) {
      System.out.println(S2[i]);
   }
}


      
   // Precondition: The StackWork object exists.
   // Postcondition: The instance variable S0top is returned.
   public int getS0top()   
   {
	   return S0top;
   }
}	