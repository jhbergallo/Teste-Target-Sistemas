public class Cinco {
    public static void main(String args[]){
        String palavra = "segundo";
        String[] separar = palavra.split("");
        int tam = separar.length;
        for(int i = 0; i <= tam; i++){
            for(int j = tam; j >= i; j--){
                System.out.print(separar[j-1]);
            }
        }
    }
}
