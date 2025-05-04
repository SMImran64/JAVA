

package xamtaken4maybysir;


public class Person {
    protected String name;
    protected int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void studentDetails(){    
        System.out.println("Name: "+name);
        System.out.println("Age : "+age);
    
    }
   
//    public String studentDetails(){
//        return "Student Name: "+name + "\n Student Age: "+age+"\n Student Id: ";
//    }
    
    
}
