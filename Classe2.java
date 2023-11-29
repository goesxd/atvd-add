public class Classe2 {

    public int multiplicar(int a, int b) {
        ClasseBase instanciaClasseBase = new ClasseBase();
        instanciaClasseBase.metodo1();

        return a * b;
    }

    public boolean ehPar(int numero) {
        ClasseBase instanciaClasseBase = new ClasseBase();
        int resultado = instanciaClasseBase.metodo2(4, 7);

        return numero % resultado == 0;
    }

    public static void main(String[] args) {
        Classe2 instanciaClasse2 = new Classe2();

        int resultadoMultiplicacao = instanciaClasse2.multiplicar(4, 7);
        System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);

        int numeroParaVerificar = 10;
        boolean resultadoParidade = instanciaClasse2.ehPar(numeroParaVerificar);
        System.out.println("O número " + numeroParaVerificar + " é par? " + resultadoParidade);
    }
}
