package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Person{
	private String name;
    private int age;
    
    public Person() {}  // Use reflection, it must define this method since newinstance has no parameter.
    
    public Person(String name) {
    	this.name = name;
    }
    
    
	public Person(String name, int age) {
        this.age=age;
        this.name=name;
    }
    
    public Person(int age) {
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
    @Override
    public String toString(){
        return "["+this.name+"  "+this.age+"]";
    }
    
}

public class ReflectDemo {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?> demo=null;
        
        demo=Class.forName("reflect.Person"); 
        Person per=null;
        per= (Person)demo.newInstance();
        
        Constructor<?>[] cons = demo.getConstructors();  // Get all constructors of class<?>
        
        Person per1 = (Person)cons[1].newInstance(10);
        Person per2 = (Person) cons[0].newInstance();
        
        Method[] methods = demo.getMethods();  // Get all methods of class<?>
        System.out.println(methods.length);
        for(Method m: methods) {
        	System.out.println(m);
        }
       
        System.out.println(demo);
        System.out.println(cons.length);
        
        
        for(Constructor<?> c: cons) {
        	System.out.println(c);
        }
        
        per.setName("Rollen");
        per.setAge(20);
        System.out.println(per2);
    }
}
