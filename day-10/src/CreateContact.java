public class CreateContact {
    public static void main(String[] args) {
        Contacts mc1 = new Contacts("Jason", "Boerner", 1234567899, 1234567898, "+1");
        Contacts mc2 = new Contacts("Bob", "Something", 1221221222, 1332333333,"+2");

        System.out.println(mc1);
        System.out.println(mc2);

        CacheUtility cache = new CacheUtility();
        cache.add(mc1);
        cache.add(mc2);
        System.out.println("number of elements in cache" + " " + cache.getCacheLength());
        System.out.println(cache.getContact(1));
    }
}
