package org.example.entity;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

/**
 * @author preetham
 */
@Entity
public class Owner
{
   @Id
   @GeneratedValue( strategy = GenerationType.AUTO )
   private int               id;
   private String            name;
   @OneToMany( mappedBy = "owner" )
   private Collection<House> house = new ArrayList<House>();

   public int getId()
   {
      return id;
   }

   public void setId( int id )
   {
      this.id = id;
   }

   public Collection<House> getHouse()
   {
      return house;
   }

   public void setHouse( Collection<House> house )
   {
      this.house = house;
   }

   public String getName()
   {
      return name;
   }

   public void setName( String name )
   {
      this.name = name;
   }

   public Owner()
   {
      // TODO Auto-generated constructor stub
   }

   public Owner( String name )
   {
      this.name = name;
   }

}
