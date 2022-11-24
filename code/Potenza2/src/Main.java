import java.net.StandardSocketOptions;

class Potenza{
    public static void main(String [] args) {
    int numero = 2;
    int potenza =2;

    for (int i = 0; i< 15;i++){
        potenza = numero*potenza;
        System.out.println(potenza);
    }
    int i2 =0;
    potenza=2;
    while (i2<15) {
        potenza = numero * potenza;
        System.out.println(potenza);
        i2++;
    }


    }



}