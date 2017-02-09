import java.util.Scanner;

/**
 * Created by vishalkulkarni on 2/8/17.
 */
public class FindTheMinArraySum {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i < N; i++)
        {
            arr[i]= sc.nextInt();
        }
        int prev = arr[0];
        int sum = arr[0];

        for(int i = 1; i <N; i++)
        {

            int curr = arr[i];

            System.out.println("prev"+prev);
            //System.out.println("curr"+curr);

            if(prev >= curr)
            {
                sum+= (prev+1);
                prev++;
            }
            else{
                sum+=curr;
                prev=curr;
            }

        }
        System.out.println(sum);

    }

}
