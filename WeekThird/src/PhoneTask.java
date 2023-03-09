public class PhoneTask {
    // main method, program execution starts from here
    public static void main(String[] args) {
        //creating object of smartphone class
        smartPhone samsung = new smartPhone();
        // calling methods
        // calling phone class methods
        samsung.call();
        samsung.sms();
        System.out.println();

        // calling camera methods
        samsung.click();
        samsung.record();
        System.out.println();

        // calling musicPlayer methods
        samsung.play();
        samsung.stop();
        System.out.println();

    }
}

// // creating phone interface
 class phone {
    void call() {
        System.out.println("Calling....");
        System.out.println("Call connected.");
    }

    void sms() {
        System.out.println("Sending SMS....");
        System.out.println("SMS Send.");
    }

}

// creating camera interface
interface camera {
    abstract void click();
    abstract void record();
}

// creating music player interface
interface musicPlayer {
    abstract void play();
    abstract void stop();
}

// creating smartPhone class
class smartPhone extends phone implements camera,musicPlayer {
    // implementing music player methods
    @Override
    public void play() {
        System.out.println("Music Playing.");
    }

    @Override
    public void stop() {
        System.out.println("Music Stopped.");
    }

    // implementing camera interface methods
    @Override
    public void click() {
        System.out.println("Picture Clicked.");
    }

    @Override
    public void record() {
        System.out.println("Recording started....");
        System.out.println("Recording Stopped.");
    }



}