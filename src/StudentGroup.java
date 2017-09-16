import java.util.*;





//StudentGroup class
/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
     
	    
		
		public StudentGroup(int length) {
		this.students = new Student[length];
	    }

	@Override
	    public Student[] getStudents() {
		return this.students;
	    }

	@Override
	    public void setStudents(Student[] students) {
		int x=0;
	    }

	@Override
	    public Student getStudent(int index) {
		 return null;
	    }

	@Override
	    public void setStudent(Student student, int index) {
		int x=0;
	    }

	@Override
	    public void addFirst(Student student) {
		int x=0;
	    }

	@Override
	    public void addLast(Student student) {
		int x=0;
	    } 

	@Override
	    public void add(Student student, int index) {
		 int x=0;
	    }

	@Override
	    public void remove(int index) {
		int x=0; 
	    }

	@Override
	    public void remove(Student student) {
		int x=0;
	    }

	@Override
	    public void removeFromIndex(int index) {

	    }

	@Override
	    public void removeFromElement(Student student) {
              int x=0;
		
	    }

	@Override
	    public void removeToIndex(int index) {
		int x=0;
	    }

	@Override
	    public void removeToElement(Student student) {
		int x=9;
	    }

	@Override
	    public void bubbleSort() {System.out.println("hello");
		
	    }

	@Override
	    public Student[] getByBirthDate(Date date) {
			
              return this.students;
	    } 

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
	            return this.students;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days){	System.out.println("hello");return null;	
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {System.out.println("hello");return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {  
				
				return this.students;   
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark(){
				   
		return this.students;		   

	}

	
	public Student getNextStudent(Student student) {
		 int x=0;
		 return student;
	}
  }
