public class sentenciaFor {
    public static void main(String[] args) {

        for(int j = 10; j > 0; j--){
            System.out.println("j = " + j);
        }

        for(int i = 1, j = 10; i < j ; i++, j-- ){
            System.out.println(i +"-" + j);
        }

        for(int i = 0; i < 10; i++){
            if( i % 2 == 0){
                continue;
            }
            System.out.println("i = " + i);

        }
    }
}
