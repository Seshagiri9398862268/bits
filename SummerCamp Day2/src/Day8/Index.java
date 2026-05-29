package Day8;
import java.util.*;
public class Index {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=0; j<t;j++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i<4; i++){
                int Submarks = sc.nextInt();
                list.add(Submarks);
            }int s=0;
            for(int c : list){
                s+=c;
            }
            double avg = (double)s/5;
            System.out.println(avg);
            System.out.println(j+1 + ".stud average is " + avg);
        }
    }
    
}
