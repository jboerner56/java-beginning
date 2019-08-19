
class Book {
    // attributes of a class
    // all objects of a class have the same attributes, (keys) with different data (values)
    string title;
    string author;
    string category;

    public string getTitle() {
        return title;
    }

    public void setTitle(string title) {
        this.title = title;
    }

    public string getAuthor() {
        return author;
    }

    public void setAuthor(string author) {
        this.author = author;
    }

    public string getCategory() {
        return category;
    }

    public void setCategory(string category) {
        this.category = category;
    }

    public Book() {
    }
}

public class CreateBooks {
    public static void main(String[] args) {
        Book textBook = new Book(); // creates an object
        // instantiating, process of creating object
        // textbook will have copy of all instance methods and variables
        // textBook.title="random title";
        // textbook.author="Bill";
        // textBook.category="none";

        Book novel = new Book("novel");
        novel.title="novel";
        novel.author="bob";
        novel.category="novel";

        // print object info
        System.out.println(textBook.title);
        System.out.println(textBook.author);
        System.out.println(textBook.category);
    }

}

// create student object
class createStudents {
    public static void main(String[] args) {
        Student one = new Student();
        one.name = "Jason";
        one.rollNo = "100";

        Student two = new Student();
        two.name = "sierra";
        two.rollNo = "101";
    }
}

// encap
class Book {
    // attributes of a class
    // all objects of a class have the same attributes, (keys) with different data (values)
    private string title;
    private string author;
    private string category;
    // can only be accessed within the class
    // no exporting to other classes

    // add public accessor methods or 'mutators'

    public String getTitle() {
        return title;
    }
    // use setTitle to chnage the value of title
    public void setTitle(String title) {
        this.title = title;
    }
    
    // constructors
    Book() {
        
    }
    Book(String title){
        this.title = title;
    }
    // need to write constructors for other keys
    Book nwBook = new Book("random", "random", "random");
    // use constructors for required fields
    // no set methods for these
    // confidential data
    
    // optional fields use set methods
    
    
    // methods
        // 1. name
        // 2. return type
        // 3. parameters/inputs
        // 4. body
    String offerAvailable(int orderQuantity) {
        if(orderQuantity >=50 && orderQuantity <= 200)
            return "20% discount";
            else if(orderQuantity >= 201 && orderQuantity <= 500)
            return "24% discount";
            else if( orderQuantity > 501)
            return "100 free";
            else
            return "no free stuff for you";
    }

}