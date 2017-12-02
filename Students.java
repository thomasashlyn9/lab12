import java.io.File;
import java.util.Scanner;
import java.util.Vector;
import BinaryTrees.HeapSort;


public class Students {

	public static void main(String[] args) {

		
		Vector <StudentGPA> BST = new Vector<StudentGPA>();
		try {

			
			Scanner input = new Scanner(System.in);
			File file = new File("students.in");

			input = new Scanner(file);
			
			StudentGPA x;
			GraduateStudentGPA y;
			int id;
			String name;
			double gpa;

			while (input.hasNextLine()) {
				
				Scanner scan = new Scanner(input.nextLine());
				id = scan.nextInt();
				name = scan.next();
				gpa = scan.nextDouble();
				
				if(scan.hasNext()) {
					String advisor = scan.next();
					y = new GraduateStudentGPA(id, name, gpa, advisor);
					BST.add(y);
				}
				
				else {
					
					x= new StudentGPA(id, name, gpa);
					BST.add(x);
				}
				
			scan.close();	

			}

			input.close();
			

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		HeapSort<StudentGPA> object = new HeapSort<StudentGPA>();
		object.heapSort(BST);
		
		for(int i = 0; i < BST.size(); i++)
		{
			System.out.println(BST.get(i));
		}

	}

}
