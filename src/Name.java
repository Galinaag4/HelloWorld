public class Name {
    public static void main(String[] args)throws ArrayIndexOutOfBoundsException {
    int [] array = {4,8,1};//Checked Exception
      try{ System.out.println(array[5]);}
       catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Такого элемнта нет" + e);
       }
    String a =null;//Unchecked Exception
        System.out.println(a.length());


        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        System.out.println("s1 == s2 ? " + (s1 == s2));
        System.out.println("s1 == s3 ? " + (s1 == s3));
        System.out.println("s1 equals s3 ? " + (s1.equals(s3)));
    }
}
