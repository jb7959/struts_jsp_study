package com.emp;

import javax.naming.*;
import javax.sql.*;

public class EmpDAO {
	
	DataSource dataFactory;	
	
	try{
		Context ctx = new InitialContext();
		dataFactory = (DataSource) ctx.lookup("java:comp/env/jdbc/Oracle11g");
	}catch(NamingException e){
		e.printStackTrace();
	}
		
}
}
