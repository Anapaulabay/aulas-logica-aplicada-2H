public class Produto {
    //atributos
    private double preco;
    String modelo;

     // Setter
    public void setPreco(double _preco) {
        //if (nivelAcesso == 5) {
        //            this.preco = _preco;
        //        }
        //Metodo cnstrutor
        Produto() {
        }

        //sobrecarga de construtor
        Produto( double preco){
            this.preco = preco;
        }

        //mais uma sobre garga
        Produto(String modelo, double preco){
            this.modelo = modelo;
            this.preco = preco;
        }
    }
}