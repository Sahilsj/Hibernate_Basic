package Entites;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column
    private  int  id;
@Column(name="Name")
    private String Name;
@Column(name = "Subject")

    private  String Subject;

    public Student(String name, String subject) {
        Name = name;
        Subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }
}
