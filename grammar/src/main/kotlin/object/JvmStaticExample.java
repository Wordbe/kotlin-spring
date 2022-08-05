package object;

public class JvmStaticExample {
    public static void main(String[] args) {
//        String hello = HelloClass.Companion.hello();
//        String hi = HiObject.INSTANCE.hi();
        // @JvmStatic 선언하여 더 짧게 사용
        String hello = HelloClass.hello();
        String hi = HiObject.hi();
        System.out.println(hello + " " + hi);

//        int id = HelloClass.Companion.getId();
//        String name = HiObject.INSTANCE.getName();
        // @JvmField 선언하여 더 짧게 사용
        int id = HelloClass.id;
        String name = HiObject.name;
        System.out.println(id + " " + name);

        String code = HelloClass.CODE;
        String familyName = HiObject.FAMILY_NAME;
        System.out.println(code + " " + familyName);
    }
}
