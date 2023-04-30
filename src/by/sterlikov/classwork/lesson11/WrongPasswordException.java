package by.sterlikov.classwork.lesson11;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(){

    }
    public WrongPasswordException(String message){
        super(message);
    }
}
