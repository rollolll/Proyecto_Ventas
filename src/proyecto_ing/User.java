/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_ing;

/**
 *
 * @author Jorge
 */
public class User {

private int id;
private String username,password;

public User(int id,String username,String password){
     this.id=id;
     this.username=username;
     this.password=password;
     
    
}


public int getid(){
  return id;  
}
public String getusername(){
  return username;  
}

public String getpassword(){
  return password;  
  
}
User(int aInt) {
        throw new UnsupportedOperationException("No compatible.");
    }

}
