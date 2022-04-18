import java.io.*;
import java.util.*;

public class Main {

  public static ArrayList<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
    HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
    
    for(int i=0;i<26;i++)
    {
        map.put((char)('a'+i),new ArrayList<>()); // putted all the character
    }
    
    for(String word:words)
    {
        HashSet<Character> Unique = new HashSet<>();
        int mask = 0;
        // we will get mask of the word by this loop
        for(char ch : word.toCharArray()){
           
            int bit = ch-'a';
            mask = mask | ((1<<bit));
        }
         // we will add mask of all the character which are present in that particular word
         for(char ch:word.toCharArray()){
             if(Unique.contains(ch))
            {
                continue;
            }
            
            Unique.add(ch);
            map.get(ch).add(mask);
        }
    }
    
    ArrayList<Integer> res = new ArrayList<>();
    for(String puzzle: puzzles)
    {
        int pmask = 0;
        // we will get mask of the puzzle by this loop
        for(char ch: puzzle.toCharArray()){
            int bit = ch-'a';
            pmask = pmask | ((1<<bit));
        }
        
        char firstCharacter = puzzle.charAt(0);
        ArrayList<Integer> wordToCheck = map.get(firstCharacter);
        int count=0;
        
        for(int wmask : wordToCheck)
        {
            if((wmask & pmask)==wmask)
            {
                count++;
            }
        }
        res.add(count);
    }

    return res;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    String[] words = new String[n];
    for (int i = 0 ; i < words.length; i++) {
      words[i] = scn.next();
    }
    int m = scn.nextInt();
    String[] puzzles = new String[m];
    for (int i = 0 ; i < m ; i++) {
      puzzles[i] = scn.next();
    }
    ArrayList<Integer> ans = findNumOfValidWords(words, puzzles);
    for (int i = 0 ; i < m ; i++) {
      System.out.println(puzzles[i] + " -> " + ans.get(i));
    }
  }

}
