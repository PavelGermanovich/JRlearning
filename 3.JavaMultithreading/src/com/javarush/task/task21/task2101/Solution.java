package com.javarush.task.task21.task2101;

/* 
Определяем адрес сети
*/
public class Solution {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
        byte[] netAddress = new byte[4];
        for (int i=0; i < 4; i++){
            netAddress[i] = (byte)(ip[i] & mask[i]);
        }


        return netAddress;
    }

    public static void print(byte[] bytes) {
        for(int i=0; i < bytes.length; i++){

            System.out.format("%08d ", Integer.parseInt(Integer.toBinaryString(bytes[i] & 255)));

            /*
            вот наше исходное число в 1 байте
            1	1	0	0	0	0	0	0
            при использовании метода Integer.toBynaryString() исходное число переводится в
            число типа int с представлением числа в бинарной форме и переобразовывается в
            строку. От чего в начале данное число может быть по умолчанию дополнено
            одними единицами и получит вид:
            1	1	1	1	1	1	1	1	1	1	1	1	1	1	1	1	1	1	1	1	1	1	1	1	1	1	0	0	0	0	0	0
            поэтому нам и приходиться применять операцию побитового и с числом 255, которое имеет вид:
            0	0	0	0	0	0	0	0	0	0	0	0	0	0	0	0	0	0	0	0	0	0	0	0	1	1	1	1	1	1	1	1
            что в результате даёт нам число int в виде
            0	0	0	0	0	0	0	0	0	0	0	0	0	0	0	0	0	0	0	0	0	0	0	0	1	1	0	0	0	0	0	0
            которое и есть наше исходное число, только типа Int
            затем мы переводим данное число к типу Integer  и при помощи printf выводим его на экран
            Незабываем его дополнить нулями до нужной нам длины.

             */
        }
        System.out.println();
    }
}
