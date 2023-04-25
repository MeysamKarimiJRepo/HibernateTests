package org.example.entity;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Transient;

/**
 * @author preetham
 */
@Entity
public class CarOwner
{
   @Id
   @GeneratedValue( strategy = GenerationType.AUTO )
   private int             id;
   private String          name;
   @Transient
   private String          details;
   @ManyToMany( cascade = CascadeType.ALL, mappedBy = "owners" )
   private Collection<Car> cars = new ArrayList<>();

   public CarOwner()
   {
      // TODO Auto-generated constructor stub
   }

   public CarOwner( String name )
   {
      this.name = name;
   }

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

   public Collection<Car> getCars()
   {
      return cars;
   }

   public void setCars( Collection<Car> cars )
   {
      this.cars = cars;
   }

   public String getDetails()
   {
      return details;
   }

   public void setDetails( String details )
   {
      this.details = details;
   }

}
