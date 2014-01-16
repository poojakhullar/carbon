<%@page import="com.project.code.BeanForm3"%>
<%@page import="com.project.code.BeanForm2"%>
<%@page import="com.project.code.BeanForm1"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
BeanForm1 beanA;
beanA = (BeanForm1)session.getAttribute("b1");
BeanForm2 beanB;
beanB = (BeanForm2)session.getAttribute("b2");
BeanForm3 beanC;
beanC = (BeanForm3)session.getAttribute("b3");
 %>
 <h1>Following are the selected carbon values:</h1>
 <table border="1">
 <tr>
 <th>Type</th>
 <th>Carbon Value</th>
 <th>Type</th>
 <th>Carbon Value</th>
 </tr>
 <tr>
 <td>Land Prep</td>
 <td><%=beanA.getLandPrep()%></td>
 <td>Land Prep:Stubble Disc 1X</td>
 <td><%=beanA.getStubble()%></td>
 </tr>
 <tr>
 <td>Land Prep:Disc & Float 2X</td>
 <td><%=beanA.getDisc()%></td>
 <td>Trees:135 Per Acre</td>
 <td><%=beanA.getAcre()%></td>
 </tr>
 <tr>
 <td>Plant:Survey</td>
 <td><%=beanA.getSurvey()%></td>
 <td>Train</td>
 <td><%=beanB.getTrain()%></td>
 </tr>
 <tr>
 <td>Prune</td>
 <td><%=beanB.getPrune()%></td>
 <td>Disk Prunning</td>
 <td><%=beanB.getDisc()%></td>
 </tr>
 <td>Boron emitters</td>
 <td><%=beanB.getEmitters()%></td>
 <td>Copper defoliation</td>
 <td><%=beanB.getCopper()%></td>
 </tr>
 <td>Prune:Hand</td>
 <td><%=beanC.getHand()%></td>
 <td>Brush:Stack</td>
 <td><%=beanC.getBrush()%></td>
 </tr>
 <td>Pole</td>
 <td><%=beanC.getPole()%></td>
 <td>Rake</td>
 <td><%=beanC.getRake()%></td>
 </tr>
 <td>Blow</td>
 <td><%=beanC.getBlow()%></td>
 <td>Chop</td>
 <td><%=beanC.getChop()%></td>
 </tr>
 </table>
</body>
</html>