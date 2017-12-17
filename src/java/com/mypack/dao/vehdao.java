package com.mypack.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import beans.loginsignup;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import org.apache.catalina.User;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import sun.misc.BASE64Decoder;


public class vehdao {
JdbcTemplate template;

FileInputStream imageinFile;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}
public int save(loginsignup p){
	String sql="insert into custdet(username,password,address,mobileno,email,gender,age,pincode) values('"+p.getUsername()+"','"+p.getPassword()+"','"+p.getAddress()+"','"+p.getMobileno()+"','"+p.getEmail()+"','"+p.getGender()+"','"+p.getAge()+"','"+p.getPincode()+"')";
	return template.update(sql);
}
public int sell_car(loginsignup p){
	String sql="insert into sellcar(carid,name,email,mobile,city) values('"+p.getCarid()+"','"+p.getUsername()+"','"+p.getEmail()+"','"+p.getMobileno()+"','"+p.getCity()+"')";
	return template.update(sql);
}
public int sell_car1(loginsignup p){
    
    String base64Image = "";
   
	File file = new File(p.getFile().toString());
        
	try (FileInputStream imageInFile = new FileInputStream(file)) {
		// Reading a Image file from file system
		byte imageData[] = new byte[(int) file.length()];
		imageInFile.read(imageData);
		base64Image = Base64.getEncoder().encodeToString(imageData);
	} catch (FileNotFoundException e) {
		System.out.println("Image not found" + e);
	} catch (IOException ioe) {
		System.out.println("Exception while reading the Image " + ioe);
	}
	String sql="insert into sellcar1(carid,model,date,fueltype,distancecovered,owner,price,vehicleimage) values('"+p.getCarid()+"','"+p.getModel()+"','"+p.getDate()+"','"+p.getFueltype()+"','"+p.getDistancecovered()+"','"+p.getOwner()+"','"+p.getPrice()+"','"+base64Image+"')";
	return template.update(sql);
}

public  List<loginsignup> getDetails(){
	return template.query("select name,email,mobile,city ,model,date,fueltype,distancecovered,owner,price,vehicleimage from sellcar INNER JOIN sellcar1 ON sellcar.carid = sellcar1.carid ",new RowMapper<loginsignup>(){
		public loginsignup mapRow(ResultSet rs, int row) throws SQLException {
                    
               loginsignup e=new loginsignup();
        //System.out.println(rs.getBlob(18));
          
         

       
             e.setName(rs.getString(1));
		e.setEmail(rs.getString(2));
		e.setMobileno(rs.getString(3));
	        e.setCity(rs.getString(4));
                e.setModel(rs.getString(5));
                e.setDate(rs.getString(6));
                e.setFueltype(rs.getString(7));
                e.setDistancecovered(rs.getString(8));
                e.setOwner(rs.getString(9));
                e.setPrice(rs.getString(10));
                e.setImg(rs.getString(11));
                
                  
               
                
                return e;
		}
                
	});
}
public int add(loginsignup p){
	String sql="insert into custdet(username,password,address,mobileno,email,gender,age,pincode) values('"+p.getUsername()+"','"+p.getPassword()+"','"+p.getAddress()+"','"+p.getMobileno()+"','"+p.getEmail()+"','"+p.getGender()+"','"+p.getAge()+"','"+p.getPincode()+"')";
	return template.update(sql);
}
public int feedback(loginsignup p){
	String sql="insert into feedback(name,email,subject,message) values('"+p.getUsername()+"','"+p.getEmail()+"','"+p.getSubject()+"','"+p.getMessage()+"')";
	return template.update(sql);
}
public int enquiry(loginsignup p){
	String sql="insert into enquiry(name,email,phone,city,question) values('"+p.getUsername()+"','"+p.getEmail()+"','"+p.getMobileno()+"','"+p.getCity()+"','"+p.getQuestion()+"')";
	return template.update(sql);
}
public int addcdet(loginsignup p){
	String sql="insert into custdet(username,password,address,mobileno,email,gender,age,pincode) values('"+p.getUsername()+"','"+p.getPassword()+"','"+p.getAddress()+"','"+p.getMobileno()+"','"+p.getEmail()+"','"+p.getGender()+"','"+p.getAge()+"','"+p.getPincode()+"')";
	return template.update(sql);
}



public int check(loginsignup p){
    if(p.getUsername().equals("admin") && p.getPassword().equals("admin123"))
    {
    
	String sql="select * from adminlogin where username='"+p.getUsername()+"' and password='"+p.getPassword()+"'";
	SqlRowSet q=template.queryForRowSet(sql); //template.execute(sql);
        if(q.next())
            return 1;
        else
return 0;
    }
    else
    {
        String sql="select * from custdet where username='"+p.getUsername()+"'and password='"+p.getPassword()+"'";
	SqlRowSet q=template.queryForRowSet(sql); //template.execute(sql);
        if(q.next())
            return 2;
        else
return 3;
    }
}




public int insertcardet(loginsignup p)  {
    
  
    
   String base64Image = "";
   
   
  System.out.println("Image Data"+p.getFile().toString());
	//File file = new File(p.getFile().toString());
        File file = new File(p.getFile().toString());
        System.out.println("File"+file);
	try (FileInputStream imageInFile = new FileInputStream(file)) {
		// Reading a Image file from file system
		byte imageData[] = new byte[(int) file.length()];
		imageInFile.read(imageData);
		base64Image = Base64.getEncoder().encodeToString(imageData);
	} catch (FileNotFoundException e) {
		System.out.println("Image not found" + e);
	} catch (IOException ioe) {
		System.out.println("Exception while reading the Image " + ioe);
	}
 
         
	String sql="insert into car(name,price,average,color,noofcylinders,enginetype,cylinderarrangement,engineplacement,aspirations,valves,fueltype,coolant,enginelayout,drivewheels,transmission,model,cpic) values('"+p.getName()+"','"+p.getPrice()+"','"+p.getAverage()+"','"+p.getColor()+"','"+p.getNoofcylinders()+"','"+p.getEnginetype()+"','"+p.getCylinderarrangement()+"','"+p.getEngineplacement()+"','"+p.getAspirations()+"','"+p.getValves()+"','"+p.getFueltype()+"','"+p.getCoolant()+"','"+p.getEnginelayout()+"','"+p.getDrivewheels()+"','"+p.getTransmission()+"','"+p.getModel()+"','"+base64Image+"')";
	return template.update(sql);

}

     public int insertbikedet(loginsignup p)
{
    String base64Image = "";
   
	File file = new File(p.getFile().toString());
        
	try (FileInputStream imageInFile = new FileInputStream(file)) {
		// Reading a Image file from file system
		byte imageData[] = new byte[(int) file.length()];
		imageInFile.read(imageData);
		base64Image = Base64.getEncoder().encodeToString(imageData);
	} catch (FileNotFoundException e) {
		System.out.println("Image not found" + e);
	} catch (IOException ioe) {
		System.out.println("Exception while reading the Image " + ioe);
	}
 
	String sql="insert into bike(makemodel,year,engine,capacity,borexstroke,coolingsystem,compressionratio,lubrication,induction,ignition,vstarting,maxpower,maxtorque,clutch,transmission,finaldrive,frame,frontsuspension,frontwheeltravel,frontbrakes,rearbrakes,fronttyre,reartyre,steering,wheelbase,groundclearance,seatheight,dryweight,fuelcapacity,bike_image) values('"+p.getMakemodel()+"','"+p.getYear()+"','"+p.getEngine()+"','"+p.getCapacity()+"','"+p.getBorexstroke()+"','"+p.getCoolingsystem()+"','"+p.getCompressionratio()+"','"+p.getLubrication()+"','"+p.getInduction()+"','"+p.getIgnition()+"','"+p.getVstarting()+"','"+p.getMaxpower()+"','"+p.getMaxtorque()+"','"+p.getClutch()+"','"+p.getTransmission()+"','"+p.getFinaldrive()+"','"+p.getFrame()+"','"+p.getFrontsuspension()+"','"+p.getFrontwheeltravel()+"','"+p.getFrontbrakes()+"','"+p.getRearbrakes()+"','"+p.getFronttyre()+"','"+p.getReartyre()+"','"+p.getSteering()+"','"+p.getWheelbase()+"','"+p.getGroundclearance()+"','"+p.getSeatheight()+"','"+p.getDryweight()+"','"+p.getFuelcapacity()+"','"+base64Image+"')";
	return template.update(sql);
}
public  List<loginsignup> getCars(){
	return template.query("select * from car",new RowMapper<loginsignup>(){
		public loginsignup mapRow(ResultSet rs, int row) throws SQLException {
                    
               loginsignup e=new loginsignup();
        //System.out.println(rs.getBlob(18));
          
         

       
             e.setVehicleno(rs.getInt(1));
		e.setName(rs.getString(2));
		e.setPrice(rs.getString(3));
	        e.setAverage(rs.getString(4));
                e.setColor(rs.getString(5));
                e.setNoofcylinders(rs.getString(6));
                e.setEnginetype(rs.getString(7));
                e.setCylinderarrangement(rs.getString(8));
                e.setEngineplacement(rs.getString(9));
                e.setAspirations(rs.getString(10));
                e.setValves(rs.getString(11));
                e.setFueltype(rs.getString(12));
                e.setCoolant(rs.getString(13));
                e.setEnginelayout(rs.getString(14));
                e.setDrivewheels(rs.getString(15));
		e.setTransmission(rs.getString(16));
                e.setModel(rs.getString(17));
                    //System.out.println(e);
                
                e.setImg(rs.getString(18));
               //e.setImage(rs.getString(18));
                System.out.println(rs.getString(18));
                return e;
		}
                
	});
}
                
                
                            
public List<loginsignup> getBike(){
	return template.query("select * from bike",new RowMapper<loginsignup>(){
		public loginsignup mapRow(ResultSet rs, int row) throws SQLException {
		loginsignup e=new loginsignup();
		e.setBikeno(rs.getInt(1));
		e.setMakemodel(rs.getString(2));
		e.setYear(rs.getString(3));
	        e.setEngine(rs.getString(4));
                e.setCapacity(rs.getString(5));
                e.setBorexstroke(rs.getString(6));
                e.setCoolingsystem(rs.getString(7));
                e.setCompressionratio(rs.getString(8));
                e.setLubrication(rs.getString(9));
                e.setInduction(rs.getString(10));
                e.setIgnition(rs.getString(11));
                e.setVstarting(rs.getString(12));
                e.setMaxpower(rs.getString(13));
                e.setMaxtorque(rs.getString(14));
                e.setClutch(rs.getString(15));
		e.setTransmission(rs.getString(16));
                e.setFinaldrive(rs.getString(17));
                e.setFrame(rs.getString(18));
                e.setFrontsuspension(rs.getString(19));
                e.setFrontwheeltravel(rs.getString(20));
                e.setFrontbrakes(rs.getString(21));
                e.setRearbrakes(rs.getString(22));
                e.setFronttyre(rs.getString(23));
                e.setReartyre(rs.getString(24));
                e.setSteering(rs.getString(25));
                e.setWheelbase(rs.getString(26));
                e.setGroundclearance(rs.getString(27));
                e.setSeatheight(rs.getString(28));
                e.setDryweight(rs.getString(29));
                e.setFuelcapacity(rs.getString(30));
e.setImg(rs.getString(31));
               //e.setImage(rs.getString(18));
               // System.out.println(rs.getString(31));                
                
                
                
                
                
                return e;
		}
	});
}
public List<loginsignup> selectbike(String makemodel){
	return template.query("select * from bike where makemodel='"+makemodel+"'",new RowMapper<loginsignup>(){
		public loginsignup mapRow(ResultSet rs, int row) throws SQLException {
		loginsignup e=new loginsignup();
		e.setBikeno(rs.getInt(1));
		e.setMakemodel(rs.getString(2));
		e.setYear(rs.getString(3));
	        e.setEngine(rs.getString(4));
                e.setCapacity(rs.getString(5));
                e.setBorexstroke(rs.getString(6));
                e.setCoolingsystem(rs.getString(7));
                e.setCompressionratio(rs.getString(8));
                e.setLubrication(rs.getString(9));
                e.setInduction(rs.getString(10));
                e.setIgnition(rs.getString(11));
                e.setVstarting(rs.getString(12));
                e.setMaxpower(rs.getString(13));
                e.setMaxtorque(rs.getString(14));
                e.setClutch(rs.getString(15));
		e.setTransmission(rs.getString(16));
                e.setFinaldrive(rs.getString(17));
                e.setFrame(rs.getString(18));
                e.setFrontsuspension(rs.getString(19));
                e.setFrontwheeltravel(rs.getString(20));
                e.setFrontbrakes(rs.getString(21));
                e.setRearbrakes(rs.getString(22));
                e.setFronttyre(rs.getString(23));
                e.setReartyre(rs.getString(24));
                e.setSteering(rs.getString(25));
                e.setWheelbase(rs.getString(26));
                e.setGroundclearance(rs.getString(27));
                e.setSeatheight(rs.getString(28));
                e.setDryweight(rs.getString(29));
                e.setFuelcapacity(rs.getString(30));
e.setImg(rs.getString(31));
               //e.setImage(rs.getString(18));
               // System.out.println(rs.getString(31));                
                
                
                
                
                
                return e;
		}
	});
}



public List<loginsignup> getCustomers(){
	return template.query("select * from custdet ",new RowMapper<loginsignup>(){
		public loginsignup mapRow(ResultSet rs, int row) throws SQLException {
		loginsignup e=new loginsignup();
		e.setId(rs.getInt(1));
		e.setUsername(rs.getString(2));
		e.setPassword(rs.getString(3));
	        e.setAddress(rs.getString(4));
                e.setMobileno(rs.getString(5));
                e.setEmail(rs.getString(6));
                e.setGender(rs.getString(7));
                e.setAge(rs.getString(8));
                e.setPincode(rs.getString(9));
                return e;
		}
	});
}



public int update(loginsignup p){
	String sql="update car set name='"+p.getName()+"',price='"+p.getPrice()+"',average='"+p.getAverage()+"',color='"+p.getColor()+"',noofcylinders='"+p.getNoofcylinders()+"',enginetype='"+p.getEnginetype()+"',cylinderarrangement='"+p.getCylinderarrangement()+"',engineplacement='"+p.getEngineplacement()+"',aspirations='"+p.getAspirations()+"',valves='"+p.getValves()+"',fueltype='"+p.getFueltype()+"',coolant='"+p.getCoolant()+"',enginelayout='"+p.getEnginelayout()+"',drivewheels='"+p.getDrivewheels()+"',transmission='"+p.getTransmission()+"',model='"+p.getModel()+"' where vehicleno="+p.getVehicleno()+"";
	return template.update(sql);
}


public int updatecusdet(loginsignup p){
	String sql="update custdet set username='"+p.getUsername()+"',password='"+p.getPassword()+"',address='"+p.getAddress()+"',mobileno='"+p.getMobileno()+"',email='"+p.getEmail()+"',gender='"+p.getGender()+"',age='"+p.getAge()+"',pincode='"+p.getPincode()+"' where id="+p.getId()+"";
	return template.update(sql);
}



public int delete(int vehicleno){
	String sql="delete from car where vehicleno="+vehicleno+"";
	return template.update(sql);
}

public int deletecus(int id){
	String sql="delete from custdet where id="+id+"";
	return template.update(sql);
}



public loginsignup getCarById(int vehicleno){
	String sql="select * from car where vehicleno=?";
	return template.queryForObject(sql, new Object[]{vehicleno},new BeanPropertyRowMapper<loginsignup>(loginsignup.class));
}
public int updatebike(loginsignup p){
	String sql="update bike set makemodel='"+p.getMakemodel()+"',year='"+p.getYear()+"',engine='"+p.getEngine()+"',capacity='"+p.getCapacity()+"',borexstroke='"+p.getBorexstroke()+"',coolingsystem='"+p.getCoolingsystem()+"',compressionratio='"+p.getCompressionratio()+"',lubrication='"+p.getLubrication()+"',induction='"+p.getInduction()+"',ignition='"+p.getIgnition()+"',vstarting='"+p.getVstarting()+"',maxpower='"+p.getMaxpower()+"',maxtorque='"+p.getMaxtorque()+"',clutch='"+p.getClutch()+"',transmission='"+p.getTransmission()+"',finaldrive='"+p.getFinaldrive()+"',frame='"+p.getFrame()+"',frontsuspension='"+p.getFrontsuspension()+"',frontwheeltravel='"+p.getFrontwheeltravel()+"',frontbrakes='"+p.getFrontbrakes()+"',rearbrakes='"+p.getRearbrakes()+"',fronttyre='"+p.getFronttyre()+"',reartyre='"+p.getReartyre()+"',steering='"+p.getSteering()+"',wheelbase='"+p.getWheelbase()+"',groundclearance='"+p.getGroundclearance()+"',seatheight='"+p.getSeatheight()+"',dryweight='"+p.getDryweight()+"',fuelcapacity='"+p.getFuelcapacity()+"' where bikeno="+p.getBikeno()+"";
	return template.update(sql);
}

public int deletebike(int bikeno){
	String sql="delete from bike where bikeno="+bikeno+"";
	return template.update(sql);
}
public loginsignup getBikeById(int bikeno){
	String sql="select * from bike where bikeno=?";
	return template.queryForObject(sql, new Object[]{bikeno},new BeanPropertyRowMapper<loginsignup>(loginsignup.class));
}

public loginsignup getCusById(int id){
	String sql="select * from custdet where id=?";
	return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<loginsignup>(loginsignup.class));
}
public List<loginsignup> scar(int vehicleno){
	return template.query("select * from car where vehicleno = "+vehicleno+"",new RowMapper<loginsignup>(){
		public loginsignup mapRow(ResultSet rs, int row) throws SQLException {
		loginsignup e=new loginsignup();
		e.setVehicleno(rs.getInt(1));
		e.setName(rs.getString(2));
		e.setPrice(rs.getString(3));
	        e.setAverage(rs.getString(4));
                e.setColor(rs.getString(5));
                e.setNoofcylinders(rs.getString(6));
                e.setEnginetype(rs.getString(7));
                e.setCylinderarrangement(rs.getString(8));
                e.setEngineplacement(rs.getString(9));
                e.setAspirations(rs.getString(10));
                e.setValves(rs.getString(11));
                e.setFueltype(rs.getString(12));
                e.setCoolant(rs.getString(13));
                e.setEnginelayout(rs.getString(14));
                e.setDrivewheels(rs.getString(15));
		e.setTransmission(rs.getString(16));
		e.setModel(rs.getString(17));
                 e.setImg(rs.getString(18));
                return e;
		}
	});
}
public List<loginsignup> selectcar(String name){
	return template.query("select * from car where name = '"+name+"'",new RowMapper<loginsignup>(){
		public loginsignup mapRow(ResultSet rs, int row) throws SQLException {
		loginsignup e=new loginsignup();
		e.setVehicleno(rs.getInt(1));
		e.setName(rs.getString(2));
		e.setPrice(rs.getString(3));
	        e.setAverage(rs.getString(4));
                e.setColor(rs.getString(5));
                e.setNoofcylinders(rs.getString(6));
                e.setEnginetype(rs.getString(7));
                e.setCylinderarrangement(rs.getString(8));
                e.setEngineplacement(rs.getString(9));
                e.setAspirations(rs.getString(10));
                e.setValves(rs.getString(11));
                e.setFueltype(rs.getString(12));
                e.setCoolant(rs.getString(13));
                e.setEnginelayout(rs.getString(14));
                e.setDrivewheels(rs.getString(15));
		e.setTransmission(rs.getString(16));
		e.setModel(rs.getString(17));
                 e.setImg(rs.getString(18));
                return e;
		}
	});
}
public List<loginsignup> sbike(int bikeno){
	return template.query("select * from bike where bikeno="+bikeno+"",new RowMapper<loginsignup>(){
		public loginsignup mapRow(ResultSet rs, int row) throws SQLException {
		loginsignup e=new loginsignup();
		e.setBikeno(rs.getInt(1));
		e.setMakemodel(rs.getString(2));
		e.setYear(rs.getString(3));
	        e.setEngine(rs.getString(4));
                e.setCapacity(rs.getString(5));
                e.setBorexstroke(rs.getString(6));
                e.setCoolingsystem(rs.getString(7));
                e.setCompressionratio(rs.getString(8));
                e.setLubrication(rs.getString(9));
                e.setInduction(rs.getString(10));
                e.setIgnition(rs.getString(11));
                e.setVstarting(rs.getString(12));
                e.setMaxpower(rs.getString(13));
                e.setMaxtorque(rs.getString(14));
                e.setClutch(rs.getString(15));
		e.setTransmission(rs.getString(16));
                e.setFinaldrive(rs.getString(17));
                e.setFrame(rs.getString(18));
                e.setFrontsuspension(rs.getString(19));
                e.setFrontwheeltravel(rs.getString(20));
                e.setFrontbrakes(rs.getString(21));
                e.setRearbrakes(rs.getString(22));
                e.setFronttyre(rs.getString(23));
                e.setReartyre(rs.getString(24));
                e.setSteering(rs.getString(25));
                e.setWheelbase(rs.getString(26));
                e.setGroundclearance(rs.getString(27));
                e.setSeatheight(rs.getString(28));
                e.setDryweight(rs.getString(29));
                e.setFuelcapacity(rs.getString(30));
                e.setImg(rs.getString(31));
                return e;
		}
	});
}




public  List<loginsignup> getcarspec(loginsignup p){
    
    //int a= Integer.parseInt(p.getPrice());
   // if(a<=300000 || a>=300000 && a<=400000 || a>=400000 && a<=600000 || a>=600000 && a<=700000 || a>=700000 && a<=1000000 || a>=1000000 && a<=2000000 || a>=2000000 && a<=5000000 || a>=5000000 )
	        return template.query("select * from car where price = '"+p.getPrice()+"' and name='"+p.getName()+"' and fueltype='"+p.getFueltype()+"' and enginetype='"+p.getEnginetype()+"' and transmission='"+p.getTransmission()+"'",new RowMapper<loginsignup>()
                
        {
		public loginsignup mapRow(ResultSet rs, int row) throws SQLException {
                    
               loginsignup e=new loginsignup();
               
                       
    
                    
             e.setVehicleno(rs.getInt(1));
		e.setName(rs.getString(2));
		e.setPrice(rs.getString(3));
	        e.setAverage(rs.getString(4));
                e.setColor(rs.getString(5));
                e.setNoofcylinders(rs.getString(6));
                e.setEnginetype(rs.getString(7));
                e.setCylinderarrangement(rs.getString(8));
                e.setEngineplacement(rs.getString(9));
                e.setAspirations(rs.getString(10));
                e.setValves(rs.getString(11));
                e.setFueltype(rs.getString(12));
                e.setCoolant(rs.getString(13));
                e.setEnginelayout(rs.getString(14));
                e.setDrivewheels(rs.getString(15));
		e.setTransmission(rs.getString(16));
                e.setModel(rs.getString(17));
                //e.setImg(image);
                //System.out.println(e);
                return e;
		}
                
	});
  
}

public int buycar(loginsignup p){
	String sql="insert into vehselected(customerid,vehicleid) values('"+p.getEmail()+"','"+p.getVehicleno()+"')";
	return template.update(sql);
}
public int buybike1(loginsignup p){
	String sql="insert into bikeselected(customerid,bikeid) values('"+p.getEmail()+"','"+p.getBikeno()+"')";
	return template.update(sql);
}


public List<loginsignup> showsvbc(){
	return template.query("select * from vehselected ",new RowMapper<loginsignup>(){
		public loginsignup mapRow(ResultSet rs, int row) throws SQLException {
		loginsignup e=new loginsignup();
                e.setEmail(rs.getString(1));
		e.setVehicleno(rs.getInt(2));
		
                return e;
		}
	});
        
        
}
public List<loginsignup> showsbbc(){
	return template.query("select * from bikeselected ",new RowMapper<loginsignup>(){
		public loginsignup mapRow(ResultSet rs, int row) throws SQLException {
		loginsignup e=new loginsignup();
                e.setEmail(rs.getString(1));
		e.setBikeno(rs.getInt(2));
		
                return e;
		}
	});
}



}
/*public int update(loginsignup p){
	String sql="update car set name='"+p.getName()+"','"+p.getPrice()+"','"+p.getAverage()+"','"+p.getColor()+"','"+p.getNoofcylinders()+"','"+p.getEnginetype()+"','"+p.getCylinderarrangement()+"','"+p.getEngineplacement()+"','"+p.getAspirations()+"','"+p.getValves()+"','"+p.getFueltype()+"','"+p.getCoolant()+"','"+p.getEnginelayout()+"','"+p.getDrivewheels()+"','"+p.getTransmission()+"' where vehicleno="+p.getVehicleno()+"";
	return template.update(sql);
}


/*public int delete(int id){
	String sql="delete from Emp99 where id="+id+"";
	return template.update(sql);
}
public loginsignup getEmpById(int id){
	String sql="select * from Emp99 where id=?";
	return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<loginsignup>(loginsignup.class));
}
public List<loginsignup> getEmployees(){
	return template.query("select * from Emp99",new RowMapper<loginsignup>(){
		public loginsignup mapRow(ResultSet rs, int row) throws SQLException {
		loginsignup e=new loginsignup();
		e.setId(rs.getInt(1));
		e.setName(rs.getString(2));
		e.setSalary(rs.getFloat(3));
	e.setDesignation(rs.getString(4));
			return e;
		}
	});
}*/
