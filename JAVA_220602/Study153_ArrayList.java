package study0602;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Study153_ArrayList 
{
    public static void main(String[] args) 
    {
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        pitches.sort(Comparator.naturalOrder());  // ������������ ����
        System.out.println(pitches);  // [129, 138, 142] ���
        
        ArrayList<String> songs = new ArrayList<>(Arrays.asList("������ϳ���", "ũ����", "�����ٶ�"));
        songs.sort(Comparator.naturalOrder());  // ������������ ����
        System.out.println(songs);  // [129, 138, 142] ���
    }
}
