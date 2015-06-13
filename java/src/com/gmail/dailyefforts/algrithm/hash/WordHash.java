package com.gmail.dailyefforts.algrithm.hash;

class Word {
    public static final int SIZE = 26;

    private final char[] a;

    public Word(char first, char second, char third) {
        a = new char[3];
        a[0] = Character.toLowerCase(first);
        a[1] = Character.toLowerCase(second);
        a[2] = Character.toLowerCase(third);
    }

    @Override
    public int hashCode() {
        return SIZE * SIZE * (a[0] - 'a') + SIZE * (a[1] - 'a') + (a[2] - 'a');
    }
}

class Dic {
    private final String[] dec = new String[Word.SIZE * Word.SIZE * Word.SIZE];

    public void put(Word word, String meaning) {
        dec[word.hashCode()] = meaning;
    }

    public String lookUp(Word word) {
        return dec[word.hashCode()];
    }
}


public class WordHash {
    public static void main(String[] args) {
        Dic dic = new Dic();
        Word word = new Word('c', 'p', 'p');
        dic.put(word, "a kind of programming language");
        System.out.println(dic.lookUp(word));
    }
}
