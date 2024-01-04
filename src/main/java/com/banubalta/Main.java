package com.banubalta;

import java.util.Random;

public class Main {
    public static void main(String[] args) {


        /*
         5*5 bir matris olusturun ve bu matrisin elemanları 0 - 9 arasında rastgele sayılar olsun.
         bu matrixi ekrana yazdiran ve capraz sayilarin (sol ussten sag assagiya) toplamini yazdiran bir kod yazin
         rastgele sayilar icin Math class'indan Math.random() kullanabilirsiniz :)
         */

            Random rand = new Random();


            int[][] matrix = new int[5][5];
            int toplam = 0;

            for (int satir = 0; satir < 5; satir++) {




                for (int sutun = 0; sutun < 5; sutun++) {
                    matrix[satir][sutun] = rand.nextInt(9);

                    if (satir==sutun){
                        toplam+=matrix[satir][sutun];
                    }

                    System.out.print(matrix[satir][sutun]+" ");


                }
                System.out.println();


            }
            System.out.println("TOPLAM --> "+ toplam);









        }


    }
