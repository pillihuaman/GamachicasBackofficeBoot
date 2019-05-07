    <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%> 
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
    <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"    
    "http://www.w3.org/TR/html4/loose.dtd">    
    <html>    
    <head>    
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">    
    <title><tiles:insertAttribute name="title" ignore="true" /></title> 
      <meta name="viewport" content="width=device-with, initial-scale=1.0"/>
      
    <link href="<c:url value='/static/css/bootstrap.css' />"  rel="stylesheet"></link>
 
      
 <link href="<c:url value="/static/css/bootstrap.css" />" rel="stylesheet">   
 <link href="<c:url value="/static/css/team.css" />" rel="stylesheet">   
 <link href="<c:url value="/static/css/style.css" />" rel="stylesheet">   
 <link href="<c:url value="/static/css/jquery-ui.css" />" rel="stylesheet">   
 <link href="<c:url value="/static/css/font-awesome.css" />" rel="stylesheet">   
 <link href="<c:url value="/static/css/flexslider.css" />" rel="stylesheet">   
 <link href="<c:url value="/static/css/easy-responsive-tabs.css" />" rel="stylesheet">   


    </head>    
    <body>    
            <div><tiles:insertAttribute name="header" /></div>    
              
            <div style="float:left;padding:10px;width:80%;border-left:1px solid pink;">    
            <tiles:insertAttribute name="body" /></div>    
            <div style="clear:both"><tiles:insertAttribute name="footer" /></div>    

   <script src="<c:url value="/static/js/jquery-2.1.4.min.js" />"></script>
       <script src="<c:url value="/static/js/jquery-ui.js" />"></script> 
   <script src="<c:url value="/static/js/bootstrap.js" />"></script>
   <script src="<c:url value="/static/js/easy-responsive-tabs.js" />"></script>
     <script src="<c:url value="/static/js/imagezoom.js" />"></script>
     <script src="<c:url value="/static/js/jquery.countup.js" />"></script>
     <script src="<c:url value="/static/js/jquery.easing.min.js" />"></script>
     <script src="<c:url value="/static/js/jquery.flexslider.js" />"></script>
    <script src="<c:url value="/static/js/jquery.waypoints.min.js" />"></script>  
     <script src="<c:url value="/static/js/responsiveslides.min.js" />"></script>  
    <script src="<c:url value="/static/js/minicart.min.js" />"></script>  
    <script src="<c:url value="/static/js/modernizr.custom.js" />"></script>  
    <script src="<c:url value="/static/js/move-top.js" />"></script>  

    
    
    </body>    
    </html>    