public class CacheUtility {
    private Contacts cache[] = new Contacts[10];
    private int itemIndex = 0;
    public void add(Contacts contact) {
        cache[itemIndex++] = contact;
    }
    public Contacts getContact(int index) {
        return cache[index];
    }

    public int getCacheLength() {
        return itemIndex;
    }
    public void printContacts() {
        for (Contacts contact: cache){
            if(contact != null)
            System.out.println(contact);
            else {
                break;
            }
        }
    }
}
