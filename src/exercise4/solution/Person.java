package exercise4.solution;

import java.util.Set;

import exercise4.solution.Course;

public class Person {

	private Set courses;

	public Set getCourses() {
		return courses;
	}

	public void setCourses(Set arg) {
		courses = arg;
	}

	public void addCourse(Course course) {  //crete addCourse method to incapsulate
		this.courses.add(course);
	}

	public void removeCourse(Course course){ //create removeCourse method to incapsulate
		this.courses.remove(course);
	}
}
