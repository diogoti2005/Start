
public class Staircase {

    public static void main(String[]args)
    {
        Staircase scan = new Staircase();

        int n = 6;

            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                {
                    if(i >= j)
                    {
                        System.out.print("#");
                    }
                }
                System.out.println();
            }
    }
}
