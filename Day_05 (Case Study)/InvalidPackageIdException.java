class InvalidPackageIdException extends Exception{
    public InvalidPackageIdException(String message) {
        super(message);
    }

    public static void printMessage(){
        System.out.println("(Message : Invalid Package Id)");
    }

    @Override
    public String toString() {
        return "InvalidPackageIdException";
    }
}