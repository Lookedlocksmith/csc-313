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

//    public enum UserAuth {
//
//        ADMIN, ESTIMATOR, SCHEDULER;
 // NameInput = Username.getText();
//PassInput = txtPass.getText();

        String NameInput;
        String PassInput;

        public boolean Login() {

            if (PassInput.equals("Admin") && NameInput.equals("Admin")) {
                setLogin(true);
                return Login;
            } // lblDisplay.setText("Credentials Accepted.");
            else {
               setLogin(false);
               return Login;
 //   lblDisplay.setText("Please try again.");
            }
        }
    }

