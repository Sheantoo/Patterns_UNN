public class ReceivingRequest implements StorageRequest {

    @Override
    public void doRequest() {
        System.out.println("Processing request");
    }
}