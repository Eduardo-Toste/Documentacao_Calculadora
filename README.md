# Documentação Calculadora
## Versão 1.05

## Descrição do Projeto
Projeto utilizado completamente para realizar a documentação da calculadora já utilizada anteriormente. Usando então o Javadoc como principal forma de documentação.

## Tecnologias utilizadas
- JUnit 5
- IDE Eclipse
- Javadoc
- JDK 20

## Código Documentado
```
package Calculadora;

/**
 * @author Eduardo Ciochetti
 * @version 1.05
 * @since Release 1.02 da aplicacao
 * 
 * Uma classe simples que realiza operacoes de adicao, subtracao, divisao e multiplicacao
 */
public class Calculadora {
	
	/**
	 * Realiza uma operacao de adicao.
	 * 
	 * @param a O primeiro operando.
	 * @param b O segundo operando.
	 * @return O resultado da adicao.
	 */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza uma operacao de subtracao.
     * 
     * @param a O operando do qual sera subtraido.
     * @param b O operando a ser subtraido.
     * @return O resultado da subtracao.
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza uma operacao de multiplicacao.
     * 
     * @param a O primeiro operando a ser mulitplicado.
     * @param b O segundo operando a ser multiplicado.
     * @return O resultado da multiplicacao.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }
    
    /**
     * Realiza uma operacao de divisao.
     * 
     * @param a O operando do qual sera dividido.
     * @param b O operando a ser dividido.
     * @return O resultado da divisao.
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}
```

## Considerações Finais
O Javadoc em Java oferece benefícios como geração automática de documentação, integração fácil com IDEs, e padrão consistente de marcação. Facilita a compreensão do código, promove colaboração eficiente, e pode ser usado para análise estática. Com a capacidade de gerar páginas HTML, o Javadoc simplifica a criação de documentação online. Em resumo, é uma ferramenta essencial para manter documentação clara e de alta qualidade em projetos Java.
