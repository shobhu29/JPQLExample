import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MainApp {

	
	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "details" );
	      EntityManager entitymanager = emfactory.createEntityManager();

	      System.out.println("Query 1\n");
	      
	      Query query1 = entitymanager.createQuery("Select e.emp_name from Employee e");
	      @SuppressWarnings("unchecked")
		List<String> list1 = (List<String>)query1.getResultList();

	      for(String e:list1) {
	         System.out.println("Employee NAME :"+e);
	      }
	      
	      
	      System.out.println("Query 2\n");

	      Query query2 = entitymanager.createQuery("Select e from Employee e");
	      
	      @SuppressWarnings("unchecked")
		List<Employee> list2 = (List<Employee>)query2.getResultList();

	      for(Employee e:list2) {
	         System.out.println("Employee NAME :"+e);
	      }
	      
	      System.out.println("Query 3\n");

	      Query query3 = entitymanager.createQuery("Select MAX(e.Salary) from Employee e");
	      Double list3 = (Double) query3.getSingleResult();
	      System.out.println("Max Employee Salary :" + list3);
	      
	      System.out.println("Query 4\n");

	      
	      Query query4 = entitymanager.createQuery("Select e from Employee e where e.Salary between 15000 and 25000 ");
	      @SuppressWarnings("unchecked")
		List<Employee> list4 = (List<Employee>)query4.getResultList();
	      for(Employee e:list4) {
		         System.out.println("Employee NAME :"+e);
		      }
	      
	      
	      System.out.println("Query 5\n");
	      
	      String d ="Select e from Employee e where e.Salary in (Select MAX(a.Salary) from Employee a group by a.deptname)";
	      Query query5 = entitymanager.createQuery(d);
	      
	      @SuppressWarnings("unchecked")
		List<Employee> list5 = (List<Employee>)query5.getResultList();
	      for(Employee e:list5) {
		         System.out.println("Employee NAME :"+e);
		 
		      }
	      
	      entitymanager.close();
	      emfactory.close();
	   }  
}
