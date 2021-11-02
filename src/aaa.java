public class aaa {
    public static void main(String[] args) {
        int[] matriz = {3, 2, 5, 5, 5};

        int result = canBeSplitted(matriz);
        System.out.println("result = " + result);

    }

    public static int canBeSplitted(int matriz[]){
        int suma = 0;
        int suma2 = 0;
        int position = 1;
        int result = 10;
        if(matriz.length == 0) {
            result = 0;
        }
        do{
            for (int i = 0; i < position; i++) {
                suma += matriz[i];
                //System.out.println("suma1 = " + suma);
            }
            for (int j = position; j < matriz.length; j++) {
                suma2 += matriz[j];
                //System.out.println("suma2 = " + suma2);
            }
            if(suma != suma2){
                position += 1;
            }
            if (position == matriz.length ){
                break;
            }
            if (suma == suma2) {
                result = 1;
                break;
            }else{
                suma = 0;
                suma2 = 0;
            }
            result = -1;
        }while(true);
        return result;
    }
}
