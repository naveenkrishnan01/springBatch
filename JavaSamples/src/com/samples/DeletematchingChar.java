package com.samples;

public class DeletematchingChar {

    public void deleteMatcHINGchar(String [] arr, int n){

        for (int i=0; i<=n; i++){
               String test = arr[i];
               int count = 0;
            for (int j=0; j<=test.length()-1; j++) {
                if (arr[j] == arr[j + i]) {
                    count ++;
                    System.out.println("Delete the character" + count );
                }
            }
        }
    }

    public static void main(String[] args) {
        String [] k = {"AAAAA", "BBBB", "ABABABABABABA", "BABA", "AAABBB"};
        DeletematchingChar x = new DeletematchingChar();
        x.deleteMatcHINGchar(k,4);

    }

}
