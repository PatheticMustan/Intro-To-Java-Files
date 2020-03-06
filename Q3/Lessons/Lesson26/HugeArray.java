public class HugeArray { 
    public static void main(String[] args) { 
        int N = 1000;
        int[] a = new int[N*N*N*N];
        System.out.println(a.length);
    }
}

// N*N*N*N is just too chonkers for java's small int type, it goes so far into positivity it starts being negative.
// What a mood killer, amirite?