package extension;

public class JavaExtension {
    public static void main(String[] args) {
        System.out.println(KotlinExtensionKt.first("ABC"));
        System.out.println(KotlinExtensionKt.addFirst("ABC", 'Z'));
    }
}
