public class Main {
    public static void main(String[] args) {
        //Aula introdutória de Orientação à Objetos{
        //declaracao do objeto
        Pessoa adao;
        //instanciaçao do objeto
        adao = new Pessoa();
        // ao mesmo tempo
        Pessoa qualquer = new Pessoa();
        // definir o formato do objeto
         qualquer.nome = "Rita";
         qualquer.sobrenome = "lee";
         qualquer.falar();
        System.out.println(qualquer.falar("oi"));



    }
}