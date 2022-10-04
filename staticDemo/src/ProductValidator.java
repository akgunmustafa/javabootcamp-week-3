public class ProductValidator {
    static {
        System.out.println("Static blok çalıştı");
    }
    public static boolean isValid(Product product){
        if (product.price>0 && !product.name.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
    public void other(){

    }

    //inner class and static
    public static class OtherClass{
        public static void delete(){

        }
    }
}
