package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 * @author preetham
 */
@Entity
public class House
{
   @Id
   @GeneratedValue( strategy = GenerationType.AUTO )
   private int    id;
   private String name;
   @ManyToOne
   @JoinColumn( name = "OWNER_ID" )
   private Owner  owner; // mappedBy

   public int getId()
   {
      return id;
   }

   public void setId( int id )
   {
      this.id = id;
   }

   public Owner getOwner()
   {
      return owner;
   }

   public void setOwner( Owner owner )
   {
      this.owner = owner;
   }

   public String getName()
   {
      return name;
   }

   public void setName( String name )
   {
      this.name = name;
   }

   public House()
   {
      // TODO Auto-generated constructor stub
   }

   public House( String name )
   {
      this.name = name;
   }

}
