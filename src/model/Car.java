package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import util.ResourcesBundleUtils;

import exception.PlateException;

/**
 * author: Christian Tamayo
 * Class that defines the methos and attributes from a car 
 */

public class Car {
	
	private String plate;
	private boolean validator;
	
	//Constructors
	public Car(){
		
	}
	public Car(String plate){
		setPlate(plate);
	}
	
	//Getters and Setters 
	
	public void setPlate(String plate){		
		this.plate = plate.substring(plate.length() - 1);
		
	}
	
	public String getPlate(){
		return plate;
	}
	
	public void setValidator(boolean validator){
		this.validator = validator;
	}
	
	public boolean getValidator(){
		return validator;
	}
	
	//Class that validates input plate format
	public void plateFormatValidator(String plate) throws PlateException{
		if(plate.length()< 1){
			throw new PlateException("You must be enter a plate");
		}else if(plate.length()>0 && !plate.contains("-")){
			throw new PlateException("Plate format must be \"AAA-DDDD\"");
		}
		
	}
}
