package studentMajors;

public class StudentsAndMajors {
	private String[] names;
	private String[] majors;
	
	public StudentsAndMajors(String[] _names, String[] _majors) {
		names = _names;
		majors = _majors;
	}
	public String[] getList(){
		String[] sorted = sort(names, majors);
		return sorted;
	}
	public static String[] sort(String[] names, String[] majors) {
		for(int i = 0; i < names.length - 1; ++i) {
			for(int j = 0; j < names.length - 1; ++j) {
				if(names[j].length() < names[j + 1].length()) {
					String temp = names[j];
					names[j] = names[j + 1];
					names[j + 1] = temp;
					
					String temp2 = majors[j];
					majors[j] = majors[j + 1];
					majors[j + 1] = temp2;
				}
			}
		}
		String[] combined = new String[names.length + majors.length];
		
		int countA = 0;
		int countB = 0;
		
		for(int z = 0; z < combined.length; z++) {
			if((z % 2) == 0) {
				combined[z] = names[countA];
				countA += 1;
			}
			else{
				combined[z] = majors[countB];
				countB += 1;
			}
		}
		return combined;
	}
}