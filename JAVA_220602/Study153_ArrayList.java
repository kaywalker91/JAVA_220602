package study0602;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Study153_ArrayList 
{
    public static void main(String[] args) 
    {
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        pitches.sort(Comparator.naturalOrder());  // 오름차순으로 정렬
        System.out.println(pitches);  // [129, 138, 142] 출력
        
        ArrayList<String> songs = new ArrayList<>(Arrays.asList("사랑은하나다", "크러쉬", "가나다라"));
        songs.sort(Comparator.naturalOrder());  // 오름차순으로 정렬
        System.out.println(songs);  // [129, 138, 142] 출력
    }
}
