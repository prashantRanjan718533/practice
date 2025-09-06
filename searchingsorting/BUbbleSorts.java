package searchingsorting;

public class BUbbleSorts {
    public static void main(String[] args) {
        int bubblesort [] = {71,11,1,111,333,22};
        for (int i = 0; i <bubblesort.length-1 ; i++) {
            for (int j = 0; j < bubblesort.length-1-i; j++) {
                if (bubblesort[j] > bubblesort[j+1]) {
                    int temp = bubblesort[j];
                    bubblesort[j] = bubblesort[j+1];
                    bubblesort[j+1] = temp;
                }
            }
        }
            for (int k = 0; k <bubblesort.length ; k++) {
                System.out.println(bubblesort[k]);
            }
        }
    }

