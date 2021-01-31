public class NumeroAletorio {
    public static void main(String[] args){
        /*
        int numeroAleatorio=(int)(Math.random()*2+4);
        System.out.println(numeroAleatorio);
        */
        int max=43;
        int min=0;
        int range=max-min+1;
        int rand=(int)(Math.random()*range)+min;
        System.out.println(rand);
    }
}
