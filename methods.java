public class methods {
                // perameter 
    static int sum(int x, int y){
        return x + y;
    }
    public static void main(String[] args) {

        // void: when we don't want to return anthing that time we use void 
        // static : we use static for automatic obj cretion when we dont use static we have to create obj as i show in 2 type of method calling 

        
        // call the method 
        // 1: 
        int result = sum(10, 30);
                        // argument 
        // 2: 
        // methods obj = new methods();
        // obj.sum(30, 70);


        System.out.println("The sum of two number is : "+result);
        
    }
}
