package Elevador;

public class MainElevador {
    public static void main(String[] args) {
        Elevador elevador1 = new Elevador();
        elevador1.pessoasAtualmente = 2;
        elevador1.andarAtual = 0;

        Elevador elevador2 = new Elevador();
        elevador2.pessoasAtualmente = 8;
        elevador2.andarAtual = 9;

        System.out.println("""
                |==============|
                   Elevador 1
                |==============|
                """);
        elevador1.entrar(12);
        elevador1.subir(0);
        elevador1.sair(10);
        System.out.println("");
        elevador1.informar();

        System.out.println("""
                |==============|
                   Elevador 2
                |==============|
                """);

        elevador2.entrar(-90);
        elevador2.descer(10);
        elevador2.sair(-10);
        System.out.println("");
        elevador2.informar();

        System.out.println("""
                |==============|
                   Elevador 1
                |==============|
                """);
        elevador1.entrar(5);
        elevador1.subir(10);
        elevador1.sair(3);
        System.out.println("");
        elevador1.informar();

        System.out.println("""
                |==============|
                   Elevador 2
                |==============|
                """);

        elevador2.entrar(0);
        elevador2.descer(-2);
        elevador2.sair(4);
        System.out.println("");
        elevador2.informar();
    }
}
