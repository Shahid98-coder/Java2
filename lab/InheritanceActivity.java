class Employee {					// Parent class or Base class
	
  long employeeId;
  String employeeName;
  String employeeAddress;
  long employeePhone;
  double basicSalary;
  double specialAllowance = 250.80;
  double hra = 1000.50;


  Employee(long id, String name, String address, long phone, double salary) {//Parameterised-constructor of Employee class
    this.employeeId = id;
    this.employeeName = name;
    this.employeeAddress = address;
    this.employeePhone = phone;
    this.basicSalary = salary;
  }

  void calculateSalary() {			//Method For Calculate Salary
    double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100); //Formula for Calculate Salary
    System.out.println("Salary: " + salary); // Print Salary
  }

  void calculateTransportAllowance() { 		//Method for Transport Allowance
    double transportAllowance = 10 * basicSalary / 100;			//Formula for Calculate Transport Allowance 10%
    System.out.println("Transport Allowance for Trainee : " + transportAllowance); // Print Transport Allowance
  }
}

class Manager extends Employee {	//Sub Class of Employee Class / Child Class
  Manager(long id, String name, String address, long phone, double salary) {
    super(id, name, address, phone, salary);		//Parent reference Using Super Class
  }

  void calculateTransportAllowance() {		//Method for Transport Allowance
    double transportAllowance = 15 * basicSalary / 100;		//Formula for Calculate Transport Allowance 15%
    System.out.println("Transport Allowance for Manager: " + transportAllowance); 	// Print Transport Allowance
  }
  
}



class Trainee extends Employee {		//Sub Class of Employee Class / Child Class
  Trainee(long id, String name, String address, long phone, double salary) {
    super(id, name, address, phone, salary);		//Parent reference Using Super Class
  }
}

class InheritanceActivity{
  public static void main(String[] args) {		// Main Class

	  
    Manager manager = new Manager(126534, "Peter", "Chennai India", 237844, 65000); // parameterised Constructor Value
    System.out.println("Manager Details:");
    System.out.println("ID: " + manager.employeeId);
    System.out.println("Name: " + manager.employeeName);
    System.out.println("Address: " + manager.employeeAddress);
    System.out.println("Phone: " + manager.employeePhone);
    System.out.println("Basic Salary: " + manager.basicSalary);
    manager.calculateSalary(); 			//invoke calculateSalary
    manager.calculateTransportAllowance();		//invoke calculateTransportAllowance
	
	Trainee trainee = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);	// parameterised Constructor Value
    System.out.println("\n\nTrainee Details:");
    System.out.println("ID: " + trainee.employeeId);
    System.out.println("Name: " + trainee.employeeName);
    System.out.println("Address: " + trainee.employeeAddress);
    System.out.println("Phone: " + trainee.employeePhone);
    System.out.println("Basic Salary: " + trainee.basicSalary);
    trainee.calculateSalary();			//invoke calculateSalary
    trainee.calculateTransportAllowance();		//invoke calculateTransportAllowance
  }
}