package com.pass.model.domain;


import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EventId  implements java.io.Serializable {


     private String db;
     private String name;

    public EventId() {
    }

    public EventId(String db, String name) {
       this.db = db;
       this.name = name;
    }
   


    @Column(name="db", nullable=false, length=64)
    public String getDb() {
        return this.db;
    }
    
    public void setDb(String db) {
        this.db = db;
    }


    @Column(name="name", nullable=false, length=64)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof EventId) ) return false;
		 EventId castOther = ( EventId ) other; 
         
		 return ( (this.getDb()==castOther.getDb()) || ( this.getDb()!=null && castOther.getDb()!=null && this.getDb().equals(castOther.getDb()) ) )
 && ( (this.getName()==castOther.getName()) || ( this.getName()!=null && castOther.getName()!=null && this.getName().equals(castOther.getName()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getDb() == null ? 0 : this.getDb().hashCode() );
         result = 37 * result + ( getName() == null ? 0 : this.getName().hashCode() );
         return result;
   }   


}


