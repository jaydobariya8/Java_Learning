public class private_accese_modifire {
    public static void main(String[] args) {
        
        employee jay = new employee();
        // employee.name ="jay"; ---> throw an Error because of private accese modifire 
        jay.setId(45);
        jay.setName("jay dobariya");
        System.out.println(jay.getName());
        System.out.println(jay.getId());
    }
}

class employee{
    private String name;
    private int id;
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}
