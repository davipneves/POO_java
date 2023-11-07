public class carro {

    String modelo;
    String marca;

    int ano;

    boolean usado;

    int velocidade;

    void acelerar(int aceleracao) {
        velocidade = velocidade + aceleracao;
    }

    void freiar(int freio) {
         velocidade = velocidade - freio;
    }

    void buzinar() {
        System.out.println("BIIIIII");
    }

}