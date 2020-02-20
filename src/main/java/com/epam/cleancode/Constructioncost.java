/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.cleancode;

/**
 *
 * @author SOUMYA NAREDDY
 */
public class Constructioncost {
    double Cost(String Material_Standard,double Total_area_of_house,boolean Fully_automated_home)
    {
        //total area of squarefeet
        if(Material_Standard=="Standard" && !Fully_automated_home)
            return 1200*Total_area_of_house;
        if(Material_Standard=="above Standard" && !Fully_automated_home)
            return 1500*Total_area_of_house;
  if(Material_Standard=="high Standard" ){
      if(Fully_automated_home){
            return 2500*Total_area_of_house;
      }
      else
          return 1800*Total_area_of_house;
  }
  return 0;
  
    }
}
