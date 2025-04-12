public class Main {
    public static void main(String[] args) {
        WebHelper helper = WebHelper.getInstance();

        String content = helper.getWebSiteContent();
        System.out.println("OUR CONTENT:\n");
        System.out.println(content);
    }
}