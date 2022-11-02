# Sum of Two Integers

Given two integers a and b, return the sum of the two integers without using the operators + and -.

Example:

Input: a = 1, b = 2

Output: 3



    public int getSum(int a, int b) {
        while(b != 0){
            // carry
            int carry = (a & b) << 1;
            // sum 
            a = a ^ b;
            b = carry;
        }
        return a;
    }



