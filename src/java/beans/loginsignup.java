/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Blob;



/**
 *
 * @author amanj
 */
public class loginsignup {
    private int id;
     private int vehicleno;
 
     
private String username;
private String subject;
private String question;
private String date;
private String carid;
private String password1;

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }


    public String getCarid() {
        return carid;
    }

    public void setCarid(String carid) {
        this.carid = carid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
private String distancecovered;
private String owner;

    public String getDistancecovered() {
        return distancecovered;
    }

    public void setDistancecovered(String distancecovered) {
        this.distancecovered = distancecovered;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
private String city;
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
private String message;
                
private String password;
private String address;

    
private String mobileno;
private String email;
private String gender;
private String pincode;
private String age;

private String name;
private String type;
private String price;
private String average;
private String noofcylinders;
private String enginetype;
private String color;
private String cylinderarrangement;
private String engineplacement;
private String aspirations;
private String valves;
private String fueltype;
private String coolant;
private String enginelayout;
private String drivewheels;
private String transmission;
private String makemodel ;
private String year;
private String engine;
private String capacity;
private String borexstroke;
private String coolingsystem;
private String compressionratio;
private String lubrication;
private String induction;
private String ignition;
private String vstarting;
private String maxpower;
private String maxtorque;
private String clutch;
private String finaldrive;
private String frame;
private String frontsuspension;
private String frontwheeltravel;
private String frontbrakes;
private String rearbrakes;
private String fronttyre;
private String reartyre;
private String steering;
private String wheelbase;
private String groundclearance;

private String seatheight;
private String dryweight;
private String fuelcapacity;
private int bikeno;
private String model;
    
private File file;
private String img;


    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
         public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBikeno() {
        return bikeno;
    }

    public void setBikeno(int bikeno) {
        this.bikeno = bikeno;
    }
    
public int getVehicleno() {
        return vehicleno;
    }

    public void setVehicleno(int vehicleno) {
        this.vehicleno = vehicleno;
    }






    public String getMakemodel() {
        return makemodel;
    }

    public void setMakemodel(String makemodel) {
        this.makemodel = makemodel;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getBorexstroke() {
        return borexstroke;
    }

    public void setBorexstroke(String borexstroke) {
        this.borexstroke = borexstroke;
    }

    public String getCoolingsystem() {
        return coolingsystem;
    }

    public void setCoolingsystem(String coolingsystem) {
        this.coolingsystem = coolingsystem;
    }

    public String getCompressionratio() {
        return compressionratio;
    }

    public void setCompressionratio(String compressionratio) {
        this.compressionratio = compressionratio;
    }

    public String getLubrication() {
        return lubrication;
    }

    public void setLubrication(String lubrication) {
        this.lubrication = lubrication;
    }

    public String getInduction() {
        return induction;
    }

    public void setInduction(String induction) {
        this.induction = induction;
    }

    public String getIgnition() {
        return ignition;
    }

    public void setIgnition(String ignition) {
        this.ignition = ignition;
    }

    public String getVstarting() {
        return vstarting;
    }

    public void setVstarting(String vstarting) {
        this.vstarting = vstarting;
    }

    public String getGroundclearance() {
        return groundclearance;
    }

    public void setGroundclearance(String groundclearance) {
        this.groundclearance = groundclearance;
    }

    

    public String getMaxpower() {
        return maxpower;
    }

    public void setMaxpower(String maxpower) {
        this.maxpower = maxpower;
    }

    public String getMaxtorque() {
        return maxtorque;
    }

    public void setMaxtorque(String maxtorque) {
        this.maxtorque = maxtorque;
    }

    public String getClutch() {
        return clutch;
    }

    public void setClutch(String clutch) {
        this.clutch = clutch;
    }

    public String getFinaldrive() {
        return finaldrive;
    }

    public void setFinaldrive(String finaldrive) {
        this.finaldrive = finaldrive;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getFrontsuspension() {
        return frontsuspension;
    }

    public void setFrontsuspension(String frontsuspension) {
        this.frontsuspension = frontsuspension;
    }

    public String getFrontwheeltravel() {
        return frontwheeltravel;
    }

    public void setFrontwheeltravel(String frontwheeltravel) {
        this.frontwheeltravel = frontwheeltravel;
    }

    public String getFrontbrakes() {
        return frontbrakes;
    }

    public void setFrontbrakes(String frontbrakes) {
        this.frontbrakes = frontbrakes;
    }

    public String getRearbrakes() {
        return rearbrakes;
    }

    public void setRearbrakes(String rearbrakes) {
        this.rearbrakes = rearbrakes;
    }

    public String getFronttyre() {
        return fronttyre;
    }

    public void setFronttyre(String fronttyre) {
        this.fronttyre = fronttyre;
    }

    public String getReartyre() {
        return reartyre;
    }

    public void setReartyre(String reartyre) {
        this.reartyre = reartyre;
    }

    public String getSteering() {
        return steering;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

    public String getWheelbase() {
        return wheelbase;
    }

    public void setWheelbase(String wheelbase) {
        this.wheelbase = wheelbase;
    }

    

    public String getSeatheight() {
        return seatheight;
    }

    public void setSeatheight(String seatheight) {
        this.seatheight = seatheight;
    }

    public String getDryweight() {
        return dryweight;
    }

    public void setDryweight(String dryweight) {
        this.dryweight = dryweight;
    }

    public String getFuelcapacity() {
        return fuelcapacity;
    }

    public void setFuelcapacity(String fuelcapacity) {
        this.fuelcapacity = fuelcapacity;
    }


        



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAverage() {
        return average;
    }

    public void setAverage(String average) {
        this.average = average;
    }

    public String getNoofcylinders() {
        return noofcylinders;
    }

    public void setNoofcylinders(String noofcylinders) {
        this.noofcylinders = noofcylinders;
    }

    public String getEnginetype() {
        return enginetype;
    }

    public void setEnginetype(String enginetype) {
        this.enginetype = enginetype;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCylinderarrangement() {
        return cylinderarrangement;
    }

    public void setCylinderarrangement(String cylinderarrangement) {
        this.cylinderarrangement = cylinderarrangement;
    }

    public String getEngineplacement() {
        return engineplacement;
    }

    public void setEngineplacement(String engineplacement) {
        this.engineplacement = engineplacement;
    }

    public String getAspirations() {
        return aspirations;
    }

    public void setAspirations(String aspirations) {
        this.aspirations = aspirations;
    }

    public String getValves() {
        return valves;
    }

    public void setValves(String valves) {
        this.valves = valves;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public String getCoolant() {
        return coolant;
    }

    public void setCoolant(String coolant) {
        this.coolant = coolant;
    }

    public String getEnginelayout() {
        return enginelayout;
    }

    public void setEnginelayout(String enginelayout) {
        this.enginelayout = enginelayout;
    }

    public String getDrivewheels() {
        return drivewheels;
    }

    public void setDrivewheels(String drivewheels) {
        this.drivewheels = drivewheels;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }




    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

  

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }


}
