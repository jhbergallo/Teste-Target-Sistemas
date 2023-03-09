public class Dois {
    public static void main(String[] args) throws Exception {
            int num = 3;
            int []fibonacci = new int[30];
            fibonacci[0] = 0;
            fibonacci[1] = 1;
            
            if(num >= 0){
                for (int i = 1; i < fibonacci.length; i++){
                        fibonacci[i + 1] = fibonacci[i] + fibonacci[i - 1];
                } 
            }   
            //faltou checar se o número está dentro, mas ainda não possuo esse conhecimento
        
    }
}
