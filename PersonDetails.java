// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Person { // implements java.util.Serializable
    private String phone;
    private String name;
    private String address;
    
    Person(String phone, String name, String address) {
        this.phone = phone;
        this.name = name;
        this.address = address;
    }
    
    public void setPhone (String phone) {
        this.phone=phone;
    }
    
    public String getPhone () {
        return phone;
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

class PersonDetails {
    public static void main(String[] args){
        Person pr1 = new Person("9818990183", "Ram", "Ktm");
        System.out.println("Name: " + pr1.getName());
        System.out.println("Phone: " + pr1.getPhone());
        System.out.println("Address: " + pr1.getAddress());
    }
}