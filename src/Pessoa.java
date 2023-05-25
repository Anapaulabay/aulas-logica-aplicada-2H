public class Pessoa extends Animal{
    //atributos da classe

    public String sobrenome;
   //metodos da classe
    public void falar(){
        System.out.println("falei");
    }
    public String falar(String texto){
        return texto;
    }

    //sobrescrita do metodo
    public void comer() {
     System.out.println("pessoa comeu");
    }
}
