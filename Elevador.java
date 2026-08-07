package Elevador;

public class Elevador {
    int quantidadeMaxPessoas = 8;
    int pessoasAtualmente;
    int andarMin = -2;
    int andarMax = 10;
    int andarAtual;

    void subir(int subindo) {
        if (subindo <= this.andarMax && subindo > this.andarAtual) {
            System.out.printf("Subindo para o andar %d\n", subindo);
            this.andarAtual = subindo;
        } else {
            System.out.printf("Esse andar não existe, o andar mais alto é o %d\n", this.andarMax);
        }
    }

    void descer(int descendo) {
        if (descendo >= this.andarMin && descendo < this.andarAtual) {
            System.out.printf("Descendo para o andar %d\n", descendo);
            this.andarAtual = descendo;
        } else {
            System.out.printf("Esse andar não existe, o andar mais baixo é o %d\n", this.andarMin);
        }
    }

    void entrar(int entrando) {
        if (entrando > 0 && quantidadeMaxPessoas >= pessoasAtualmente + entrando) {
            System.out.println("Verifique se o elevador está no andar e entre.");
            this.pessoasAtualmente += entrando;
        } else {
            System.out.printf("Não tem como entrar essa quantidade de pessoas, os valores atuais são %d e a capacidade máxima é %d.\n", this.pessoasAtualmente, this.quantidadeMaxPessoas);
        }
    }

    void sair(int saindo) {
        if (saindo <= pessoasAtualmente && saindo > 0) {
            System.out.println("Verifique se o elevador está no andar e saia.");
            this.pessoasAtualmente -= saindo;
        } else {
            System.out.printf("Não tem como sair essa quantidade de pessoas, os valores atuais são: %d\n", this.pessoasAtualmente);
        }
    }

    void informar() {
        System.out.printf("""
                O andar atual é %d.
                A quantidade de pessoas atualmente é de %d.
                """, this.andarAtual, this.pessoasAtualmente);
    }
}