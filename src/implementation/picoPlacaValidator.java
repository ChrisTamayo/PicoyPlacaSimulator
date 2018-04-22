package implementation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resources;

import util.ResourcesBundleUtils;
import exception.PlateException;

/**
 * author: Christian Tamayo
 * Class that implements plate validator 
 */
public class picoPlacaValidator {

	//Class that defines if a car should or shouldn't be on the road
	public String plateValidator(String plate, String date, String time) throws PlateException{
		String answer = " ";
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			
            Date date2 = formatter.parse(date);
            
            if (date2.getDay() == 1 && (plate.equals(ResourcesBundleUtils.getValue("mo")))||(plate.equals(ResourcesBundleUtils.getValue("mo2")))){
            	if(timeCompare(time,ResourcesBundleUtils.getValue("startTimeMorning"), ResourcesBundleUtils.getValue("endTimeMorning")) == true || timeCompare(time,ResourcesBundleUtils.getValue("startTimeAfternoom"), ResourcesBundleUtils.getValue("endTimeAfternoom")) == true ){
            		answer = ResourcesBundleUtils.getValue("PicoyPlaca");
            	}
            	else{
            		answer = ResourcesBundleUtils.getValue("notPicoyPlaca");
            	}
            } else if (date2.getDay() == 2 && (plate.equals(ResourcesBundleUtils.getValue("tu")))||(plate.equals(ResourcesBundleUtils.getValue("tu2")))){
            	if(timeCompare(time,ResourcesBundleUtils.getValue("startTimeMorning"), ResourcesBundleUtils.getValue("endTimeMorning")) == true || timeCompare(time,ResourcesBundleUtils.getValue("startTimeAfternoom"), ResourcesBundleUtils.getValue("endTimeAfternoom")) == true ){
            		answer = ResourcesBundleUtils.getValue("PicoyPlaca");
            	}
            	else{
            		answer = ResourcesBundleUtils.getValue("notPicoyPlaca");
            	}
            } else if (date2.getDay() == 3 && (plate.equals(ResourcesBundleUtils.getValue("we")))||(plate.equals(ResourcesBundleUtils.getValue("we2")))){
            	if(timeCompare(time,ResourcesBundleUtils.getValue("startTimeMorning"), ResourcesBundleUtils.getValue("endTimeMorning")) == true || timeCompare(time,ResourcesBundleUtils.getValue("startTimeAfternoom"), ResourcesBundleUtils.getValue("endTimeAfternoom")) == true ){
            		answer = ResourcesBundleUtils.getValue("PicoyPlaca");
            	}
            	else{
            		answer = ResourcesBundleUtils.getValue("notPicoyPlaca");
            	}
            } else if (date2.getDay() == 4 && (plate.equals(ResourcesBundleUtils.getValue("th")))||(plate.equals(ResourcesBundleUtils.getValue("th2")))){
            	if(timeCompare(time,ResourcesBundleUtils.getValue("startTimeMorning"), ResourcesBundleUtils.getValue("endTimeMorning")) == true || timeCompare(time,ResourcesBundleUtils.getValue("startTimeAfternoom"), ResourcesBundleUtils.getValue("endTimeAfternoom")) == true ){
            		answer = ResourcesBundleUtils.getValue("PicoyPlaca");
            	}
            	else{
            		answer = ResourcesBundleUtils.getValue("notPicoyPlaca");
            	}
            } else if (date2.getDay() == 5 && (plate.equals(ResourcesBundleUtils.getValue("fr")))||(plate.equals(ResourcesBundleUtils.getValue("fr2")))){
            	if(timeCompare(time,ResourcesBundleUtils.getValue("startTimeMorning"), ResourcesBundleUtils.getValue("endTimeMorning")) == true || timeCompare(time,ResourcesBundleUtils.getValue("startTimeAfternoom"), ResourcesBundleUtils.getValue("endTimeAfternoom")) == true ){
            		answer = ResourcesBundleUtils.getValue("PicoyPlaca");
            	}
            	else{
            		answer = ResourcesBundleUtils.getValue("notPicoyPlaca");
            	}
            }else
            {
        		answer = ResourcesBundleUtils.getValue("notPicoyPlaca");
            }
                       
        } catch (ParseException e) {
            e.printStackTrace();
        }
		
		return answer;
	}	
		public boolean timeCompare(String currentHour, String startHour, String endHour) throws ParseException{
			SimpleDateFormat parser = new SimpleDateFormat("HH:mm");
			Date start = parser.parse(startHour);
			Date end = parser.parse(endHour);

			try {
			    Date userDate = parser.parse(currentHour);
			    if (userDate.after(start) && userDate.before(end)) {
			        return true;
			    }
			    else{
			    	return false;
			    }
			} catch (ParseException e) {
			    System.out.println("Invalid Date was entered");
			}
			return false;
		}


}
