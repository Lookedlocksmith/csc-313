/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tanner
 */
public class User extends Main {

  public static boolean Login;

    public static boolean isLogin() {
        return Login;
    }

    public static void setLogin(boolean Login) {
        User.Login = Login;
    }
    //NameInput = UserInput.getText();

//    public enum UserAuth {
//
//        ADMIN, ESTIMATOR, SCHEDULER;
 // NameInput = Username.getText();
//PassInput = txtPass.getText();

        String NameInput;
        String PassInput;

    public String getNameInput() {
        return NameInput;
    }

    public void setNameInput(String NameInput) {
        this.NameInput = NameInput;
    }

    public String getPassInput() {
        return PassInput;
    }

    public void setPassInput(String PassInput) {
        this.PassInput = PassInput;
    }
        

        public static boolean Login(String NameInput, String PassInput) {
          
            if (PassInput.equals("Admin") && NameInput.equals("Admin")) {
                Login = true;
                return Login;
            } else {
               Login = false;
               return Login;
 
            }
        }
    }

