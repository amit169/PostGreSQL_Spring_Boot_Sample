package com.eim.sample.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table (name = "customers")
public class Customers {

  @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   private String first_name;
   private String last_name;
   private String email;

   public Customers (){
     }

   public Customers (Long id, String first_name, String last_name , String email){
     this.id = id;
     this.first_name = first_name;
     this.last_name = last_name;
     this.email = email;
   }

   public Long getId() {
    return id;
   }

   public void setId(Long id) {
    this.id = id;
   }

   public String getFirst_name() {
       return first_name;
   }

   public void setFirst_name(String first_name) {
       this.first_name = first_name;
   }

   public String getLast_name() {
    return last_name;
   }

   public void setLast_name(String last_name) {
    this.last_name = last_name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

 /**
  @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.first_name);
        hash = 79 * hash + Objects.hashCode(this.last_name);
        hash = 79 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Customers other = (Customers) obj;
        if (!Objects.equals(this.first_name, other.first_name)) {
            return false;
        }
        if (!Objects.equals(this.last_name, other.last_name)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }
**/
    @Override
      public String toString() {
          return "Customers{" + "id=" + id + ", first_name=" + first_name
             + ", last_name=" + last_name + ", email=" + email  + '}';
      }
}
