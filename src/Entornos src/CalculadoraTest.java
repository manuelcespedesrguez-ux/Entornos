public class CalculadoraTest {
    @Test
    void testSumar() {
        Calculadora c = new Calculadora();
        assertEquals(4, c.sumar(2, 2));
    }

    private void assertEquals(int i, int sumar) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }
}
