package test;

import static org.junit.Assert.*;
import implementation.picoPlacaValidator;

import model.Car;

import org.junit.Test;

import exception.PlateException;

public class OnPicoyPlacaTestCases {

	@Test
	public void picoyPlacaAfternoom() throws PlateException{
		String resultado;
		String esperado;
		Car cr = new Car();
		picoPlacaValidator vr = new picoPlacaValidator();
		cr.setPlate("AAC-0125");
		resultado = vr.plateValidator(cr.getPlate(), "25/04/2018", "17:30");
		esperado = "The car should not be on the road";
		assertEquals(resultado,esperado.toString());
	}
	
	@Test
	public void picoyPlacaMorning() throws PlateException{
		String resultado;
		String esperado;
		Car cr = new Car();
		picoPlacaValidator vr = new picoPlacaValidator();
		cr.setPlate("AAC-0125");
		resultado = vr.plateValidator(cr.getPlate(), "25/04/2018", "08:30");
		esperado = "The car should not be on the road";
		assertEquals(resultado,esperado.toString());
	}

	@Test 
	public void notPicoyPlaca() throws PlateException{
		String resultado;
		String esperado;
		Car cr = new Car();
		picoPlacaValidator vr = new picoPlacaValidator();
		cr.setPlate("AAC-0125");
		resultado = vr.plateValidator(cr.getPlate(), "25/04/2018", "15:55");
		esperado = "The car should be on the road";
		assertEquals(resultado,esperado.toString());
		
	}
	@Test 
	public void notPicoyPlaca2() throws PlateException{
		String resultado;
		String esperado;
		Car cr = new Car();
		picoPlacaValidator vr = new picoPlacaValidator();
		cr.setPlate("AAC-0111");
		resultado = vr.plateValidator(cr.getPlate(), "25/04/2018", "12:10");
		esperado = "The car should be on the road";
		assertEquals(resultado,esperado.toString());
		
	}
	@Test 
	public void notPicoyPlaca3() throws PlateException{
		String resultado;
		String esperado;
		Car cr = new Car();
		picoPlacaValidator vr = new picoPlacaValidator();
		cr.setPlate("CCC-0777");
		resultado = vr.plateValidator(cr.getPlate(), "01/02/2015", "10:10");
		esperado = "The car should be on the road";
		assertEquals(resultado,esperado.toString());
		
	}
}
