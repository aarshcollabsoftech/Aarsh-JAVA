public class Arrays {
public static void main(String[] args) {
   
    // int [] marks  = {100,70,80,90,58};
    // System.out.println(marks.length);  
    
    // For Loop

    // for(int i=0;i<marks.length;i++){
    //     System.out.println(marks[i]);
    // }  
    

    // For Each 

    // for (int i : marks) {
    //     System.out.println(i);
    // }
 
        int [][] flats;

        flats  = new int [2][3];
        flats[0][0] =101;
        flats[0][1] =102;
        flats[0][2] =103;
        flats[1][0] =201;
        flats[1][1] =202;
        flats[1][2] =203;

        for (int[] floor : flats) {
            for (int flat : floor) {
                System.out.print(flat);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
