public class ValidTime {
	
	private int hour = 0;
	private int min = 0;
	private boolean isAm;
	
	
	public ValidTime () {
		hour = 0;
		min = 0;
		}
	
	private static boolean isValid(int x, int y) {
		return ((x >= 0 && x < 24) && (y >= 0 && y < 60));
		}
	
	private void setTime(int newHour, int newMin) {
						
		if (this.isValid(newHour,newMin)) {
			hour = newHour;
			min = newMin;
			if (hour < 12) {
				isAm = true;
				}
			else {
				isAm = false;
				}	
			}
		else {
			System.out.println("Invalid time.");
			}
		}	
	
	
	public static void main (String args[]) {
		
		ValidTime demo = new ValidTime();
		demo.setTime(12, 1);
		System.out.println(demo.isAm);
		demo.setTime(24, 1);
		demo.setTime(11, 59);
		System.out.println(demo.isAm);
		
		
		}
	
	}
