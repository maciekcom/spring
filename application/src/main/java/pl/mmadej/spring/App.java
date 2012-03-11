package pl.mmadej.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.System.currentTimeMillis;

public class App {

    private String targetDestination;

    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        App app = context.getBean(App.class);
        app.start();
    }

    private void start() throws InterruptedException {
        while (true) {
            Thread.sleep((long) (1000+(Math.random()*1000)));
            System.out.println("Running [" + currentTimeMillis() + "] on destination: "
                    + targetDestination);
        }
    }

    public void setTargetDestination(String targetDestination) {
        this.targetDestination = targetDestination;
    }
}
