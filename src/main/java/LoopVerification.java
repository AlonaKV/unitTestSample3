
public class LoopVerification {


    public int[] CrazzyLoop(){

        int y = 1;
        int k;

        for (k = 6; k >= 3; k--)
            y = y + k;

        int[] arr = new int[2];
        arr[0] = y;
        arr[1] = k;
        return arr;
    }
}

