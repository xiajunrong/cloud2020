public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("开始啦---");
        long initMemor = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        long maxMemor = Runtime.getRuntime().maxMemory() / 1024 / 1024;
        System.out.println("-Xms:" + initMemor + "m");
        System.out.println("-Xmx:" + maxMemor + "m");
        Thread.sleep(1000000);
    }

}


