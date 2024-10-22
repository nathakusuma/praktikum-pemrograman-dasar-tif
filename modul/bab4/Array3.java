// Terdapat pelanggaran konvensi

public class Array3{
    public static void main(String args[]) {
        int a[] = {2,7,6,8,1};
        int b[] = {3,4,2,8,9,7,2,7,5};
        int pjg;
        pjg = Math.max(a.length, b.length);
        int c[] = new int[pjg];
        for (int i = 0; i < pjg; i++) {
            if (a.length < i + 1)
                c[i] = b[i];
            else if (b.length < i + 1)
                c[i] = a[i];
            else
                c[i] = a[i] + b[i];
            System.out.print(c[i] + " ");
        }
    }
}
