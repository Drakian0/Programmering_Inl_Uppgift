package Inlämningsuppgift.Del2;

public class Counter {
    boolean on;
    int chars;
    int rows;
    int words;
    String longest;

    public Counter(){
        on = true;
        longest = "";
    }

    public void count(String input){
        String[] split = input.split("\\s+");
        if (input.equals("stop"))
            on = false;
        else{
            rows++;
            chars += input.length();
            words += split.length;
            for (int i = 0; i < split.length; i++) {
                if (split[i].length() > longest.length())
                    longest = split[i];
            }
        }
    }
}
