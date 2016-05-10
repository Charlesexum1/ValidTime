public class ValidTime {
	
	private int hour, min;
	private String time12, time24;
	
	private static boolean isValid(int x, int y) {
		return ((x >= 0 && x < 24) && (y >= 0 && y < 60));
		}
	
	public ValidTime() {}
	
	public ValidTime(int newHour, int newMin) {
		
		if (isValid(newHour, newMin)) {
			hour = newHour;
			min = newMin;			
			}
		else {
			System.out.println("Invalid time...");
			System.exit(0);
			}		
		}
		
	public void setTime24() {
		time24 = hour + "" + min;
		if (min < 10) {
			time24 = hour + "0" + min;
			}
		if (hour < 10) {
			time24 = "0" + hour + "" + min;
			}
		if ((min < 10)&&(hour < 10)) {
			time24 = "0" + hour + "0" + min;
			}					
		}
	public String getTime24() {
		return time24;
		}
	public void setTime12() {
		if (hour < 12) {
			time12 = hour + ":" + min + " am";
			}
			if (hour < 10) {
				time12 = "0" + hour + ":" + min + " am";
				}
			if (min < 10) {
				time12 = hour + ":" + "0" + min + " am";
				}
			if ((hour < 10)&&(min < 10)) {
				time12 = "0" + hour + ":" + "0" + min + " am";
				}	
		if (hour >= 12) {
			time12 = hour + ":" + min + " pm";
			if (min < 10) {
				time12 = hour + ":" + "0" + min + " pm";
				}
			if (hour > 12) {
				hour -= 12;
				if (min < 10) {
					time12 =  hour + ":" + "0" + min + " pm";
					}					
				else {
					time12 = hour + ":" + min + " pm";
					}				
				}
			hour += 12;					
			}	
		}
	public String getTime12() {
		return time12;
		}							
	
	public static void main (String args[]) {		
		ValidTime demo = new ValidTime(9,1);
		demo.setTime24();
		System.out.println(demo.getTime24());
		ValidTime demo2 = new ValidTime(13, 1);
		demo2.setTime12();
		System.out.println(demo2.getTime12());
		
		
		}
	
	}

