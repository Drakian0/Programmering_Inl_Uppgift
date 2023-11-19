package Inlämningsuppgift.Del2;

public class Counter {
    private boolean on;
    private int chars;
    private int rows;
    private int words;
    private String longest;

    public Counter(){
        chars = 0;
        rows = 0;
        words = 0;
        on = true;
        longest = "";
    }

    public void count(String input){
        String[] split = input.split("\\s+");
        for (String check : split){
            if(check.equals("stop"))
                on = false;
            else{
                chars += check.length();
                words ++;
                if (check.length() > longest.length())
                   longest = check;
            }
        }
        rows++;
    }

    public int getChars() {
        return chars;
    }

    public int getRows() {
        return rows;
    }

    public int getWords() {
        return words;
    }

    public String getLongest() {
        return longest;
    }

    public boolean isOn() {
        return on;
    }
}
