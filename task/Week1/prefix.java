public class prefix {

    public static void main(String[] args) {
        int prefixvalue=10;
        System.out.println("prefix will uodate here " + ++prefixvalue);
        System.out.println("it will remain the same "+ prefixvalue);
        /* [pefix is when you operator in the left side of value/var] */

        int postFixvalue =20;
        System.out.println("prefix will  not uodate here " + postFixvalue++);
        System.out.println("it will update here  "+ postFixvalue);
        /* [postfix  is when you put operator in the right  side] */

    }
}