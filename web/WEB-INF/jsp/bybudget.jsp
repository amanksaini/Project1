    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
  
<form:form method="post" action="bbudget">  	
	        
		
	        

    
      &nbsp;&nbsp;
      <br>
      <br>
            <select>
                <option default>Select make</option>
            <c:forEach var="emp" items="${list}"> 
    <option value="make">${emp.name}</option>
                                   
    </c:forEach>
      </select>
    <input type="submit" value="SEARCH CAR" />
   
</form:form>







 
    
            
   

    
      



