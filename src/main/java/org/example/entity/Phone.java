package org.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQuery;

/**
 * @author preetham
 */
@Entity
@NamedQuery( name = "Phone.byName", query = "from Phone where name=?" )
@NamedNativeQuery( name = "Phone.byId", query = "select * from PHONE where PHONE_ID=:id", resultClass = Phone.class )
public class Phone
{
   @Id
   @Column( name = "PHONE_ID" )
   @GeneratedValue( strategy = GenerationType.AUTO )
   private int id;

   public Phone()
   {

   }

   public Phone( String name )
   {
      this.name = name;
   }
   private String name;

   public int getId()
   {
      return id;
   }

   public void setId( int id )
   {
      this.id = id;
   }

   public String getName()
   {
      return name;
   }

   public void setName( String name )
   {
      this.name = name;
   }

}
