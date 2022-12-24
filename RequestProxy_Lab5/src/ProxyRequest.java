public class ProxyRequest implements StorageRequest {
    private ReceivingRequest receivingRequest;

    private void printTimeWithPrefix(String prefix) {
        java.util.Date currentDate = new java.util.Date();
        System.out.println(prefix + currentDate.toString());
    }
    @Override
    public void doRequest() {
        startRequest();
        if (receivingRequest == null) {
            receivingRequest = new ReceivingRequest();
        }
        try {
            Thread.sleep(1500);
        }
        catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        receivingRequest.doRequest();
        endRequest();
    }
    private void startRequest() {
        printTimeWithPrefix("Operation started: ");
    }
    private void endRequest() {
        printTimeWithPrefix("Operation completed: ");
    }


}
