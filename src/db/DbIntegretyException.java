package db;

public class DbIntegretyException extends RuntimeException{
    private static final long serialVersiusUID =1L;

    public DbIntegretyException(String msg){
        super(msg);
    }
}
