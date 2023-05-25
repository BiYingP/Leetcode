// Solving Questions with Brainpower

// Given a 0-indexed 2D integer array 'questions' where question[i] = [points i, brainpower i]

// The array describes the questons of an exam, where you have to process the questions in order(i.e., starting from question0) and make a decision whether to solve or skip each question. Solving question i will earn you points i points but you will be unable to solve each of next brainpower i questions. If you skip question i, you get to make the secision on the next question.

// For example, given questions = [[3,2],[4,3],[4,4],[2,5]]:
// if question 0 is solved, you will earn 3 points but you will be unable to solve question 1 and 2.
// if instead, question 0 is skipped and question 1 is solved, you will earn 4 points, but you will be unable to solve questions 2 and 3.

// Return the maximum points you can earn for the exam.

// Example:

// Input: questions = [[3,2],[4,3],[4,4],[2,5]]
// Output: 5

// Explanation: The maximum points can be earned by solving questions 0 and 3.
// solving question 0: earn 3 points, will be unable to solve the next 2 questions
// unbale to solve question 1 and 2
// solve question 3: earn 2 points

// Total points earned: 3+2=5. There is no other way to earn 5 or more points.

public class MostPoints{
	public static int mostPoints(int[][] questions){

	}
	public static void main(String[] args){

	}
} 
