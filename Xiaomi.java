package interface2;

public class Xiaomi implements phone {
    
    private int volume = 50;
    private boolean isPowenOn;

    public Xiaomi() {
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        this.isPowenOn = true;
        System.out.println("Handphone menyala... ");
        System.out.println("Selamat datang di Xiaomi!! ");
        System.out.println("Android version 99");
    }

    @Override
    public void powerOff() {
        this.isPowenOn = false;
        System.out.println("Handphone dimatikan...");
    }

    @Override
    public void volumeUp() {
        if (isPowenOn) {
            if (this.volume == MaxVolume) {
                System.out.println("Volume telah maksimal");
                System.out.println("volume " + this.getVolume());
            } else {
                this.volume += 10;
                System.out.println("volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan dulu Hp nya kocak");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowenOn) {
            if (this.volume == MinVolume) {
                System.out.println("Volume: 0");
            } else {
                this.volume -= 10;
                System.out.println("volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan dulu Hp nya kocak");
        }
    }

    public int getVolume() {
        return this.volume;
    }
}   
