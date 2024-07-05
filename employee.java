class Employee{

  int emp_id =1001;
  String emp_name="Punit" ;

  System.out.println(emp_id "" +emp_name);

  public int addition(int a,int b){
    int c= a+b;
      System.out.println(c);
    return c;
  }
  public static void main(String args[]){
    Employee emp = new Employee();
    emp.addition(10,10);
  }
  
}
