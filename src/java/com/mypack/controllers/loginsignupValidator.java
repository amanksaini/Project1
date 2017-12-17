/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mypack.controllers;


import beans.loginsignup;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


public class loginsignupValidator implements Validator{
 
     
   @Override
   public boolean supports(Class<?> clazz) {
      return loginsignup.class.equals(clazz);
   }


    @Override
    public void validate(Object target, Errors errors) {
        loginsignup ls = (loginsignup) target;
        //System.out.println("-checked-"+".username");
 
        if(ls.getUsername()!=null)
        {
        ValidationUtils.rejectIfEmpty(errors, "username", "required.username");
        }
 //System.out.println("-checked-"+".password");
 if(ls.getPassword()!=null)
 {
     
            
 ValidationUtils.rejectIfEmpty(errors, "password", "required.password");
 }
 if(ls.getPassword1()!=null&& !(ls.getPassword().equals(ls.getPassword1())))
 {
     
     errors.rejectValue("password1", "required.vpassword1",  "Please Confirm password");
 }
 
 
 
 
 if(ls.getAddress()!=null)
 {
 ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address", "required.address");
 }
 //ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phone",  
   // "required.phone", "Phone is required.");  
  if(ls.getMobileno()!=null)
  {
if( ls.getMobileno().isEmpty())
{
    ValidationUtils.rejectIfEmptyOrWhitespace(errors, "mobileno", "required.mobileno");
}

else
{
   Pattern pattern = Pattern.compile("[0-9]{10}");  
  Matcher matcher = pattern.matcher(ls.getMobileno());  
   if (!matcher.matches()) {  
    errors.rejectValue("mobileno", "required.vmobileno",  
      "Enter a correct phone number");  
   }  
  } 
  }
  
 if(ls.getGender()!=null)
 {
     if(ls.getGender().isEmpty())
    
      //errors.rejectValue("gender", "required.vgender","Please select gender"); 
  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "gender", "required.gender");
 }
     
 if(ls.getAge()!=null)
 {
 ValidationUtils.rejectIfEmptyOrWhitespace(errors, "age", "required.age");
 }
 
 if(ls.getPincode()!=null)
 {
 if(ls.getPincode().isEmpty())
{
    ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pincode", "required.pincode");
}

else
{
    if(ls.getPincode().length()<6)
    {
        errors.rejectValue("pincode", "required.vpincode",  
      "Enter a correct pincode");
    }
     
   }  
    
 } 
// ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "required.email");
 
  
// email validation in spring 

if(ls.getEmail()!=null)
{
if(ls.getEmail().isEmpty())
{
    ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "required.email");
}

else
{
    System.out.println(ls.getEmail());
  
Pattern p = Pattern.compile("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b",Pattern.CASE_INSENSITIVE);
Matcher m = p.matcher(ls.getEmail());

if (!m.matches()) 
{
    System.out.println("email is invalid");
    errors.rejectValue("email", "required.vemail", "Enter a correct Email");
}  


}
}
if(ls.getName()!=null)
{
    errors.rejectValue("name", "required.vname", "Enter Name");
}
if(ls.getModel()!=null)
{
    errors.rejectValue("model", "required.vmodel", "Enter Model");
}

if(ls.getPrice()!=null)
{
    errors.rejectValue("price", "required.vprice", "Enter Price");
}
if(ls.getAverage()!=null)
{
    errors.rejectValue("average", "required.vaverage", "Enter Average");
}
if(ls.getColor()!=null)
{
    errors.rejectValue("color", "required.vcolor", "Enter Color");
}
if(ls.getMakemodel()!=null)
{
    errors.rejectValue("makemodel", "required.vmakemodel", "Enter Make Model");
}
if(ls.getYear()!=null)
{
    errors.rejectValue("year", "required.vyear", "Enter year");
}
if(ls.getEngine()!=null)
{
    errors.rejectValue("engine", "required.vengine", "Enter engine");
}
if(ls.getCapacity()!=null)
{
    errors.rejectValue("capacity", "required.vcapacity", "Enter Capacity");
}
if(ls.getBorexstroke()!=null)
{
    errors.rejectValue("borexstroke", "required.vborexstroke", "Enter Borexstroke");
}

if(ls.getBorexstroke()!=null)
{
    errors.rejectValue("borexstroke", "required.vborexstroke", "Enter Borexstroke");
}
if(ls.getCoolingsystem()!=null)
{
    errors.rejectValue("coolingsystem", "required.vcoolingsystem", "Enter Coolingsystem");
}
if(ls.getCompressionratio()!=null)
{
    errors.rejectValue("compressionratio", "required.vcompressionratio", "Enter Compressionratio");
}
if(ls.getLubrication()!=null)
{
    errors.rejectValue("lubrication", "required.vlubrication", "Enter Lubrication");
}
if(ls.getInduction()!=null)
{
    errors.rejectValue("induction", "required.vinduction", "Enter Induction");
}

if(ls.getIgnition()!=null)
{
    errors.rejectValue("ignition", "required.vignition", "Enter Ignition");
}

if(ls.getVstarting()!=null)
{
    errors.rejectValue("vstarting", "required.vvstarting", "Enter Starting");
}
if(ls.getMaxpower()!=null)
{
    errors.rejectValue("maxpower", "required.vmaxpower", "Enter Max Power");
}
if(ls.getMaxtorque()!=null)
{
    errors.rejectValue("maxtorque", "required.vmaxtorque", "Enter Max Torque");
}
if(ls.getClutch()!=null)
{
    errors.rejectValue("clutch", "required.vclutch", "Enter Clutch");
}
if(ls.getTransmission()!=null)
{
    errors.rejectValue("transmission", "required.vtransmission", "Enter Transmission");
}
if(ls.getFinaldrive()!=null)
{
    errors.rejectValue("finaldrive", "required.vfinaldrive", "Enter Final Drive");
}
if(ls.getFrame()!=null)
{
    errors.rejectValue("frame", "required.vframe", "Enter Frame");
}
if(ls.getFrontsuspension()!=null)
{
    errors.rejectValue("frontsuspension", "required.vfrontsuspension", "Enter Front Suspension");
}
if(ls.getFrontwheeltravel()!=null)
{
    errors.rejectValue("frontwheeltravel", "required.vfrontwheeltravel", "Enter Front wheel travel");
}
if(ls.getFrontbrakes()!=null)
{
    errors.rejectValue("frontbrakes", "required.vfrontbrakes", "Enter Front Brakes");
}
if(ls.getRearbrakes()!=null)
{
    errors.rejectValue("rearbrakes", "required.vrearbrakes", "Enter Rear Brakes");
}
if(ls.getFronttyre()!=null)
{
    errors.rejectValue("fronttyre", "required.vfronttyre", "Enter Front Tyre");
}
if(ls.getReartyre()!=null)
{
    errors.rejectValue("reartyre", "required.vreartyre", "Enter Rear Tyre");
}
if(ls.getSteering()!=null)
{
    errors.rejectValue("steering", "required.vsteering", "Enter Steering Angle");
}
if(ls.getWheelbase()!=null)
{
    errors.rejectValue("wheelbase", "required.vwheelbase", "Enter Wheel Base");
}
if(ls.getGroundclearance()!=null)
{
    errors.rejectValue("groundclearance", "required.vgroundclearance", "Enter Ground Clearance");
}
if(ls.getSeatheight()!=null)
{
    errors.rejectValue("seatheight", "required.vseatheight", "Enter Seat Height");
}
if(ls.getDryweight()!=null)
{
    errors.rejectValue("dryweight", "required.vdryweight", "Enter Dry Weight");
}
if(ls.getFuelcapacity()!=null)
{
    errors.rejectValue("fuelcapacity", "required.vfuelcapacity", "Enter Fuel Capacity");
}
if(ls.getFile()!=null)
{
    errors.rejectValue("file", "required.vgroundclearance", "Upload Image");
}


    }
    
}  

