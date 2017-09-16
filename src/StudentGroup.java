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
	private ArrayList<Student> std;
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
        public void conArraytoArlist()
         {
          std=new ArrayList<Student>(Arrays.asList(this.students));
         }
        
		public void conArlisttoArray()
         {
          this.students= new Student[std.size()];
          this.students=std.toArray(this.students);
         }
	    
		
		public StudentGroup(int length) {
		this.students = new Student[length];
	    }

	@Override
	    public Student[] getStudents() {
		return this.students;
	    }

	@Override
	    public void setStudents(Student[] students) {
		try{
         this.students=students;
        }
          	catch(IllegalArgumentException ex)
                   {
                   System.out.println(ex);
                   }
	    }

	@Override
	    public Student getStudent(int index) {
		 try{
	
                return this.students[index];
		    }
                  catch(IllegalArgumentException ex)
                   {
                   System.out.println(ex);
                   }
				   finally{return this.students[index];}
	    }

	@Override
	    public void setStudent(Student student, int index) {
		 try{
	
                conArraytoArlist();
                 std.set(index,student);
                conArlisttoArray();
		    }
                  catch(IllegalArgumentException ex)
                   {
                   System.out.println(ex);
                   }
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
              try{
                conArraytoArlist();
                 int x=std.indexOf(student);
                 std.subList(x,std.size()).clear();
                conArlisttoArray();
		         }
                  catch(IllegalArgumentException ex)
                   {
                   System.out.println(ex);
                   }
		
	    }

	@Override
	    public void removeToIndex(int index) {
		 try{
                conArraytoArlist();
                std.subList(0,index-1).clear();
                conArlisttoArray();
		    }
                  catch(IllegalArgumentException ex)
                   {
                   System.out.println(ex);
                   }
	    }

	@Override
	    public void removeToElement(Student student) {
		 try{
                conArraytoArlist();
                int x= std.indexOf(student);
                std.subList(0,x).clear();
                conArlisttoArray();
		    }
                  catch(IllegalArgumentException ex)
                   {
                   System.out.println(ex);
                   }
	    }

	@Override
	    public void bubbleSort() {System.out.println("hello");
		
	    }

	@Override
	    public Student[] getByBirthDate(Date date) {
			
                ArrayList<Student> ast = new ArrayList<Student>();
				try{
		        conArraytoArlist();
				for(int i=0;i<=std.size();i++)
 		        {
		        Date d=(std.get(i)).getBirthDate();
		        if(d.compareTo(date)<=0)
		         {   
                 ast.add(std.get(i));
		         }
		        }
		        

				   }
				catch(IllegalArgumentException ex)
                   {
                   System.out.println(ex);
                   }
				   finally{
					   Student[] sss= new Student[ast.size()];sss=std.toArray(sss);
		               return sss;
					      }
	    } 

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
	            ArrayList<Student> ast = new ArrayList<Student>();
				try{
		        conArraytoArlist();
			    for(int i=0;i<=std.size();i++)
 		        {
		        Date d=(std.get(i)).getBirthDate();
		        if(d.compareTo(firstDate)>=0 && d.compareTo(lastDate)<=0)
		         {   
                 ast.add(std.get(i));
		         }
		        }
		        
				  }
				catch(IllegalArgumentException ex)
                   {
                   System.out.println(ex);
                   }
				   finally{
					   Student[] sss= new Student[ast.size()];
                       sss=std.toArray(sss);
		               return sss;
				   }
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days){	System.out.println("hello");return null;	
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {System.out.println("hello");return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {  
				ArrayList<Student> ast = new ArrayList<Student>();   
				try{
		        conArraytoArlist();
                double sum=0;
                for(int i=0;i<=std.size();i++)
 		        {
		        sum= sum + std.get(i).getAvgMark();
		        }
		        double avg=sum/std.size();
		        for(int i=0;i<=std.size();i++)
		         {
		         if(students[i].getAvgMark()==avg)
		         {ast.add(std.get(i));}
		         }
		        
				}
				catch(IllegalArgumentException ex)
                   {
                   System.out.println(ex);
                   }   
				   finally{
					Student[] sss= new Student[ast.size()];
                    sss=std.toArray(sss);
		            return sss;
					      }
				   
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark(){
				   
				   
				   try{
		           conArraytoArlist();
				   ArrayList<Student> ast = new ArrayList<Student>();
                   double sum=0;
                   for(int i=0;i<=std.size();i++)
 		           {
		           sum=sum+std.get(i).getAvgMark();
		           }
		           double avg=sum/std.size();
		           for(int i=0;i<=std.size();i++)
		           {
		           if(students[i].getAvgMark()==avg)
		           {ast.add(std.get(i));}
		           }
		           Student[] sss= new Student[ast.size()];
                   sss=std.toArray(sss);return sss;
				      }
				catch(IllegalArgumentException ex)
                   {
                   System.out.println(ex);
                   }   
                                  finally{return null;}
	}

	
	public Student getNextStudent(Student student) {
		 int x=0;
		 try{
		
            conArraytoArlist();
            x=std.indexOf(student);
		    x++;
		    std.get(x++);
            conArlisttoArray();
		    return std.get(x++);
		    }
                  catch(IllegalArgumentException ex)
                   {
                   System.out.println(ex);
                   }   
				   finally{return std.get(x++);}
	}
  }
