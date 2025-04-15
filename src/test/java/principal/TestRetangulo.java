package principal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestRetangulo {
    
    @Test
    void testGetVazio() {
        //Retorno esperado para a altura e base especificada
        double retornoEsperado = 0;
        //Instancia um objeto da classe Triangulo
        Retangulo retangulo = new Retangulo();
        //Chama a operacao getArea()
        double retornoFeito = retangulo.getArea();
        //Premissa verifica se os valores são iguais
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    @Test
    public void testgetArea() {
        double altura = 3;
        double base = 2;
        //Retorno esperado para a altura e base especificada
        double retornoEsperado = 6;
        //Instancia um objeto da classe Triangulo
        Retangulo retangulo = new Retangulo(base, altura);
        //Chama a operacao getArea()
        double retornoFeito = retangulo.getArea();
        //Premissa verifica se os valores são iguais
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
}
