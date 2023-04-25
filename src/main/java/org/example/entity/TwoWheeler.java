package org.example.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

/**
 * @author preetham
 */
@Entity
@DiscriminatorValue( "BIKE" )
public class TwoWheeler extends Vehicle
{
   private String steeringHandle;

   public String getSteeringHandle()
   {
      return steeringHandle;
   }

   public void setSteeringHandle( String steeringHandle )
   {
      this.steeringHandle = steeringHandle;
   }

}
