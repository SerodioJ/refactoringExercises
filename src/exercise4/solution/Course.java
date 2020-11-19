package exercise4.solution;

public class Course {

	private String name; //create class atributes
	private boolean isAdvanced; //create class atributes

	public Course(String name, boolean isAdvanced) { //create constructor
		this.name = name;
		this.isAdvanced = isAdvanced;
	}

	public boolean isAdvanced() {
		return this.isAdvanced; //return if the course is advanced
	}
}
