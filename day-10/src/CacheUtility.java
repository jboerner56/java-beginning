
import java.io.*;
public class CacheUtility {

    private Contacts cache[] = new Contacts[10];
    private int cursor=0;
    public void add(Contacts contact){

        cache[cursor++]= contact;
    }
    public Contacts getContact(int index){

        return cache[index];
    }

    public int getCacheLength(){

        return cursor; //cache.length;
    }
    public void printContacts(){

        for( Contacts contact : cache){
            if(contact != null)
                System.out.println(contact);
            else
                break;
        }
    }
    public void deserialize(){
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis= new FileInputStream("mycotacts.ser");
            ois = new ObjectInputStream(fis);

            cache = (Contacts[]) ois.readObject();
            System.out.println(cache.length);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally{

            if(ois != null){

                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void persist(){
        // analogy of input output =  for input - use or apply input stream classes

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(("mycotacts.ser"));  // byte stream
            oos = new ObjectOutputStream(fos);  // as we are pesisting objects we use this class
            // since we dont have a method to persist /write to file an array - we will persist each object individually into file
            // for(int i =0; i<cursor;i++){
            oos.writeObject(cache);
            //}
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }
        finally{
            if(oos !=null)
                try {
                    oos.close();
                } catch (IOException e) {

                    e.printStackTrace();
                }

            if(fos != null){

                try {
                    fos.close();
                } catch (IOException e) {

                    e.printStackTrace();
                }
            }

        }



    }
}