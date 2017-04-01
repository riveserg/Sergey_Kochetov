package kochetov.exception;

/**
 * Created by Сергей on 01.04.2017.
 */
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException() {
        super("User is not found or is null");
    }
}
