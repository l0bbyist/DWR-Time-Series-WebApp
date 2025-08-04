package dwrts.user.model;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.Table;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    //@Column(name="dev_NAME", nullable=false)
    private String cheque_no;
    
    //@Column(name="BRAND")
    private String email;
    
    //@Column(name="SERIAL")
    private String name;
    
    //@Column(name="STATUS")
    private String phone;
    
    //@Column(name="DATE_ADDED")
    //private String DATE_ADDED;

    // Constructors, getters, and setters
    public User() {}

   public User(Integer id, String cheque_no, String email, String name, String phone) {
    	this.id=id;
    	this.cheque_no = cheque_no;
        this.email = email;
        this.name = name;
        this.phone = phone;
        //this.DATE_ADDED = DATE_ADDED;
    } 
    
    public Integer getid() {
        return id;
    }

    public void setid(Integer id) {
        this.id = id;
    }

    public String getcheque_no() {
        return cheque_no;
    }

    public void setcheque_no(String cheque_no) {
        this.cheque_no = cheque_no;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getphone() {
        return phone;
    }

    public void setphone(String phone) {
        this.phone = phone;
    }
   
}
