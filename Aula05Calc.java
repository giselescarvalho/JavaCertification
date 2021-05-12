class Aula05Calc {
   // public int soma (int a, int b){
      public int soma (int... numeros){
          int soma = 0;
          for (int i =0; i< numeros.length;i++){
              soma += numeros[i];
          }
       return soma;
    }
}
class TestaCalc{
    public static void main (String [] args){
        Aula05Calc c = new Aula05Calc();
        System.out.println(c.soma(255,5));

    }
}
