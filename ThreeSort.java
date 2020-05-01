
// Sort three integers using Math.min() and Math.max()
public class ThreeSort {

    public static void main(String[] ksargs){

        String[] args = new String[3];
        args[0] = "8";
        args[1] = "5";
        args[2] = "11";

        int x = 0,y=0,z = 0, min, mid, max;
        try{

            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
            z = Integer.parseInt(args[2]);

        }catch(Exception ex){

            ex.printStackTrace();

        }

        max = Math.max(Math.max(x,y),z);
        min = Math.min(Math.min(x,y),z);
        mid = (x > min && x < max) ? x : ((y > min && y < max)? y :z);

        System.out.println(min + "," + mid + "," + max);

    }

}