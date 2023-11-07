public class carroTestar {

    public static void main(String[] args) {

        carro mustang = new carro();

        mustang.marca = "ford";
        mustang.modelo = "shelby GT";
        mustang.ano = 2019;
        mustang.usado = false;
        mustang.velocidade = 100;

        mustang.acelerar(50);
        System.out.println("A velocidade é "+mustang.velocidade+"Km/h após acelerar");
        mustang.freiar(40);
        System.out.println("A velocidade é "+mustang.velocidade+" Km/h após reduzir");

    }
}