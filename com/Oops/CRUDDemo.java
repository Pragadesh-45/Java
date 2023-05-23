package com.Oops;

import java.util.*;


class Employee {
	private int empno;
	private String ename;
	private int salary;

	Employee(int empno, String ename, int salary) {
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}

	public int getEmpno() {
		return empno;
	}
	public int getSalary() {
		return salary;
	}
	public String getName() {
		return ename;
	}
	public String toString() {
		return empno+" "+ename+" "+salary;
	}

}

class CRUDDemo {
	public static void main(String[] args) {

		List<Employee> c = new ArrayList<Employee>();

		Scanner scanner = new Scanner(System.in);
		int ch;

		do {
			System.out.println("1.INSERT");
			System.out.println("2.DISPLAY");
			System.out.println("3.SEARCH");
			System.out.println("4.DELETE");
			System.out.println("5.UPDATE");
			System.out.println("Enter your choice: ");
			ch = scanner.nextInt();


			switch (ch) {
				case 1:
					System.out.println("Enter Empno: ");
					int empno = scanner.nextInt();
					scanner.nextLine();

					System.out.println("Enter Empname: ");
					String ename = scanner.nextLine();

					System.out.println("Enter Salary: ");
					int salary = scanner.nextInt();
					scanner.nextLine();

					c.add(new Employee(empno, ename, salary));
				
				break;
				case 2:
					System.out.println("----------------------------------------------");
					Iterator<Employee> i = c.iterator();
					while (i.hasNext()) {
						Employee e = i.next();
						System.out.println(e);
					}
					System.out.println("----------------------------------------------");

				break;
				case 3:
					boolean found = false;
					System.out.println("Enter empno to search: ");
					int eno = scanner.nextInt();
					System.out.println("----------------------------------------------");
					i = c.iterator();
					while (i.hasNext()) {
						Employee e = i.next();
						if (e.getEmpno() == eno) {
							found = true;
						}
						System.out.println(e);
					}
					if (!found) { 
						System.out.println("Record not found");
					}
					System.out.println("----------------------------------------------");

				break;
				case 4:
					found = false;
					System.out.println("Enter empno to Delete: ");
					eno = scanner.nextInt();
					System.out.println("----------------------------------------------");
					i = c.iterator();
					while (i.hasNext()) {
						Employee e = i.next();
						if (e.getEmpno() == eno) {
							i.remove();
							found = true;
						}
						System.out.println(e);
					}
					if (!found) {
						System.out.println("Record not found");
					}else{
						System.out.println("Record is deleted successfully");
					}
					System.out.println("----------------------------------------------");

				break;
				case 5:
					found = false;
					System.out.println("Enter empno to Update: ");
					eno = scanner.nextInt();
					scanner.nextLine();
					System.out.println("----------------------------------------------");
					ListIterator<Employee> li = c.listIterator();
					while (li.hasNext()) {
						Employee e = li.next();
						if (e.getEmpno() == eno) {
							System.out.println("Enter new name: ");
							ename = scanner.nextLine();

							System.out.println("Enter new salary: ");
							salary = scanner.nextInt();
							scanner.nextLine();
							li.set(new Employee(eno, ename, salary));
							found = true;
						}
						System.out.println(e);
					}
					if (!found) {
						System.out.println("Record not found");
					}else{
						System.out.println("Record is deleted successfully");
					}
					System.out.println("----------------------------------------------");

				break;

			}

		}while(ch!=0);
	}
}