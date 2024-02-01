package interface2;

public class PhoneUser {
    
    private phone phone;

    public PhoneUser(phone phone) {
        this.phone = phone;
    }

    void turnOnThePhone() {
        this.phone.powerOn();
    }

    void turnOffThePhone() {
        this.phone.powerOff();
    }

    void increaseVolume() {
        this.phone.volumeUp();
    }

    void decreaseVolume() {
        this.phone.volumeDown();
    }
}
