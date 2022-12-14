package DataTransferObject;

public class MachineSpecificationsDTO {
    private int rotorsCount;
    private int rotorsInUseAmount;
    private int reflectorAmount;
    private int decryptedMessagesAmount;

    public MachineSpecificationsDTO(int rotorsCount, int rotorsInUseAmount, int reflectorAmount, int decryptedMessagesAmount ){
        this.rotorsCount = rotorsCount;
        this.rotorsInUseAmount = rotorsInUseAmount;
        this.reflectorAmount = reflectorAmount;
        this.decryptedMessagesAmount = decryptedMessagesAmount; }

    public int getRotorsAmount() { return rotorsCount; }
    public int getRotorsInUseAmount() { return rotorsInUseAmount; }
    public int getReflectorAmount() { return reflectorAmount; }
    public int getDecryptedMessagesAmount() { return decryptedMessagesAmount; }
}
