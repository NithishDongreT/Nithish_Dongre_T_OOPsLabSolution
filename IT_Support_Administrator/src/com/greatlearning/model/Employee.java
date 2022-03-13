package com.greatlearning.model;

public class Employee {
	private String First_Emp_name;
	private String Last_Emp_name;
    private String Dept_Name;
	private String Email;
    
    public Employee(String First_name,String Last_name){
    	this.First_Emp_name = First_name;
    	this.Last_Emp_name = Last_name;
    }

    
    
 // function to generate a random string of length n
    public String getAlphaNumericString(int n)
    {

        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"
                                    + "!@#$%^&*()?/.>,<;:{[}]-_+=";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                = (int)(AlphaNumericString.length()
                        * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                          .charAt(index));
        }

        return sb.toString();
    }
    
    public String generate_email_address (String First_name, String Last_Name, String Dept_Name) {
		this.Email = First_name + Last_Name + "@" + Dept_Name + ".abc.com";
    	return this.Email;
    }
    
    
	/**
	 * @return the first_Emp_name
	 */
	public synchronized String getFirst_Emp_name() {
		return First_Emp_name;
	}

	/**
	 * @param this.first_Emp_name the this.first_Emp_name to set
	 */
	public synchronized void setFirst_Emp_name(String first_Emp_name) {
		this.First_Emp_name = first_Emp_name;
	}

	/**
	 * @return the last_Emp_name
	 */
	public synchronized String getLast_Emp_name() {
		return Last_Emp_name;
	}

	/**
	 * @param this.last_Emp_name the this.last_Emp_name to set
	 */
	public synchronized void setLast_Emp_name(String last_Emp_name) {
		this.Last_Emp_name = last_Emp_name;
	}

	/**
	 * @return the dept_Name
	 */
	public synchronized String getDept_Name() {
		return Dept_Name;
	}

	/**
	 * @param this.dept_Name the this.dept_Name to set
	 */
	public synchronized void setDept_Name(String dept_Name) {
		this.Dept_Name = dept_Name;
	}



	@Override
	public String toString() {
		return "Employee []";
	}
    
	
    
}
