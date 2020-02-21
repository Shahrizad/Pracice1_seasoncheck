package com.Turpan.Java;

public class nested4loop {

    public static void main(String[] args) {


        int[][] nums={{0,0,0},{1,1,1},{2,2,2}};


        for (int i=0; i<nums.length;i++){

            for (int j=0;j<nums[i].length;j++){

                System.out.print(nums[i][j]+" ");

            }
            System.out.println();
        }



        int[] num={0,1,2};

        for (int i=0;i<num.length;i++){

            System.out.println(num[i]);
        }




    }
}
