package exercise4.solution;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;

import Person;


public class App {

	public static void main(String[] args) {
		// Client code
		Person kent = new Person();
		Set s = new HashSet();
		s.add(new Course("MC426", false));
		s.add(new Course("MC646", true));
		kent.setCourses(s);
		Assert.assertEquals(2, kent.getCourses().size());
		Course machinelearning = new Course("MC886", true);
		kent.addCourse(machinelearning); //delegate the responsability to add courses to the person class
		kent.addCourse(new Course("MC536", false)); //delegate the responsability to add courses to the person class
		Assert.assertEquals(4, kent.getCourses().size());
		kent.removeCourse(machinelearning); //delegate the responsability to remove classes to the person class
		Assert.assertEquals(3, kent.getCourses().size());

		Iterator iter = kent.getCourses().iterator();
		int count = 0;
		while (iter.hasNext()) {
			Course each = (Course) iter.next();
			if (each.isAdvanced()) {
				count++;
			}
		}
		System.out.print("Advanced courses: " + count);
	}

}