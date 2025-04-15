package principal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestTriangulo {
    
    @Test
    void testGetVazio() {
        //Retorno esperado para a altura e base especificada
        double retornoEsperado = 0;
        //Instancia um objeto da classe Triangulo
        Triangulo triangulo = new Triangulo();
        //Chama a operacao getArea()
        double retornoFeito = triangulo.getArea();
        //Premissa verifica se os valores são iguais
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    @Test
    public void testGetArea() {
        double altura = 3;
        double base = 2;
        //Retorno esperado para a altura e base especificada
        double retornoEsperado = 3;
        //Instancia um objeto da classe Triangulo
        Triangulo triangulo = new Triangulo(base, altura);
        //Chama a operacao getArea()
        double retornoFeito = triangulo.getArea();
        //Premissa verifica se os valores são iguais
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
}
