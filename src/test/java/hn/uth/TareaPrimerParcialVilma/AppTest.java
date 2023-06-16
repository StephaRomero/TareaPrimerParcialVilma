package hn.uth.TareaPrimerParcialVilma;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest {

	//@Test
    public void testCalcular_Area_CirculoUno() {
        double radio = 5.0;
        double Area = Math.PI * Math.pow(radio, 2);
        double Area_actual = App.calcularAreaCuadrado(radio);
        assertEquals(Area, Area_actual, 0.0001);
    }
    

	private void assertEquals(double area, double area_actual, double d) {
		// TODO Auto-generated method stub
		
	}

    //@Test
    public void testCalcular_RectanUno() {
        double base = 7.0;
        double altura = 2.0;
        double Area = 14.0;
        double Area_actual = App.calcularAreaRectangulo(base, altura);
        assertEquals(Area, Area_actual, 0.0001);
    }
    
    //@Test
    public void testCalcular_RectanDos() {
        double base = 0.0;
        double altura = 6.0;
        double Area = 0.0;
        double Area_actual = App.calcularAreaRectangulo(base, altura);
        assertEquals(Area, Area_actual, 0.0001);
    }
    
    public void testCalcular_TrianUno() {
        double base = 4.0;
        double altura = 4.0;
        double Area = 8.0;
        double Area_actual = App.calcularAreaTriangulo(base, altura);
        assertEquals(Area, Area_actual, 0.0001);
    }
    
    //@Test
    public void testCalcular_TrianDos() {
        double base = 0.0;
        double altura = 0.0;
        double Area = 0.0;
        double Area_actual = App.calcularAreaTriangulo(base, altura);
        assertEquals(Area, Area_actual, 0.0001);
    }
    
    //@Test
    public void testCalcular_TrianTres() {
        double base = 5.0;
        double altura = 5.0;
        double Area = 12.5;
        double Area_actual = App.calcularAreaTriangulo(base, altura);
        assertEquals(Area, Area_actual, 0.0001);
  }
    
  //@Test
    public void testCalcular_CirculoDos() {
        double radio = 0.0;
        double Area = 0.0;
        double Area_actual = App.calcularAreaCirculo(radio);
        assertEquals(Area, Area_actual, 0.0001);
    }

    //@Test
    public void testCalcular_CirculoTres() {
        double radio = -5.0;
        double Area = Math.PI * Math.pow(radio, 2);
        double Area_actual = App.calcularAreaCirculo(radio);
        assertEquals(Area, Area_actual, 0.0001);
    }
   //@Test
    public void testCalcular_CuadraUno() {
        double lado = 6.0;
        double Area = 36.0;
        double Area_actual = App.calcularAreaCuadrado(lado);
        assertEquals(Area, Area_actual, 0.0001);
    }
    
   // @Test
    public void testCalcular_CuadraDos() {
        double lado = 0.0;
        double Area = 0.0;
        double Area_actual = App.calcularAreaCuadrado(lado);
        assertEquals(Area, Area_actual, 0.0001);
    }
    
   // @Test
    public void testCalcular_CuadraTres() {
        double lado = 6.0;
        double Area = 36.0;
        double Area_actual = App.calcularAreaCuadrado(lado);
        assertEquals(Area, Area_actual, 0.0001);
    }
}
