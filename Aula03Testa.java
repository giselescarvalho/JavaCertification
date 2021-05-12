class Aula03Testa {
        public static void main (String args[]){
        Aula03Carro a = new Aula03Carro();
        a.modelo = "JLR";
        a.setModelo("JLR 2");
        System.out.println(a.getDadosImpr());
        System.out.println(a.ano);
        System.out.println(a.modelo.length());
    }

}
