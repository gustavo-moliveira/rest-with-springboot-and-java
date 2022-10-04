//package br.com.erudio.models;
//
//import jakarta.persistence.*;
//import org.springframework.security.core.GrantedAuthority;
//
//import java.io.Serializable;
//
//@Entity()
//@Table(name = "permission")
//public class Permission implements GrantedAuthority, Serializable {
//    private static final long serialVersionUID = 1L;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//
//    @Column()
//    private String description;
//
//    public Permission() {}
//
//    @Override
//    public String getAuthority() {
//        return this.description;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//}
