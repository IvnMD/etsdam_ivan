package com.a2.src.test.java.com.a2;


    @Test
    void testMediaConDecimales() {
        // [10, 9, 8, 7] → media = 8.5
        assertEquals(8.5, CalculadoraNotas.calcularMedia(new int[]{10, 9, 8, 7}));
    }
 
    @Test
    void testMediaUnaSolaNota() {
        // Una sola nota → la media es la propia nota
        assertEquals(5.0, CalculadoraNotas.calcularMedia(new int[]{5}));
    }
 
    @Test
    void testListaVacia() {
        assertThrows(IllegalArgumentException.class,
                () -> CalculadoraNotas.calcularMedia(new int[]{}));
    }
 
    @Test
    void testNotaFueraDeRango() {
        assertThrows(IllegalArgumentException.class,
                () -> CalculadoraNotas.calcularMedia(new int[]{5, 12}));
    }
 
    @Test
    void testNotaNegativa() {
        assertThrows(IllegalArgumentException.class,
                () -> CalculadoraNotas.calcularMedia(new int[]{-1, 5, 8}));
    }
 
    @Test
    void testNotasEnLimitesExtremos() {
        // 0 y 10 son valores válidos → media = 5.0
        assertEquals(5.0, CalculadoraNotas.calcularMedia(new int[]{0, 10}));
    }
}
