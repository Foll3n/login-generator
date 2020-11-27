package geco;

import java.util.Random;

public class PasswordGeneration {
    private String randomPassword;
    private int NB_CRACRTERES = 8;

    public void generatePWD(){
        StringBuilder res= new StringBuilder();
        int tmp;
        String test = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ12345678#~[]@^/!;.:?9*$=)àç_è-('&";
        for (int i=0;i<NB_CRACRTERES;i++){
            tmp = new Random().nextInt(test.length());
            res.append(test.charAt(tmp));
        }
        randomPassword = res.toString();
    }
    public PasswordGeneration(){
        this.generatePWD();

    }

    /**
     *
     * @return
     */
    public String getRandomPassword(){
        return this.randomPassword;
    }
}
