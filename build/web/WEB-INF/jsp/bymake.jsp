    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

	<form:form method="post" action="bmake">  	
	        
<select name="name">
    
       <option default path = "name" value="selectmake">Select Make</option>     
    
    <c:forEach var="emp" items="${list}"> 
    <option path ="name" value="${emp.name}">${emp.name}</option>
                                   
    </c:forEach>
      </select>&nbsp;&nbsp;
            
      
      <select name ="model">
       
          <option default path = "model" value="selectmodel">Select Model</option>
        <c:forEach var="emp" items="${list}"> 
    
            <option path ="model" value="${emp.model}">${emp.model}</option>
                                   
    </c:forEach>
      </select>
      <br><br>
      <input type="submit" value="SHOW" />
        </form:form>
   
        







 
    
            
   

    
      



