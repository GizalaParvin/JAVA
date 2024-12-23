public class Star {
    public static void main(String[] args) {
        // int i,j;
        // for (i=0;i<5;i++){
        //     for(j =0;j<=i;j++){
        //         System.out.println("*");

        //     }
        //             System.out.println();
        // }
        int []a = {25,6,20,16,18,19,36,40,2,8,6};
        for(int i =0;i<10;i++){
        for(int j = i+1;j<10;j++){
            if(a[i] ==a[j]){
                System.out.println("the value of index is:"+a[i] +"is" + i +j);
                break;
            }
        }
        }




    }
    
}
