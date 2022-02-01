class CustomException extends Exception {
    private final String message;

    public CustomException(String message) {
        super(message, null, false, false);
        this.message = message;
    }


    public String getMessage() {
        return message;
    }

    public String toStringMessage() {
        return "CustomException";
    }
}

class Question12 {
    public static void main(String[] args) {
        try {
            throw new CustomException("this is custom exception");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toStringMessage());
            e.printStackTrace();
        }
    }
}

