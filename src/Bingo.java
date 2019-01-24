/**
 ******************************************************************************
 *                        BINGO
 ******************************************************************************
 *
 * The standard bingo game.
 *
 *
 *
 *
 * Name:         WRITE YOUR NAME HERE !!!!!!!!!!!
 *
 * Date:
 * 
 *
 ******************************************************************************/


import java.util.*;
import java.io.*;

public class Bingo
{
	private Random rand = new Random();
	private int[][] card;       //Bingo card configuration
	private int[] stream;       //list of 75 integers
	private boolean[][] marks;  //simulates placing chips on a Bingo card

	public Bingo()
	{
		card   = new int[5][5];
		stream = new int[75];
		marks  = new boolean[5][5];
	}

 /**
   * This method writes a random Bingo card configuration and a stream of random
   * number between 1 and 75 to the output file.
   *
   * The first column in the table contains only integers between 1 and 15,
   * the second column numbers are all between 16 and 30, the third are 31 to 45,
   * the fourth 46-60, and the fifth 61-75.
   *
   * There are no duplicate numbers on a Bingo card.
   */
	public void write(String outputFile)  throws IOException
	{
            int[] b = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
            int[] i = {16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
            int[] n = {31,32,33,34,35,36,37,38,39,40,41,42,43,44,45};
            int[] g = {46,47,48,49,50,51,52,53,54,55,56,57,58,59,60};
            int[] o = {61,62,63,64,65,66,67,68,69,70,71,72,73,74,75};
            int[] stream = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75};
            this.shuffle(b);
            this.shuffle(i);
            this.shuffle(n);
            this.shuffle(g);
            this.shuffle(o);
            this.shuffle(stream);
            for(int x = 0; x < card.length; x++){
                card[x][0] = b[x];
                card[x][1] = i[x];
                card[x][2] = n[x];
                card[x][3] = g[x];
                card[x][4] = o[x];
            }
            card[2][2] = 0;
            System.out.println("");
            for(int x = 0; x < card.length; x++){
                for(int y = 0; y < card[0].length; y++){
                    System.out.print(card[x][y] + " ");
                    if(card[x][y] < 10){
                        System.out.print(" ");
                    }
                }
                System.out.println("");
                
            }
            
            PrintWriter pr = new PrintWriter("file.txt");       
            for(int x = 0; x < card.length; x++){
                for(int y = 0; y < card[0].length; y++){
                    pr.print(card[x][y] + " ");
                    if(card[x][y] < 10){
                        pr.print(" ");
                    }
                }
                pr.println("");
                
            }
            pr.close();
         }

 /**
   *  Shuffles the list of numbers
   */
    public void shuffle(int[] a) {
        int n = a.length;
        Random random = new Random();
        random.nextInt();
        for (int i = 0; i < n; i++) {
            int change = i + random.nextInt(n - i);
            swap(a, i, change);
        }
    }

    private static void swap(int[] a, int i, int change) {
        int helper = a[i];
        a[i] = a[change];
        a[change] = helper;
    }

 /**
   * This method reads a given inputFile that contains a Bingo card configuration and
   * a stream of numbers between 1 and 75.
   * .
   * A Bingo card configuration is stored in the card array.
   * A list of 75 integers is stored in the stream array.
   */
   public void read(String inputFile) throws IOException
   {
		throw new RuntimeException ("You need to implement this method");
	}


 /**
   * This method returns the first integer from the stream array that
   * gives you the earliest winning condition.
   *
   * - all the spots in a column are marked
   * - all the spots in a row are marked
   * - all the spots in either of the two diagonals are marked
   * - all four corner squares are marked
   */
   public int playGame()
   {
       
       /*
        {1},{0},{0},{0},{0}
        {0},{1},{0},{0},{0}
        {0},{0},{1},{0},{0}
        {0},{0},{0},{1},{0}
        {0},{0},{0},{0},{1}
        
       
        {0},{0},{0},{0},{0}
        {0},{0},{0},{0},{0}
        {0},{0},{1},{0},{0}
        {0},{0},{0},{0},{0}
        {0},{0},{0},{0},{0}
       
       
       
       
       */
       
		throw new RuntimeException ("You need to implement this method");
   }
}


