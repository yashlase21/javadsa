import java.io.*;  

public class DeserializeExample {  
    public static void main(String args[]) {  
        try {  
            FileInputStream fis = new FileInputStream("student.ser");  
            ObjectInputStream ois = new ObjectInputStream(fis);  
            Student s1 = (Student) ois.readObject();  
            ois.close();  
            fis.close();  
            System.out.println("Deserialization completed: " + s1.id + " " + s1.name);  
        } catch (Exception e) {  
            System.out.println(e);  
        }  
    }  
}
