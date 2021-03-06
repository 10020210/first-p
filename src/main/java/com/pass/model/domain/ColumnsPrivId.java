package com.pass.model.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ColumnsPrivId  implements java.io.Serializable {


     private String host;
     private String db;
     private String user;
     private String tableName;
     private String columnName;

    public ColumnsPrivId() {
    }

    public ColumnsPrivId(String host, String db, String user, String tableName, String columnName) {
       this.host = host;
       this.db = db;
       this.user = user;
       this.tableName = tableName;
       this.columnName = columnName;
    }
   


    @Column(name="Host", nullable=false, length=60)
    public String getHost() {
        return this.host;
    }
    
    public void setHost(String host) {
        this.host = host;
    }


    @Column(name="Db", nullable=false, length=64)
    public String getDb() {
        return this.db;
    }
    
    public void setDb(String db) {
        this.db = db;
    }


    @Column(name="User", nullable=false, length=32)
    public String getUser() {
        return this.user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }


    @Column(name="Table_name", nullable=false, length=64)
    public String getTableName() {
        return this.tableName;
    }
    
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }


    @Column(name="Column_name", nullable=false, length=64)
    public String getColumnName() {
        return this.columnName;
    }
    
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ColumnsPrivId) ) return false;
		 ColumnsPrivId castOther = ( ColumnsPrivId ) other; 
         
		 return ( (this.getHost()==castOther.getHost()) || ( this.getHost()!=null && castOther.getHost()!=null && this.getHost().equals(castOther.getHost()) ) )
 && ( (this.getDb()==castOther.getDb()) || ( this.getDb()!=null && castOther.getDb()!=null && this.getDb().equals(castOther.getDb()) ) )
 && ( (this.getUser()==castOther.getUser()) || ( this.getUser()!=null && castOther.getUser()!=null && this.getUser().equals(castOther.getUser()) ) )
 && ( (this.getTableName()==castOther.getTableName()) || ( this.getTableName()!=null && castOther.getTableName()!=null && this.getTableName().equals(castOther.getTableName()) ) )
 && ( (this.getColumnName()==castOther.getColumnName()) || ( this.getColumnName()!=null && castOther.getColumnName()!=null && this.getColumnName().equals(castOther.getColumnName()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getHost() == null ? 0 : this.getHost().hashCode() );
         result = 37 * result + ( getDb() == null ? 0 : this.getDb().hashCode() );
         result = 37 * result + ( getUser() == null ? 0 : this.getUser().hashCode() );
         result = 37 * result + ( getTableName() == null ? 0 : this.getTableName().hashCode() );
         result = 37 * result + ( getColumnName() == null ? 0 : this.getColumnName().hashCode() );
         return result;
   }   


}


