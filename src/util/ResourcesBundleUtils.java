package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ResourcesBundleUtils {
	
	protected static Properties props = null;
	
	/**
	 * Get the values from resources.properties file
	 */
	public static String getValue(String key){
		String valor = "";
		try {
			if(props == null)
			{
				Class<ResourcesBundleUtils> varAppClass = ResourcesBundleUtils.class;
				ClassLoader classLoader = varAppClass.getClassLoader();
				InputStream inputStream = classLoader.getResourceAsStream("resources/ResourcesApp.properties");
				props = new Properties();
				props.load(inputStream);
			}
			
			valor = props.getProperty(key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return valor;
	}

}
