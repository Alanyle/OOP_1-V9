//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println(" Input your text: ");
        new Scanner(System.in);
        //String str = "123, abc def. abc";
        Scanner sc1 = new Scanner(System.in);
        String str = sc1.nextLine();
        str = str.toLowerCase();
        int wCount = str.split(" +").length;
        String[] words = str.split("\\W+");
        System.out.printf(" Number of words: %s ", wCount);
        Map<String, Integer> wordCountMap = new HashMap();
        String[] var6 = words;
        int var7 = words.length;

        for(int var8 = 0; var8 < var7; ++var8) {
            String word = var6[var8];
            if (!word.isEmpty()) {
                wordCountMap.put(word, (Integer)wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        System.out.printf("\n Appearances of words: \n");
        Iterator var10 = wordCountMap.entrySet().iterator();

        while(var10.hasNext()) {
            Map.Entry<String, Integer> entry = (Map.Entry)var10.next();
            PrintStream var10000 = System.out;
            String var10001 = (String)entry.getKey();
            var10000.println(var10001 + " : " + String.valueOf(entry.getValue()));
        }

    }
}
