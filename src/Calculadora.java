 public class Calculadora {
     // Método de somar e subtrair iserido por Miguel Angelo
    // Método para somar dois números
    public int somar(int a, int b) {
        return a + b;
    }

    // Método para subtrair dois números
    public int subtrair(int a, int b) {
        return a - b;
    }

    // Método para multiplicar dois números
    //Inserido por Maurício Viana

    public int multiplicar(int a, int b) {
        return a * b;
    }
//Metodo para dividir dois numeros
//Inserido por Inacio Menezes

    public double Dividir(int num,int den){
    //verifica se o numerador e menos menor ou igual a zero
    if (den != 0){
        return (double) num/den;
    }else{
    System.out.println("Erro não é permitida nenhuma divisão por 0 ");
    return 0;

    }
}

    public static void main(String[] args) {
        // Exemplo de uso da classe
        Calculadora calculadora = new Calculadora();

        int resultadoSoma = calculadora.somar(5, 3);
        System.out.println("Resultado da soma: " + resultadoSoma);

        int resultadoSubtracao = calculadora.subtrair(10, 4);
        System.out.println("Resultado da subtração: " + resultadoSubtracao);

        int resultadoMultiplicacao = calculadora.multiplicar(2, 6);
        System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);

        double resultadoDivisao = calculadora.Dividir(8,2);
        System.out.println("Resultado da divisão: " + resultadoDivisao);
    }
}
