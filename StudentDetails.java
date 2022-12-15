// import java.util.Serializable

class Student { // implements java.util.Serializable
    private int id;
    private String name;
    private String address;
    
    Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    
    public void setId (int id) {
        this.id=id;
    }
    
    public int getId () {
        return id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName() {
        return name;
    } 
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getAddress() {
        return address;
    }
}

class StudentDetails {
        public static void main(String[] args){
        Student st1 = new Student(4, "Ram", "Ktm");
        System.out.println("Name: " + st1.getName());
        System.out.println("Roll No: " + st1.getId());
        System.out.println("Address: " + st1.getAddress());
    }
}