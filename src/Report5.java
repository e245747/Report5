public class Report5 {
    public static void main(String[] args) {
        // 条件1: String型変数strを宣言し、nullを代入
        String str = null;
    try{
        // 条件2: str.length() を呼び出す
        System.out.println(str.length());
    }catch(NullPointerException e){
        System.out.println("NullPointerExceptionが発生");
        System.out.println(e.getMessage());
    }
    }
}
    

