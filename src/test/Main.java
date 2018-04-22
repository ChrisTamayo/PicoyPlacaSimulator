package test;

import java.text.ParseException;

import javax.swing.JOptionPane;

import com.toedter.calendar.JDateChooser;

import exception.PlateException;
import model.Car;
import implementation.picoPlacaValidator;
public class Main {

	/**
	 * @param args
	 * @throws PlateException 
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws PlateException, ParseException {
		Car cr = new Car();
		picoPlacaValidator vl = new picoPlacaValidator();
		String plate = "";
		String time="";
		String date = "";
		String result;
		JDateChooser jd = new JDateChooser();
		plate = JOptionPane.showInputDialog(null, "Please, fill the plate field (Format: AAA-0000)", null);
		cr.setPlate(plate);		
		String message ="Pick a date:\n";
		date = JOptionPane.showInputDialog(null, "fill date field (Format: DD/MM/YYYY)", null);
		time = JOptionPane.showInputDialog(null, "fill hour field (Format: HH:MM 24hrs)", null);
	
		result = vl.plateValidator(cr.getPlate(),date, time);
		if(result != null){
			JOptionPane.showMessageDialog(null,result);
	}
	}
}
