package org.example.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

/**
 * @author preetham
 */
@Entity
@DiscriminatorValue( "CAR" )
public class FourWheeler extends Vehicle
{
   private String steeringWheel;

   public String getSteeringWheel()
   {
      return steeringWheel;
   }

   public void setSteeringWheel( String steeringWheel )
   {
      this.steeringWheel = steeringWheel;
   }

}
