public class Main {
    public static void main(String[] args) {

        //criar Produto
        Produto p1 = new Produto(1300.00);
        Produto p2 = new Produto();
        //p2.preco = 2330.00;
        p2.setPreco(233.00);
        Produto p3;
        p3 = new Produto("Placa video", 1300.00);
        p3 = new Produto("Placa mae", 2500.00);

        p2.setPreco(1.00);

    }
}