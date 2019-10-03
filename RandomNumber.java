import java.util.Random;

public class RandomNumber {
    StopWatch watch;
    Double elapsedTime;

    public static void main (String [] args){
    StopWatch watch;
    Double elapsedTime;

    int n = 100000;

    Integer[] a = new Integer[n];
    Integer[] b = new Integer[n];

    Random r = new Random();

    for(int i=0; i<n; i++){

        a[i] = Math.abs(r.nextInt());
    }

    System.arraycopy(a, 0,b,0, a.length);

    watch = new StopWatch();
    MergeSort.sort(a);
    elapsedTime = watch.elapsedTime();
    System.out.println("Merge Sort is: ");
    System.out.println(elapsedTime);

    watch = new StopWatch();
    QuickSort.sort(b);
    elapsedTime = watch.elapsedTime();
    System.out.println("Quick Sort is: ");
    System.out.println(elapsedTime);

    }

}
