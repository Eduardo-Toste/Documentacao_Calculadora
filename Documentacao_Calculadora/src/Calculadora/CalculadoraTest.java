package Calculadora;

public class CalculadoraTest {
    
    public static void main(String[] args) {
        Calculadora calculando = new Calculadora();
        
        // ****************************TESTES SOMA****************************
        System.out.println("TESTES SOMA:");
    
        // TESTE NUMERO 1: SOMA DE INTEIROS
        @Test
        int soma1 = calculando.somar(5, 10);
        System.out.println("TESTE NUMERO 1: " + soma1);
        
        // TESTE NUMERO 2: SOMA COM UM DOIS NUMERO SENDO 0
        @Test
        int soma2 = calculando.somar(2, 0);
        System.out.println("TESTE NUMERO 2: " + soma2);
        
        // TESTE NUMERO 3: SOMA COM NEGATIVO
        @Test
        int soma3 = calculando.somar(-3, -5);
        System.out.println("TESTE NUMERO 4: " + soma3);
        
        
        
        
        
        // ****************************TESTES SUBTRACAO****************************
        System.out.println("\nTESTES SUBTRACAO:");
        
        // TESTE NUMERO 1: SUBTRACAO DE INTEIROS
        @Test
        int subtracao1 = calculando.subtrair(15, 7);
        System.out.println("TESTE NUMERO 1: " + subtracao1);
        
        // TESTE NUMERO 2: SUBTRACAO COM UM DOIS NUMERO SENDO 0
        @Test
        int subtracao2 = calculando.subtrair(8, 0);
        System.out.println("TESTE NUMERO 2: " + subtracao2);
        
        // TESTE NUMERO 3: SUBTRACAO COM NEGATIVO
        @Test
        int subtracao3 = calculando.subtrair(1, -3);
        System.out.println("TESTE NUMERO 3: " + subtracao3);
        
        
        
        
        
        // ****************************TESTES MULTIPLICACAO****************************
        System.out.println("\nTESTES MULTIPLICACAO:");
        
        // TESTE NUMERO 1: MULTIPLICACAO DE INTEIROS
        @Test
        int multiplicacao1 = calculando.multiplicar(3, 4);
        System.out.println("TESTE NUMERO 1: " + multiplicacao1);
        
        // TESTE NUMERO 2: MULTIPLICACAO COM UM DOIS NUMERO SENDO 0
        @Test
        int multiplicacao2 = calculando.multiplicar(6, 0);
        System.out.println("TESTE NUMERO 2: " + multiplicacao2);
        
        // TESTE NUMERO 3: MULTIPLICACAO COM NEGATIVO
        @Test
        int multiplicacao3 = calculando.multiplicar(-2, -2);
        System.out.println("TESTE NUMERO 3: " + multiplicacao3);
        
        
        
        
        
        // ****************************TESTES DIVISAO****************************
        System.out.println("\nTESTES DIVISAO:");
        
        // TESTE NUMERO 1: DIVISAO DE INTEIROS
        @Test
        int divisao1 = calculando.dividir(20, 4);
        System.out.println("TESTE NUMERO 1: " + divisao1);        
        
        // TESTE NUMERO 2: DIVISAO COM UM DOIS NUMERO SENDO 0
        @Test
        int divisao2 = calculando.dividir(8, -2);
        System.out.println("TESTE NUMERO 3: " + divisao2);
        
        // TESTE NUMERO 3: DIVISAO COM 0
        @Test
        int divisao3 = calculando.dividir(6, 0);
        System.out.println("TESTE NUMERO 2: " + divisao3);
    }
}