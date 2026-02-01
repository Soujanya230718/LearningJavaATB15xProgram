package Oops_Const;

public class Employee {

        int id;
        String name;

        Employee() // without parameters
    {
            System.out.println("No-arg constructor");
        }

        Employee(int i, String n)            // with parameters
        {
            this.id = i;
            this.name = n;
        }

        void show() {
            System.out.println(id + " " + name);
        }

        public static void main(String[] args) {
            Employee e1 = new Employee();
            Employee e2 = new Employee(201, "Ravi");
            e2.show();
        }
    }


